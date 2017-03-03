

import com.sun.org.apache.xalan.internal.lib.ExsltSets;

import java.util.HashSet;
import java.util.StringJoiner;

public class JavaCollectionsSet {

    public static void createSet(){

        //creates a new set called set
        HashSet<String> set = new HashSet<String>();


        //HAPPY PATH

        //This adds to the set (does not retain order)
        set.add("Harry Potter");
        set.add("Lord of The Rings");
        set.add("Pride & Prejudice");

        //returns size of set
        System.out.println("This set has " + set.size() + " elements in it.");

        String value = "Pride & Prejudice";

        //checks whether item is in set
        if (set.contains(value)){
            System.out.println(value + " is in this set.");
        } else{
            System.out.println(value + " is not in this set.");
        }

        //iterates through set
        for (String element: set){
            System.out.println(element);
        }

        //checks whether set is empty
        if (set.isEmpty()){
            System.out.println("This set is empty.");
        } else{
            System.out.println("This set is not empty.");
        }

        //removes element from set
        set.remove("Harry Potter");

        //returns size of set
        System.out.println("This set has " + set.size() + " elements in it.");

        //clears all from set
        set.clear();

        //checks whether set is empty
        if (set.isEmpty()){
            System.out.println("This set is empty.");
        } else{
            System.out.println("This set is not empty.");
        }

        //Create two sets
        HashSet<String> setOne = new HashSet<String>();
        setOne.add("Canada");
        setOne.add("Iceland");
        setOne.add("Italy");

        HashSet<String> setTwo = new HashSet<String>();
        setTwo.add("Calgary");
        setTwo.add("Iceland");
        setTwo.add("Durban");

        //union the two sets
        HashSet union = new HashSet(setOne);
        union.addAll(setTwo);
        System.out.println(union);

        //intersection
        HashSet intersection = new HashSet(setOne);
        intersection.retainAll(setTwo);
        System.out.println(intersection);

        //symmetric difference
        HashSet<String> symmetricDifference = new HashSet<String>();
        symmetricDifference.addAll(setOne);
        symmetricDifference.addAll(setTwo);
        symmetricDifference.removeAll(intersection);
        System.out.println(symmetricDifference);




        //NASTY PATH

        //This adds the same element twice.
        //the second one won't work
        set.add("Jane Eyre");
        set.add("Jane Eyre");
        System.out.println(set);



        //NASTY PATH

        //Removes an item that doesn't exist
        //returns false
        System.out.println(set.remove("Treasure Island"));



        //NASTY PATH

        ///This isn't inserted as a String as it should be
        //returns the line
        set.add("\n");
        set.add("Harry Potter");
        set.add("Lord of The Rings");
        set.add("Pride & Prejudice");
        System.out.println(set);


        //NASTY PATH

        //This tries to remove null.
        //returns false
        System.out.println(set.contains(null));


        //NASTY PATH

        //inserts a nul
        //adds null to the set
        set.add(null);
        System.out.println(set);



          }
}
