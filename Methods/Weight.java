class Weight{

    public static void main(String[] args){
        double weightKgs = 45;
        System.out.println("Weight in KiloGrams is : " + weightKgs + "kgs");

        gConvertor(weightKgs);
        mgConvertor(weightKgs);
    }

    public static void gConvertor (double weightKgs){
        double Grams;
        Grams = weightKgs/1000;
        System.out.println("Weight in Grams is : " + Grams + "g");
        //return Grams;
    }

    public static void mgConvertor (double weightKgs){
        double milliGrams;
        milliGrams = weightKgs/10000;
        System.out.println("Weight in Milli Grams is : " + milliGrams + "mg");
        //return milliGrams;
    }
}