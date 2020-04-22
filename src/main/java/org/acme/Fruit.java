package org.acme;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class Fruit {

    public String name;
    public String description;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
