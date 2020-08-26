package com.inviteme.api.model;

import java.util.UUID;

public class Event {

    private final UUID id;
    private final String name;

    public Event(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}