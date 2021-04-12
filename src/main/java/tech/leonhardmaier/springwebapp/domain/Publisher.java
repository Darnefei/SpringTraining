package tech.leonhardmaier.springwebapp.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    public Publisher(String name) {
        this.name = name;
    }
}
