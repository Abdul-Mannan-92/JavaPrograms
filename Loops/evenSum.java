public class evenSum {
    public static void main(String[] args){
        System.out.println(sumEven(1,10));
        }

    public static boolean isEven (int Number){
        if (Number > 0 && Number % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int sumEven (int Start, int End){
        int Sum = 0;
        if (Start > 0 && End > 0 && End >= Start){
            for (int i = Start; i <= End; i++) {
                if (isEven(i))
                    Sum = Sum + i;
            }
            return Sum;
        }
        else{
            return -1;
        }
    }
}











