package ru.leo.travelagency.user.domain;

public enum ClientType {
    VIP("Very important person"),
    ORDINARY("Just another client");

    private String description;

    ClientType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
