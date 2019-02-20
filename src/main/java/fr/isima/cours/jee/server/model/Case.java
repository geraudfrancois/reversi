package fr.isima.cours.jee.server.model;

public class Case {
    public enum colour {BLANC, NOIR, VIDE};
    private int x;
    private int y;
    private colour content;

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
