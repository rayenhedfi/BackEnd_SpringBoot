package tn.actia.pfe.Pfe_App.Repo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Repertoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String description;

    @Enumerated(EnumType.STRING)
    private Visibility visibility;

    @Enumerated(EnumType.STRING)
    private RepositoryType type;

    public Repertoire(String nom, String description, Visibility visibility, RepositoryType type) {
        this.nom = nom;
        this.description = description;
        this.visibility = visibility;
        this.type = type;
    }
}
