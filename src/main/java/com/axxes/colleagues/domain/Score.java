package com.axxes.colleagues.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Score {

    @Id
    private Long id;
    private Long amount;
    private String timestamp;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    public Long getAmount() {
        return amount;
    }

    public Score setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Score setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Score setId(Long id) {
        this.id = id;
        return this;
    }
}
