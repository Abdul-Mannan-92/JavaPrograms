public class Area
{
    public static void main(String[] args)
    {
        int Length = 10, Breadth = 6;
        double Height = 3.14;
        Area (Length);
        Area (Length, Breadth);
        Area (Length, Height);
    }

    public static void Area (int Side){
        int Sq_Area = Side * Side;
        System.out.println();
        System.out.println("The Area of Square is : " + Sq_Area);
        System.out.println();
    }

    public static void Area (int Length, int Breadth){
        int Rect_Area = Length * Breadth;
        System.out.println("The Area of Rectangle is : " + Rect_Area);
        System.out.println();
    }
    public static void Area (int Base, double Height){
        double Tri_Area = 0.5 * Base * Height;
        System.out.println("The Area of Triangle is : " + Tri_Area);
        System.out.println();
    }
}