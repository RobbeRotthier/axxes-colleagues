package com.axxes.colleagues.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Picture {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private byte[] content;
    @OneToOne
    private User user;

    public String getName() {
        return name;
    }

    public Picture setName(String name) {
        this.name = name;
        return this;
    }

    public byte[] getContent() {
        return content;
    }

    public Picture setContent(byte[] content) {
        this.content = content;
        return this;
    }

    public long getId() {
        return id;
    }

    public Picture setId(long id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Picture setUser(User user) {
        this.user = user;
        return this;
    }
}
