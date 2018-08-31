package com.axxes.colleagues.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Score> scores;
    @OneToOne
    @MapsId
    private Picture picture;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Score> getScores() {
        return scores;
    }

    public User setScores(List<Score> scores) {
        this.scores = scores;
        return this;
    }

    public Picture getPicture() {
        return picture;
    }

    public User setPicture(Picture picture) {
        this.picture = picture;
        return this;
    }
}
