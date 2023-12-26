package week09.day26_statics;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner , location;
    public int numberOfStars;

    public ArrayList<Server> servers = new ArrayList<>();

    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef [] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID);
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
