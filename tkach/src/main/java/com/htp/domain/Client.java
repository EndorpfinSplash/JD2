package com.htp.domain;

public class Client {
    String id;
    String fullName;
    String greeting;

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Client(String id, String fullName, String greeting) {
        this.id = id;
        this.fullName = fullName;
        this.greeting = greeting;
    }

    public Client() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
