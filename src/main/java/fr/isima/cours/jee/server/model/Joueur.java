package fr.isima.cours.jee.server.model;

import fr.isima.cours.jee.server.repository.JoueurBean;

public class Joueur {
    private Integer id;
    private String nickname;
    private Integer colour;

    public Joueur(Integer id, String nickname, Integer colour) {
        this.id = id;
        this.nickname = nickname;
        this.colour = colour;
    }

    public Joueur(JoueurBean joueurBean){
        this.id = joueurBean.getId();
        this.colour = joueurBean.getColour();
        this.nickname = joueurBean.getNickname();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getColour() {
        return colour;
    }

    public void setColour(Integer colour) {
        this.colour = colour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
