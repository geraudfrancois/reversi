package fr.isima.cours.jee.server.model;

import fr.isima.cours.jee.server.business.GrilleService;
import fr.isima.cours.jee.server.business.JoueurService;
import fr.isima.cours.jee.server.business.PartieService;
import fr.isima.cours.jee.server.repository.PartieBean;

public class Partie {
    private Integer id;
    private Joueur j1;
    private Joueur j2;
    private Grille grille;
    private Integer tourJoueur;

    private GrilleService gs;
    private JoueurService js;
    private PartieService ps;

    public Partie(){

    }

    public Partie(Integer id, Joueur j1, Joueur j2, Grille g, Integer tourJoueur){
        this.id = id;
        this.j1 = j1;
        this.j2 = j2;
        this.grille = g;
        this.tourJoueur = tourJoueur;
    }

    public Partie(PartieBean partieBean){
        this.id = partieBean.getId();
        this.j1 = js.findById(partieBean.getIdjoueur1());
        this.j2 = js.findById(partieBean.getIdjoueur2());
        this.grille = gs.findById(partieBean.getIdgrille());
        this.tourJoueur = partieBean.getTourjoueur();
    }

    public void init(){
        grille = new Grille(null,8);
        grille.initGrid();
        id = null;
        j1 = new Joueur(null, "j1", 1);
        j2 = new Joueur(null, "j2", 2);
        tourJoueur = 1;
        ps.save(this);
    }

    public void joue(Joueur j, Case c){

    }
    public Joueur getJ1() {
        return j1;
    }

    public void setJ1(Joueur j1) {
        this.j1 = j1;
    }

    public Joueur getJ2() {
        return j2;
    }

    public void setJ2(Joueur j2) {
        this.j2 = j2;
    }

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }

    public Integer getTourJoueur() {
        return tourJoueur;
    }

    public void setTourJoueur(Integer tourJoueur) {
        this.tourJoueur = tourJoueur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
