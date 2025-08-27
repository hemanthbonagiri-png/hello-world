public class practiceSwitch {
    public static void main(String[] args){

        printDayOfWeek(1);


        char word = 'A';
        switch (word) {
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is baker");
            case 'C' -> System.out.println("c is charlie");
            default -> System.out.println("not found");
        }

    }

    public static void printDayOfWeek(int day){

        String dayofweek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "invalid day";

        };

        System.out.println(day + " stands for" +  dayofweek);
    }


}
