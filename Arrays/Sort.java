public class Sort {

    //public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] Array = new int[] {7,0,2,1,3,4};
        
        printArray(Array);
        sortArray(Array);
    }

    public static void printArray (int[] Array){
        for (int i=0; i< Array.length; i++){
            System.out.println(Array[i]);
        }
    }

    public static void sortArray (int[] array)
    {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Elements of Array sorted in ascending order : ");
        printArray(array);
    }
}