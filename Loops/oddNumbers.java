public class oddNumbers {
    public static void main(String[] args){
        printOdd(1,20);
        }

    public static boolean isOdd (int Number){
        if (Number > 0 && Number % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void printOdd (int Start, int End){
        int Number = 0;
        while (Number <= End){
            Number ++;
            if (! isOdd(Number)){
                continue;
            }
            System.out.println(Number);
        }
    }
}











