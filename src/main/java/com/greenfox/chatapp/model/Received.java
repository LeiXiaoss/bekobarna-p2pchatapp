package com.greenfox.chatapp.model;

public class Received {
    Message message;
    Client client;

    public Received() {
    }

    public Received(Message message, Client client) {
        this.message = message;
        this.client = client;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}