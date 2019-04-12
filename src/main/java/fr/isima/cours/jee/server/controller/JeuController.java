package fr.isima.cours.jee.server.controller;

import fr.isima.cours.jee.server.business.PartieService;
import fr.isima.cours.jee.server.model.Grille;
import fr.isima.cours.jee.server.model.Joueur;
import fr.isima.cours.jee.server.model.Partie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class JeuController {

    private final PartieService partieService;

    @Autowired
    public JeuController(PartieService partieService) {
        this.partieService = partieService;
    }

    @GetMapping("/init")
    public Partie init(){
        Partie p = new Partie();
        p.init();
        return p;
    }
}
