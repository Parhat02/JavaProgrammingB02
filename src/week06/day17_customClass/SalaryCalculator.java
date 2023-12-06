package week06.day17_customClass;

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;

    double stateTaxRate;
    double federalTaxRate;
    double salary;

    double stateTax;
    double federalTax;
    double salaryAfterTax;

    public void setInfo(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }

    public double salary() {
        salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax(){
        stateTax = salary * stateTaxRate /100;
        return stateTax;
    }

    public double federalTax(){
        federalTax = salary * federalTaxRate /100;
        return federalTax;
    }

    public double salaryAfterTax(){
        salaryAfterTax = salary - stateTax - federalTax;
        return salaryAfterTax;
    }
}
