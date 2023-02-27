//Name: Ari Chicheportiche
//ID: 319306684
//Execrsice 0
//Make class of employees and salary



package entities;
import java.util.Objects;
//This time this class inheriet from commissionEmployee
public class BasePlusCommissionEmployee extends CommissionEmployee {
    //field
    float baseSalary;
    float grossSales;
    int commision;

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                ", grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0 && Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary, grossSales, commision);
    }

    //The ctor of all argument- for Employee class and commision class
    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision, float baseSalary) {
        super(firstName, lastName, id, grossSales, commision);
            setBaseSalary(baseSalary);
                setGrossSales(grossSales);
                setCommision(commision);

        }

    //A ctor that use defult ctors for the other classes
    public BasePlusCommissionEmployee(float baseSalary, float grossSales, int commision) {
            setBaseSalary(baseSalary);
            setGrossSales(grossSales);
            setCommision(commision);
    }

    //Defult ctor
    public BasePlusCommissionEmployee(){
            setBaseSalary(0);
            setCommision(0);
            setGrossSales(0);
    }


    //Getters & setters
    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Your can't put a negative num to baseSalary: "+baseSalary);
        this.baseSalary = baseSalary;
    }

    @Override
    public float getGrossSales() {
        return grossSales;
    }

    @Override
    public void setGrossSales(float grossSales) {
        if(grossSales < 0)
            throw new IllegalArgumentException("You can't put a negative num to grossSales: "+grossSales);
        this.grossSales = grossSales;
    }

    @Override
    public int getCommision() {
        return commision;
    }

    @Override
    public void setCommision(int commision){
        if(commision < 0)
            throw new IllegalArgumentException("You cant put a negative number to commision: "+commision);
        this.commision = commision;
    }


    //The function of the salary
    //I put an 10% more for the salary for the commision
    @Override
    public float earnings() {
        float salary = (commision/100 * grossSales)+baseSalary;
        return (salary+salary/10);
    }

}
