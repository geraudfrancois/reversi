package fr.isima.cours.jee.server.repository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CASE")
public class CaseBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


}
