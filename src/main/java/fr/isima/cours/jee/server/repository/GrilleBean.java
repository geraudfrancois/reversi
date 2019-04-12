package fr.isima.cours.jee.server.repository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "grille")
public class GrilleBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "taille")
    private Integer taille;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }
}
