public class Product
{
    public static void main(String[] args)
    {
        System.out.println(hasEqualProduct(2,2,4));
    }
    public static boolean hasEqualProduct(int num1, int num2, int num3){
        if ((num1*num2) == num3){
            return true;
        }
        else{
            return false;
        }
    }
}

