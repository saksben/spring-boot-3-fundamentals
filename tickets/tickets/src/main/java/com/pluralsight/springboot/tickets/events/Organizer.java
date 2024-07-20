package com.pluralsight.springboot.tickets.events;

public record Organizer(
        int id,
        String name,
        String description
) {
}
