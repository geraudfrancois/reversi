package fr.isima.cours.jee.server.model;

import fr.isima.cours.jee.server.repository.GrilleBean;

public class Grille {
    private Integer id;
    private Integer taille;
    private Case[][] grid;

    public Grille(Integer id, Integer taille){
        this.taille = taille;
        this.id = id;
    }

    public Grille(GrilleBean grilleBean){
        this.id = grilleBean.getId();
        this.taille = grilleBean.getTaille();
    }

    public Integer getContentCase(Integer x, Integer y){
        return grid[x][y].getContent();
    }

    public void initGrid(){
        grid = new Case[taille][taille];
        for(Integer i = 0; i < taille; ++i){
            for(Integer j = 0; j < taille ; ++j){
                grid[i][j] = new Case(null, i,j,0,id);
            }
        }
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Case[][] getGrid() {
        return grid;
    }

    public void setGrid(Case[][] grid) {
        this.grid = grid;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
