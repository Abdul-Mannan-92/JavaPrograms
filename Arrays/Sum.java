import java.util.Scanner;

public class Sum {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] userArray = getUserArray(6);

        int userSum = userSum(userArray);
        System.out.println("The Sum is : " + userSum);

    }

    public static int[] getUserArray(int number){
        System.out.println("Enter " + number + " integers");
        int[] userValues = new int[number];
        for (int i=0; i< userValues.length; i++){
            userValues[i] = sc.nextInt();
        }
        return userValues;
    }

    public static int userSum (int[] Array){
        int Sum = 0;

        for (int i=0; i< Array.length; i++){
            Sum += Array[i];
        }
        return Sum;
    }
}