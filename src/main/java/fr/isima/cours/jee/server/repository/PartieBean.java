package fr.isima.cours.jee.server.repository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PARTIE")
public class PartieBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idgrille")
    private Integer idgrille;

    @Column(name = "idjoueur1")
    private Integer idjoueur1;

    @Column(name = "idjoueur2")
    private Integer idjoueur2;

    @Column(name = "tourjoueur")
    private Integer tourjoueur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdgrille() {
        return idgrille;
    }

    public void setIdgrille(Integer idgrille) {
        this.idgrille = idgrille;
    }

    public Integer getIdjoueur1() {
        return idjoueur1;
    }

    public void setIdjoueur1(Integer idjoueur1) {
        this.idjoueur1 = idjoueur1;
    }

    public Integer getIdjoueur2() {
        return idjoueur2;
    }

    public void setIdjoueur2(Integer idjoueur2) {
        this.idjoueur2 = idjoueur2;
    }

    public Integer getTourjoueur() {
        return tourjoueur;
    }

    public void setTourjoueur(Integer tourjoueur) {
        this.tourjoueur = tourjoueur;
    }
}
