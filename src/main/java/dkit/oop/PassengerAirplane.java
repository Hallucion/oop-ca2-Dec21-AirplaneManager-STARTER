package dkit.oop;

import java.util.ArrayList;

public class PassengerAirplane
{
    private ArrayList<Airplane> passengerList;

    // fields(Q2)
    private String type;
    private int maxNumPassengers;
    private Object Airplane;

    PassengerAirplane(String type, int maxNumPassengers)
    {
        // code here
        this.type = type;
        this.maxNumPassengers = maxNumPassengers;
    }

    public void addPassenger(String name)
    {
//        passengerList.add()
    }

    public void passengerList(String names)
    {
        this.passengerList = new ArrayList<>();
    }

    public String getType()
    {
        return type;
    }
    public int getMaxNumPassengers() {return getMaxNumPassengers();}

    //toString()
    @Override
    public String toString()
    {
        return "Plane = [" + type + "] And THE Current maxNumPassengers Avaliable Is = [" + maxNumPassengers + "]";
    }


} // end of PassengerAirplane
