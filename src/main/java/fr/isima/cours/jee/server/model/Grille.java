package fr.isima.cours.jee.server.model;

public class Grille {
    private int taille;
    private Case[][] grid;

    public Case getContentCase(int x, int y){
        return grid[x][y].getContent();
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Case[][] getGrid() {
        return grid;
    }

    public void setGrid(Case[][] grid) {
        this.grid = grid;
    }
}
