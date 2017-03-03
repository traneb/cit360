

import java.util.ArrayList;

public class JavaCollectionsList {

    public static void createList() {

        //Creates a new ArrayList object called list
        ArrayList<String> list = new ArrayList<String>();


        //HAPPY PATH

        //adds these to the list
        list.add("Black Stallion");
        list.add("Courious George");
        list.add("Happy Feet");

        //returns number of elements in list
        System.out.println("There are " + list.size() + " books in the list.");

        //finds the element that's in index 0
        System.out.println("The first element in the list is " + list.get(0) + ".");

        String value = "Courious George";

        //checks if an element is in the list (boolean)
        if (list.contains(value)){
            System.out.println(value + " is an element in this list.");
        } else{
            System.out.println(value + " is not an element in this list.");
        }

        //returns element from specified position
        System.out.println(list.get(1) + " is in the second position of this list.");

        //returns the index of first occurrence of specified element
        System.out.println("The first occurrence of Pride & Prejudice in the list is in the position of index "
                + list.indexOf("Black Stallion") + ".");

        //sets an element in a specific index
        list.set(1, "Wizards");
        System.out.println(list);

        //check whether the list is empty (boolean)
        if (list.isEmpty()){
            System.out.println("This list is empty.");
        } else{
            System.out.println("This list is not empty.");
        }

        //to remove from list - can reference object or index
        list.remove("Black Stallion");

        //returns number of elements in list
        System.out.println("There are " + list.size() + " books in the list.");

        //clears all elements from the list
        list.clear();

        //check whether the list is empty (boolean)
        if (list.isEmpty()){
            System.out.println("This list is empty.");
        } else{
            System.out.println("This list is not empty.");
        }

        //merging lists together
        ArrayList<String> listOne = new ArrayList<String>();
        listOne.add("Bens");
        listOne.add("Layanis");
        listOne.add("Pierce");

        ArrayList<String> listTwo = new ArrayList<String>();
        listTwo.add("Alyssa");
        listTwo.add("Vespa");
        listTwo.add("Tatum");

        ArrayList<String> completeList = new ArrayList<String>();
        completeList.addAll(listOne);
        completeList.addAll(listTwo);

        System.out.println(listOne);
        System.out.println(listTwo);
        System.out.println(completeList);




        //NASTY PATH

        //sets the element at an index that doesn't exist
        try {
            list.set(7, "Worlocks and Wizards");
        }
        catch(Exception e) {
            System.out.println("it does not exist.");
        }


        //NASTY PATH

        //gets an elements at an index that doesn't exist
        try{
            System.out.println(list.get(8));
        }
        catch(Exception e){
            System.out.println("it does not exist.");
        }


        //NASTY PATH

        //removes an element that doesn't exist
        try{
            System.out.println(list.remove(7));
        }
        catch(Exception e){
            System.out.println("Cannot remove it does not exist.");
        }


        //NASTY PATH

        //This isn't inserted as a String as it should be
        //returns the line
        list.add("Balck Stallion");
        list.add("Courious George");
        list.add("Happy Feet");
        list.add("\n");
        System.out.println(list);


        //NASTY PATH

        //gets index of an element that doesn't exist
        try{
            System.out.println("The index of this element is " + list.indexOf("George of the Jungle"));
        }
        catch(Exception e){
            System.out.println("This element doesn't exist");
        }


        //NASTY PATH

        //returns null - not great
        list.add(null);
        System.out.println(list);


        list.clear();


    
    }
}