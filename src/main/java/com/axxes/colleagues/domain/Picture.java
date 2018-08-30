package com.axxes.colleagues.domain;

public class Picture {


    private String name;
    private byte[] content;

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
}
