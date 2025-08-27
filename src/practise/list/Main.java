package practise.list;
/*
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place sydney = new Place("sydney", 100);

        addPlace(placesToVisit, sydney);
        addPlace(placesToVisit, new Place("andhra", 899));
        addPlace(placesToVisit, new Place("tamil", 8199));
        addPlace(placesToVisit, new Place("chennai", 1899));
        addPlace(placesToVisit, new Place("mumbai", 8919));
        addPlace(placesToVisit, new Place("delhi", 89009));
        // addPlace(placesToVisit, new Place("sydney", 899));
        System.out.println(placesToVisit);


    }

    private static void addPlace(LinkedList<Place> list, Place palace) {

        if (list.contains(palace)) {
            System.out.println("duplicate found" + palace);
            return;
        }

        for (Place p : list) {

            if (p.name().equalsIgnoreCase(palace.name())) {
                System.out.println("duplicate found" + palace);
                return;
            }
        }

        int matchIndex = 0;
        for (var listplace : list) {
            if (palace.distance() < listplace.distance()) {
                list.add(matchIndex, palace);
                return;
            }
            matchIndex++;
        }
        list.add(palace);

    }

    private static void boxing() {

        int myVar1 = 15;
        Integer myVar2 = Integer.valueOf("Hemanth");
        Boolean aBoolean = true;
        Boolean aBoolean1 = Boolean.TRUE;
        Integer myVar3 = 15;

        int myVar4 = myVar2.intValue();

        int myVar5 = myVar2;




    }
}*//*


import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnBoxed = getDoubleObject();
        System.out.println(resultBoxed);
        System.out.println(getDoubleObject());

        Integer[] wrapperClass = new Integer[5];
        wrapperClass[1] = 50;
        System.out.println(Arrays.toString(wrapperClass));

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);


    }

    private static ArrayList<Integer> getList(int... vararg){

        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : vararg){
            aList.add(i);
        }
        return aList;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.00;
    }


}*/

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);


    }
}

public class Main {
    public static void main(String... args) {
        Customer bob = new Customer("bob", 5000.0);
        System.out.println(bob);

    }

    private ArrayList<Customer> customers = new ArrayList<>(5000);


}


