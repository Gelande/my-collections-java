package org.collections.map.ordination;

public class Event {

    private String name;

    //poderia ser uma collection de String
    private String attraction;

    public Event(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    public String getName() {
        return name;
    }

    public String getAttraction() {
        return attraction;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", attraction='" + attraction + '\'' +
                '}';
    }
}
