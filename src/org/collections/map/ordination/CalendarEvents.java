package org.collections.map.ordination;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CalendarEvents {

    private Map<LocalDate, Event> eventsMap;

    public CalendarEvents() {
        this.eventsMap = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        Event event = new Event(name, attraction);
        eventsMap.put(date, event);
    }

    //ordenar co treemap
    public void showCalendar() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventsMap);
        System.out.println(eventTreeMap);
    }

    public void getNextEvent() {
        LocalDate currentDate = LocalDate.now();
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventsMap);
        for (Map.Entry<LocalDate, Event> entry: eventTreeMap.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                System.out.println("O próximo evento " + entry.getValue() + " será no dia " + entry.getKey());
                break;
            }
        }
    }
}
