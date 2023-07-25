public class Prime {
    public static void main(String[] args){
        for (int i = 1; i <= 50; i++) {
            primeNumbers(i);
        }
    }

    public static void primeNumbers (int i){
        if(i%1==0 && i%2!=0 && i%3!=0  && i%5!=0 && i%7!=0 && i == 2){
            System.out.println(i);
        }
    }
}











