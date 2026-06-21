import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задача
        int[] inputArray1 = {100, 200, 300, 400, 500};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int sumM : inputArray1) {

            if (sumM > max) {
                max = sumM;
            }
            if (sumM < min) {
                min = sumM;

            }
            sum += sumM;
        }
        float averageSum = sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = averageSum;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));


        // 2 задача
        int[] inputArray2 = {100, 200, 300, 400, 500};
        float[] outputArray2 = new float[5];
        int index = 0;
        for (int tax1 : inputArray2) {
            outputArray2[index] = tax1 * 0.13f;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        // 3 задача
        int[] inputArray3 = {1000, 5300, 3600, 4000, 5900};
        boolean[] outputArray3 = new boolean[5];
        boolean bonusMoreThan5000;
        int index1 = 0;
        for (int bonus : inputArray3) {
            if (bonus >= 5000) {
                bonusMoreThan5000 = true;
            } else {
                bonusMoreThan5000 = false;
            }
            outputArray3[index1] = bonusMoreThan5000;
            index1++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        // 4 задача
        int[] inputArray4 = {1000, 5300, -3600, 4000, 5900};
        boolean[] outputArray4 = new boolean[1];
        boolean accountBalance = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                accountBalance = false;
                break;
            }
        }
        outputArray4[0] = accountBalance;
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        // 5 задача
        int[] inputArray5 = {1000, -5300, 3600, 4000, -5900};
        int[] outputArray5 = new int[1];
        int monthProfit = 0;
        for (int x : inputArray5) {
            if (x > 0) {
                monthProfit++;
            }
        }
        outputArray5[0] = monthProfit;
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }

}