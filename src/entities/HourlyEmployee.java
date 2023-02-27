//Name: Ari Chicheportiche
//ID: 319306684
//Execrsice 0
//Make class of employees and salary


package entities;

import java.util.Objects;

public class HourlyEmployee extends Employee {
    //The field of this class:
    float wage;
    int hours;

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() + ", " +
                "wage= " + wage + ", " +
                ", hours=" + hours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return Float.compare(that.wage, wage) == 0 && hours == that.hours;
    }


    //Give a number one value back
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wage, hours);
    }

    //ctors with 2 parameters
    public HourlyEmployee(float wage) {
        //Here is a default setting, so there no need to write super
        //We will need to use a settter- to check for exeptions.

        setHours(hours);
        setWage(wage);
    }

    //Ctor with more argument, that can be use to put on the name.
    public HourlyEmployee(String firstName, String lastName, int id, float wage, int hours)  {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    public HourlyEmployee() {
        setHours(0);
        setWage(0);
    }


    //All the getters and the setters
    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if (wage < 0)
            throw new IllegalArgumentException("Hi Ari - you need to put a correct value for wage" + wage);
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("Hi Ari - you need to put a correct value for hours" + wage);
        this.hours = hours;
    }

    //The function to cal the salary
    @Override
    public float earnings() {
        return hours * wage;
    }


}
