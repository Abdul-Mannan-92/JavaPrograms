public class sumofNumber {
    public static void main(String[] args){
       sumOfNumber(1234);
    }

    public static void sumOfNumber (int Number){
        int Sum = 0, Remainder;
        do{
            Remainder = Number % 10;
            Sum = Sum + Remainder;
            Number = Number / 10;
        }while (Number != 0);
        System.out.println("The Sum of the given Number is : "+ Sum);
    }
}











