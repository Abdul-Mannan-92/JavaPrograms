public class Sudent1 {
    
    public static void main(String[] args)
    {
        String studentName = "Mohammed Abdul Mannan";
        int studentScore = 90;

        char studentGrade = divisonCalculator(studentScore);

        System.out.println("The Name of the Student is :  "+ studentName);
        System.out.println("The Divison of the Student is : "+ studentGrade);
    }

    public static char divisonCalculator(int Score) {
        char Division;

        if(Score >=80){
            Division = 'A';
        }
        else if(Score >=60 && Score <80){
            Division = 'B';
        }
        else if(Score >=40 && Score <60){
            Division = 'C';
        }
        else{
            Division = 'F';
        }
        return Division;
    }

}
    

