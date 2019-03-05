package fr.isima.cours.jee.server.model;

import fr.isima.cours.jee.server.repository.CaseBean;

public class Case {
    public enum colour {BLANC, NOIR, VIDE};
    private int x;
    private int y;
    private colour content;
    private CaseBean cb;

    public Case(int x, int y, colour content) {
        this.x = x;
        this.y = y;
        this.content = content;
    }

    public Case(CaseBean cb) {
        this.cb = cb;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public colour getContent() {
        return content;
    }

    public void setContent(colour content) {
        this.content = content;
    }
}
