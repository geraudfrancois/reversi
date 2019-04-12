package fr.isima.cours.jee.server.model;

import fr.isima.cours.jee.server.repository.CaseBean;

public class Case {
    private Integer id;
    private Integer x;
    private Integer y;
    private Integer content;
    private Integer idGrille;

    public Case(Integer id, Integer x, Integer y, Integer content, Integer idGrille) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.content = content;
        this.idGrille = idGrille;
    }

    public Case(CaseBean cb) {
        this.id = cb.getId();
        this.x = cb.getX();
        this.y = cb.getY();
        this.content = cb.getColour();
        this.idGrille = cb.getIdgrille();

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getContent() {
        return content;
    }

    public Integer getIdgrille() { return idGrille; }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public void setIdGrille(Integer idGrille) {
        this.idGrille = idGrille;
    }

    public Integer getId(){
        return this.id;
    }
}
