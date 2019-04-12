package fr.isima.cours.jee.server.business;

import fr.isima.cours.jee.server.model.Grille;
import fr.isima.cours.jee.server.model.Joueur;
import fr.isima.cours.jee.server.model.Partie;
import fr.isima.cours.jee.server.repository.JoueurBean;
import fr.isima.cours.jee.server.repository.JoueurRepository;
import fr.isima.cours.jee.server.repository.PartieBean;
import fr.isima.cours.jee.server.repository.PartieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PartieService {
    private final PartieRepository partieRepository;
    private final GrilleService grilleService;
    private final JoueurService joueurService;

    @Autowired
    public PartieService(PartieRepository partieRepository, GrilleService grilleService, JoueurService joueurService) {
        this.partieRepository = partieRepository;
        this.grilleService = grilleService;
        this.joueurService = joueurService;
    }

    public Integer save(Partie partie){
        final PartieBean pb = new PartieBean();
        if(partie.getId() != null){
            pb.setId(partie.getId());
        }
        pb.setTourjoueur(partie.getTourJoueur());
        pb.setIdgrille(grilleService.save(partie.getGrille()));
        pb.setIdjoueur1(joueurService.save(partie.getJ1()));
        pb.setIdjoueur2(joueurService.save(partie.getJ2()));

        return this.partieRepository.save(pb).getId();
    }

    public Partie findById(Integer partieid){
        if(partieRepository.existsById(partieid)){
            PartieBean pb = this.partieRepository.findById(partieid).get();
            Joueur j1 = this.joueurService.findById(pb.getIdjoueur1());
            Joueur j2 = this.joueurService.findById(pb.getIdjoueur2());
            Grille g = this.grilleService.findById(pb.getIdgrille());

            return new Partie(partieid, j1,j2,g,pb.getTourjoueur());

        }
        throw new IllegalArgumentException("No partie found");
    }

}
