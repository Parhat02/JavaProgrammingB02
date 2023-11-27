package week03.day08_ternarySwitch;

public class Elevator {

    public static void main(String[] args) {
        int floorNumber = 3;
        String result = "";
        if (floorNumber >=1 && floorNumber <= 3){

            if (floorNumber ==1){
                result = "Floor 1 selected. Companies: Lobby,Verizon, Starbucks";
            } else if (floorNumber==2) {
                result = "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            }else {
                result += "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else {
            result = "Invalid floor";
        }
        System.out.println(result);
    }
}
