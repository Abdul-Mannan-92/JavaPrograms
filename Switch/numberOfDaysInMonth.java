public class numberOfDaysInMonth {
    public static void main(String[] args){

        getDaysInMonths(2, 2022);
    }

        public static boolean isLeapYear(int Year){
            if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 != 0)){
                return true;
            }
            else{
                return false;
            }
        }

        public static void getDaysInMonths(int Month, int Year){
            if (Month < 1 || Month > 12){
                System.out.println("-1");
                return;
            }
            else if (Year < 1 || Year > 9999){
                System.out.println("-1");
                return;
            }
            switch (Month){
                case 1 -> System.out.println("January " + Year + " has 31 days");
                case 2 -> System.out.println("February " + Year + " has " + (isLeapYear(Year) ? " 29 days" : " 28 days"));
                case 3 -> System.out.println("March " + Year + " has 31 days");
                case 4 -> System.out.println("April " + Year + " has 30 days");
                case 5 -> System.out.println("May " + Year + " has 31 days");
                case 6 -> System.out.println("June " + Year + " has 30 days");
                case 7 -> System.out.println("July " + Year + " has 31 days");
                case 8 -> System.out.println("August " + Year + " has 31 days");
                case 9 -> System.out.println("September " + Year + " has 30 days");
                case 10 -> System.out.println("October " + Year + " has 31 days");
                case 11 -> System.out.println("November " + Year + " has 30 days");
                case 12 -> System.out.println("December " + Year + " has 31 days");
            }
        }
}











