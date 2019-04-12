package fr.isima.cours.jee.server.business;

import fr.isima.cours.jee.server.model.Case;
import fr.isima.cours.jee.server.model.Grille;
import fr.isima.cours.jee.server.model.Joueur;
import fr.isima.cours.jee.server.repository.GrilleBean;
import fr.isima.cours.jee.server.repository.GrilleRepository;
import fr.isima.cours.jee.server.repository.JoueurBean;
import fr.isima.cours.jee.server.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JoueurService {
    private final JoueurRepository joueurRepository;

    @Autowired
    public JoueurService(JoueurRepository joueurRepository) {
        this.joueurRepository = joueurRepository;
    }

    public Integer save(Joueur j){
        final JoueurBean joueurBean = new JoueurBean();
        if(j.getId() != null){
            joueurBean.setId(j.getId());
        }
        joueurBean.setNickname(j.getNickname());
        joueurBean.setColour(j.getColour());
        Integer id = this.joueurRepository.save(joueurBean).getId();
        return id;
    }

    public Joueur findById(Integer joueurid){
        if(joueurRepository.existsById(joueurid)){
            return new Joueur(this.joueurRepository.findById(joueurid).get());
        }
        throw new IllegalArgumentException("No case found");
    }

}
