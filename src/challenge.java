public class challenge {
    public static void main(String[] args){
        double val1 = 20.00d;
        double val2 = 80.00d;

        double val3 = ((val1 + val2) * 100.00d);

        val3 = val3%40.00d;
        System.out.println(val3);

        boolean isvalue = (val3 == 0.0) ? true : false;
        System.out.println("boolean value is " +isvalue);

        if(!isvalue){
            System.out.println("Got some remainder");
        }

    }
}
