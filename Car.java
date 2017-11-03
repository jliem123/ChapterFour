
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    String model;
    int year;

    /**
     * Constructor for objects of class Car
     */
    public Car(String md, int yr)
    {
       this.model = md;
       this.year = yr;
    }

    public String toString() {
        return "The car is a " + this.year + " " + this.model;
    }
    
    public boolean equals(Car otherCar) {
        if (this.model.equals(otherCar.model) && this.year == otherCar.year) {
            return true;
        }
        else {
            return false;
        }
    }
}

