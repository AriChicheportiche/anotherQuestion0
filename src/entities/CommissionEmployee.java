//Name: Ari Chicheportiche
//ID: 319306684
//Execrsice 0
//Make class of employees and salary


package entities;

import java.util.Objects;

public class CommissionEmployee extends Employee {

    float grossSales;
    int commision;


    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }


    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommision(commision);
    }


    public CommissionEmployee() {

        setGrossSales(0);
        setCommision(0);

    }


    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales){
        if (grossSales < 0)
            throw new  IllegalArgumentException("You can put grossSales value less than 0: " + grossSales);
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision){
        if (commision < 0)
            throw new IllegalArgumentException("You can put commision value less than 0: " + commision);
        this.commision = commision;
    }

    @Override
    public float earnings() {
        return (getCommision() / 100 * getGrossSales());
    }


}
