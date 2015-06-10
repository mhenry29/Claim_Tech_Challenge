/**
 * Created by melissa on 6/10/15.
 */
public class EvenOrOdd {

    public static void evenOrOdd(int value) {
        if (value % 2 == 0) {
            System.out.printf("The value %d is even\n", value);
        }
        else System.out.printf("The value %d is odd\n", value);
    }

    public static void divThreeFive(int value) {
        boolean divThree = value % 3 == 0;
        boolean divFive = value % 5 == 0;
        if (divThree && divFive) {
            String output = "Divisible by both 3 and 5";
            output = output.replace("3", "three");
            output = output.replace("5", "five");
            System.out.println(output);
        }
        else if (divThree) {
            System.out.println("Divisible by 3");
        }
        else if (divFive) {
            System.out.println("Divisible by 5");
        }
        else {
            String output = "Indivisible by 3 or 5";
            output = output.replaceFirst(".*","Indivisible, with Liberty and Justice for All");
            System.out.println(output);
        }

    }

    public static void main(String[] args) {
        int value = 13;
        evenOrOdd(value);

        divThreeFive(value);

    }

}


