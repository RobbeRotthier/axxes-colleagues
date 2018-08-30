package com.axxes.colleagues.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    @OneToMany
    private List<Score> scores;


}
