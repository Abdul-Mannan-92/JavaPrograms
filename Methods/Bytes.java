class Bytes{

    public static void main(String[] args){
        int kiloBytes = 90;
        printMegaBytes(kiloBytes);
    }

    public static void printMegaBytes (int kiloBytes){
        double megaBytes;
        megaBytes = kiloBytes/1024;
        System.out.println(kiloBytes + "kb " + "= " + megaBytes + "mb");
    }
}