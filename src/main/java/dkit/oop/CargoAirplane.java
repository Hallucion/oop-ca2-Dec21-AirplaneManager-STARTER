package dkit.oop;

public class CargoAirplane
{


    // fields (ref. Q1)
    private String s;
    private int i;
    private String name;

    // constructor
    public CargoAirplane(String s, int i)
    {
        this.s = s;
        this.i = i;

    }

    public void addPassenger(String name)
    {
        // code here
    }



    // toString()
    @Override
    public String toString() {
        return "Plane = ["+ s +
                "]  And Its currentLoad is = ["+ i + "]";
    }



} // END of CargoAirplane class.

