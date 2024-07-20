package com.pluralsight.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
            new Organizer(101, "Globomantics", "Globomantics Technology Corporation"),
            new Organizer(102, "Carved Rock", "Carved Rock Sportts Equipment")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
