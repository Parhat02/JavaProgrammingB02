package week09.day26_statics;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server() {
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println(name+" is taking order.");
    }

    public void cleanTable(){
        System.out.println(name+" is cleaning table.");
    }

    @Override
    public String toString() {
        String workingStatus ="";
        if (fullTime){
            workingStatus = "Full-time";
        }else {
            workingStatus = "Part-time";
        }
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + workingStatus +
                ", hire_date=" + hire_date +
                '}'+"\n";
    }

}
