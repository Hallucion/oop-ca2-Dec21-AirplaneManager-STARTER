package dkit.oop;

public class CargoAirplane
{


    // fields (ref. Q1)
    private int MAX_LOAD_KILOS;
    private int currentLoad;
    private String name;

    // constructor
    public CargoAirplane(String s, int i)
    {
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
        this.currentLoad = currentLoad;

    }

    public void addPassenger(String name)
    {
        // code here
    }



    // toString()
    @Override
    public String toString() {
        return "PassengerAirplane{" +
                " MAX_LOAD_KILOS = "+ MAX_LOAD_KILOS +
                " currentLoad = "+ currentLoad;
    }



} // END of CargoAirplane class.

