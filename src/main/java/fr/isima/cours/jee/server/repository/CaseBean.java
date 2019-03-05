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
    private Case.colour colour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Case.colour getColour() {
        return colour;
    }

    public void setColour(Case.colour colour) {
        this.colour = colour;
    }
}
