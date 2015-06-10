/**
 * Created by melissa on 6/10/15.
 */
public class SumOfMultiples {

    public static void main(String[] args){

        int factor1 = 3;
        int factor2 = 5;
        int ceiling = 1000;
        int sum = 0;

        for(int i = 0; i <= ceiling; i++) {
            if (i % factor1 == 0 || i % factor2 == 0) {
                sum = sum + i;
            }
        }

        System.out.printf("The sum of multiples %d and %d below %d is: %d\n",
                factor1, factor2, ceiling, sum);
    }
}
