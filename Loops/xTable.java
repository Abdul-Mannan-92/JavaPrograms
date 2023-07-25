import java.util.Scanner;

public class xTable {
    public static void main(String[] args){
        xTable();
    }
    
    public static void xTable () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Print its Multiplication Table");
        int Number = sc.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println(Number + " x " + i + " = " + Number * i);
            i++;
        }
    }
}











