package fr.isima.cours.jee.server.repository;

import fr.isima.cours.jee.server.model.Case;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CASE")
public class CaseBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "x")
    private Integer x;

    @Column(name = "y")
    private Integer y;

    @Column(name = "colour")
    private Integer colour;

    @Column(name = "idgrille")
    private Integer idgrille;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getColour() {
        return colour;
    }

    public void setColour(Integer colour) {
        this.colour = colour;
    }

    public Integer getIdgrille() {
        return idgrille;
    }

    public void setIdgrille(Integer idgrille) {
        this.idgrille = idgrille;
    }
}
