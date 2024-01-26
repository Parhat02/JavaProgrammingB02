package week13.day42_maps.day42Tasks;

import java.util.*;

public class Task6Car {

    public static void main(String[] args) {

        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<Integer, Map<String, Object>> myCars = new Hashtable<>();

        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);

        List<Integer> expense = new ArrayList<>();

        for (Map.Entry<Integer, Map<String, Object>> mapEntry : myCars.entrySet()) {

            expense.add((Integer) mapEntry.getValue().get("price"));

            System.out.println(mapEntry.getValue().get("brand") + "-" + mapEntry.getValue().get("model") +
                    "-" + mapEntry.getValue().get("price"));

            for (Map.Entry<String, Object> objectEntry : mapEntry.getValue().entrySet()) {

                if (objectEntry.getKey().equalsIgnoreCase("electric") && objectEntry.getValue().equals(true)){

                    System.out.println(mapEntry);

                }
            }
        }

        int price = Collections.max(expense);

        Map<String, Object> mostExpensiveCar = new LinkedHashMap<>();

        for (Map.Entry<Integer, Map<String, Object>> mapEntry : myCars.entrySet()){

            if ((Integer) mapEntry.getValue().get("price") == price){
                mostExpensiveCar.putAll(mapEntry.getValue());
            }
        }
        System.out.println(mostExpensiveCar);

    }
}
