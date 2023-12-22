package week08.day25_constructors;

public class SalaryCalculator {

    public int weeklyHours;
    public double hourlyRate, stateTaxRate, federalTaxRate;

    public SalaryCalculator(int weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary()+
                ", state tax=" + stateTax() +
                ", federal tax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
