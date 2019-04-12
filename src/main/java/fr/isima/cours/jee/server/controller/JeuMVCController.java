package fr.isima.cours.jee.server.controller;

import fr.isima.cours.jee.server.business.PartieService;
import fr.isima.cours.jee.server.model.Grille;
import fr.isima.cours.jee.server.model.Joueur;
import fr.isima.cours.jee.server.model.Partie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class JeuMVCController {

    private final PartieService partieService;

    @Autowired
    public JeuMVCController(PartieService partieService) {
        this.partieService = partieService;
    }

    @GetMapping("/displayGrid")
    public ModelAndView displayGrid(){
        Partie partie = new Partie();
        partie.init();
        return new ModelAndView("grille","grille",partie.getGrille());
    }

}
