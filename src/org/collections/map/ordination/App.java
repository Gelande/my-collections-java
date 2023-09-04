package org.collections.map.ordination;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {

        CalendarEvents calendarEvents = new CalendarEvents();
        calendarEvents.addEvent(LocalDate.of(2023, Month.OCTOBER, 12), "Dia da criança", "Zoo");
        calendarEvents.addEvent(LocalDate.of(2023, Month.OCTOBER, 15), "Reunião", "Apresentação");
        calendarEvents.addEvent(LocalDate.of(2023, Month.NOVEMBER, 2), "Niver da Vivi", "Festa");
        calendarEvents.addEvent(LocalDate.of(2023, Month.SEPTEMBER, 2), "Evento passado", "Sair");
        calendarEvents.addEvent(LocalDate.of(2023, Month.SEPTEMBER, 4), "Evento hoje", "Avaliação");
        calendarEvents.showCalendar();

        calendarEvents.getNextEvent();


    }
}

//Implementar os métodos restantes da busca