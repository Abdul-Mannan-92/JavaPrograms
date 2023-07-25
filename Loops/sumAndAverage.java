import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to calculate Sum & Average");
        int n = sc.nextInt();*/

        printSumAndAverage();
    }

    public static void printSumAndAverage (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to calculate Sum & Average");
        int n = sc.nextInt();
        
        double Average = n / 2;
        int Remainder, Sum = 0, Count = 0;
        
        while (n != 0){
            Remainder = n % 10;
            Sum += Remainder;
            n /= 10;
            ++Count;
        }

        System.out.println("Sum = " + Sum + " Average = " + Average);
    }
}











