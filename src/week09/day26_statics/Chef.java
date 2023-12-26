package week09.day26_statics;

import java.time.LocalDate;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef() {
    }

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+" is making an order.");
    }

    public void washDishes(){
        System.out.println(name+" is washing dishes.");
    }

    @Override
    public String toString() {
        String workingStatus ="";
        if (fullTime){
            workingStatus = "Full-time";
        }else {
            workingStatus = "Part-time";
        }
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + workingStatus +
                '}'+"\n";
    }
}
