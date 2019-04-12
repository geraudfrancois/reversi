package fr.isima.cours.jee.server.business;

import fr.isima.cours.jee.server.model.Case;
import fr.isima.cours.jee.server.model.Grille;
import fr.isima.cours.jee.server.model.Partie;
import fr.isima.cours.jee.server.repository.CaseBean;
import fr.isima.cours.jee.server.repository.CaseRepository;
import fr.isima.cours.jee.server.repository.GrilleBean;
import fr.isima.cours.jee.server.repository.GrilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GrilleService {
    private final GrilleRepository grilleRepository;
    private final CaseService caseService;

    @Autowired
    public GrilleService(CaseService caseService, GrilleRepository grilleRepository) {
        this.grilleRepository = grilleRepository;
        this.caseService = caseService;
    }

    public Integer save(Grille grille){
        final GrilleBean grilleBean = new GrilleBean();
        if(grille.getId()!=null){
            grilleBean.setId(grille.getId());
        }
        grilleBean.setTaille(grille.getTaille());
        Integer id = this.grilleRepository.save(grilleBean).getId();
        for(Integer i = 0; i < grille.getTaille(); ++i){
            for(Integer j = 0; j < grille.getTaille() ; ++j){
                grille.getGrid()[i][j].setIdGrille(id);
                caseService.save(grille.getGrid()[i][j]);
            }
        }
        return id;
    }

    public Grille findById(Integer grilleId){
        if(grilleRepository.existsById(grilleId)){
            Grille g = new Grille(this.grilleRepository.findById(grilleId).get());
            Integer taille = g.getTaille();
            Case [][] tab = new Case[taille][taille];
            for(Integer i = 0; i < taille; ++i){
                for(Integer j = 0; j < taille ; ++j){
                    tab[i][j] = caseService.position(i,j, grilleId);
                }
            }
            g.setGrid(tab);
            return g;
        }
        throw new IllegalArgumentException("No grille found");
    }

}
