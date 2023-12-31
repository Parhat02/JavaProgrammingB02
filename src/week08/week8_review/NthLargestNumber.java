package week08.week8_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        System.out.println(numbers);

        int n = 30;

        if (n > numbers.size()){
            System.out.println("Not enough elements in the arraylist");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            numbers.removeIf(p-> Collections.max(numbers) == p);
        }

        System.out.println(Collections.max(numbers));

        /*
        To return the Nth maximum number, we remove first (N-1) maximum numbers.
          then the next max number will be the Nth max number of the collection
         */
    }
}
