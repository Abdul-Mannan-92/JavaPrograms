public class AreaC
{
    public static void main(String[] args){

        System.out.println(Area (5.3));
        System.out.println(Area (7.7, 3.3));

    }

    public static double Area (double Radius) {
        double areaOfCircle;
        areaOfCircle = Math.PI * Radius * Radius;

        if (Radius < 0) {
            return -1.0;
        }
        else {
            return areaOfCircle;
        }
    }

        public static double Area (double x, double y){
            double areaOfRect;
            areaOfRect = 2 * (x + y);

            if (x < 0 || y < 0){
                return -1.0;
            }
            else{
                return areaOfRect;
            }
        }
}









