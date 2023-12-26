package week07.day21_multiDimensionalArray;

public class Day21Tasks {

    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String [][] batch1Groups = {batch1Group1, batch1Group2, batch1Group3};

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = new String[3][];
        batch2Groups[0] = batch2Group1;
        batch2Groups[1] = batch2Group2;
        batch2Groups[2] = batch2Group3;

        String[][][] cydeoStudents = {batch1Groups, batch2Groups};

        for (String[][] groups : cydeoStudents){

            for (String[] group : groups){

                for (String s : group) {

                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }

        System.out.println("---------------------------------------------------------------");

        // Task2

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        // 2.1
        for (String[] item : items) {

            for (String i : item) {

                System.out.print(i+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");

        // 2.2
        for (String[] item : items) {

            for (int i = item.length-1; i >= 0; i--){

                System.out.print(item[i]+"\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");

        // 2.3
        for (int i= items.length-1; i >= 0; i--){

            String[] item = items[i];

            for (int j = 0; j < item.length; j++) {

                System.out.print(item[j]+"\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");

        for (int i= items.length-1; i >= 0; i--){

            String[] item = items[i];

            for (int j = item.length - 1; j >= 0; j--) {

                System.out.print(item[j]+"\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");


        //Task3

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] strings : array) {
            for (String[][][][][][][][] string : strings) {
                for (String[][][][][][][] strings1 : string) {
                    for (String[][][][][][] strings2 : strings1) {
                        for (String[][][][][] strings3 : strings2) {
                            for (String[][][][] strings4 : strings3) {
                                for (String[][][] strings5 : strings4) {
                                    for (String[][] strings6 : strings5) {
                                        for (String[] strings7 : strings6) {
                                            for (String s : strings7) {
                                                System.out.print(s+"\t");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
