public class Hello {
    public static void main(String[] args)
    {
        System.out.println("Hi, Hemanth");

        boolean isalien = false;
        if (isalien == false) {
            System.out.println("Im not an alien");
            System.out.println("Im scared of aliens");
        }

        int topscore = 90;
        if (topscore <= 100) {
            System.out.println("Im the highest score");
        }

        int secondtopscore = 80;
        if ((topscore >secondtopscore) && (secondtopscore < 100)) {
            System.out.println("Im the second highest top score");
        }

        if ((topscore < 80) || (secondtopscore > 70)){
            System.out.println("Both are either of the statements are true");
        }

        boolean iscar = false;
        if (!iscar) {
            System.out.println("This is not supposed to happen");
        }

        String makeofcar = "VW";
        boolean isDomestic = makeofcar == "VW"? true : false;

        if (isDomestic){
            System.out.println("This car can be used in the country for somestic purpose");
        }

        int age = 25;
        String agetext = (age <=30) ? "Im an adult" : "Im a kid";

        if (age == 25){
            System.out.println("Im miss raji " + agetext);
        }

        String s = (isDomestic) ? "Im very safe to easy" : " im not a safe car";
        System.out.println(s);
        }




}
