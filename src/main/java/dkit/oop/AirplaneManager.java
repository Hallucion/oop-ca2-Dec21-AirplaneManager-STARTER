package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.
    private String passengerName;
    private int airplaneId;

    // write add() method


    public void displayAllAirplanes()
    {
            
    }

    public void displayAllPassengerAirplanes() {
        // add code
    }

    //  write method getAllCargoAirplanes()
    public void getAllCargoAirplanes() {
        // add code
    }

    // write  addPassengerNameToAirplane( airplaneId, passengerName)
    public void addPassengerNameToAirplane(int airplaneId, String passengerName) {
        // add code
    }

    // write containsAirplane( Airplane plane )

    public void containsAirplane(Airplane airplane) {
        // add code
    }

    // write findAirplaneByPassengerName(passengerName)

    public void findAirplaneByPassengerName(String passengerName)
    {
        // add code
    }

    // write displayAllAirplanesInOrderOfType( argument )
    public void displayAllAirplanesInOrderOfType() {
        // add code
    }

} // end of AirplaneManager


