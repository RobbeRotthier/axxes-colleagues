package com.axxes.colleagues.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Score {

    @Id
    private Long id;
    private Long amount;
    private String timestamp;

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
