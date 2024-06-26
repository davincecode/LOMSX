/*
 * Copyright (C) Vincent Ybanez 2024-Present
 * All Rights Reserved 2024
 */
package database;

public class Message {
    private final int id;
    private final String text;
    private int senderId;
    private String senderUsername;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Message(int id, String text, int senderId) {
        this(id, text);
        this.senderId = senderId;
    }

    public Message(int id, String text, int senderId, String senderUsername) {
        this(id, text, senderId);
        this.senderUsername = senderUsername;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getMessageId() {
        return id;
    }

    public int getSenderId() {
        return senderId;
    }

    public String getSenderUsername() {
        return senderUsername;
    }
}
