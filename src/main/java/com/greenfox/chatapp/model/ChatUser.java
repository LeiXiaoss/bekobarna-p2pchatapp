package com.greenfox.chatapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChatUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;

    String userName;

    public ChatUser() {
    }

    public ChatUser(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
