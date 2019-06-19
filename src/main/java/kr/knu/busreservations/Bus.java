package kr.knu.busreservations;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    int id;
    List seats;
    Terminal startTerminal;
    Terminal endTerminal;

    Bus(int id, List seats, Terminal startTerminal, Terminal endTerminal)
    {
        this.id = id;
        this.seats = seats;
        this.startTerminal = startTerminal;
        this.endTerminal = endTerminal;
    }

}