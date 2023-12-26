package week09.day26_statics;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Billy", "Tokyo", 5);

        Server server1 = new Server("Yusuf", 24, 41, true, LocalDate.of(2023, 12, 23));
        Server server2 = new Server("Mohammad", 31, 40, true, LocalDate.of(2021, 5, 1));
        Server server3 = new Server("Mehmet", 25, 42, true, LocalDate.of(2023, 12, 13));
        Server server4 = new Server("Jack", 28, 41, false, LocalDate.of(2020, 12, 15));
        Server server5 = new Server("Melly", 26, 41, false, LocalDate.of(2022, 12, 20));
        Server[] servers = {server2, server3, server4, server5};

        restaurant1.hireServer(server1);
        restaurant1.hireServer(servers);

        System.out.println(restaurant1.servers);

        System.out.println("--------------------------------------------------------------------");


        Chef chef1 = new Chef("John", 26, 51, false);
        Chef chef2 = new Chef("Walter", 44, 55, true);
        Chef chef3 = new Chef("Jimmy", 31, 52, true);
        Chef chef4 = new Chef("Sophy", 29, 50, true);
        Chef chef5 = new Chef("Hope", 23, 49, false);

        Chef[] chefs = {chef2, chef3, chef4, chef5};

        restaurant1.hireChef(chef1);
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1.chefs);

        System.out.println("--------------------------------------------------------------------");

        System.out.println(restaurant1.toString());

        System.out.println("--------------------------------------------------------------------");

        server4.cleanTable();
        chef5.washDishes();

        restaurant1.servers.get(1).takeOrder();
        restaurant1.chefs.get(2).makeOrder();

        restaurant1.terminateChef(restaurant1.chefs.get(0).employeeID);
        restaurant1.terminateServer(restaurant1.servers.get(0).employeeID);

        System.out.println(restaurant1.toString());
    }
}
