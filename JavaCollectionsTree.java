

import java.util.Iterator;
import java.util.TreeSet;

public class JavaCollectionsTree {

    public static void createTree() {

    //creates a new treeSet called set
    TreeSet treeSet = new TreeSet();


    //HAPPY PATH

    //this will create the treeSet
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(11);

    //returns the least element larger than this given element
        System.out.println(treeSet.ceiling(8));

    Integer value = 11;

    //checks whether item is in set
        if (treeSet.contains(value)){
        System.out.println(value + " is in this TreeSet.");
    } else{
        System.out.println(value + " is not in this TreeSet.");
    }

    //get the element that is equal to or next lesser to number
        System.out.println(treeSet.floor(7));


    //returns descending order of all elements
         System.out.println(treeSet.descendingSet());

    //returns size
        System.out.println("This TreeSet has " + treeSet.size() + " elements in it.");

    //clears all elements from set
        treeSet.clear();

        TreeSet treeSetTwo = new TreeSet();

        treeSetTwo = (TreeSet)treeSet.clone();

        Iterator iterator;

        iterator = treeSetTwo.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        if(treeSet.isEmpty()) {
            System.out.println("This set is empty.");
        } else {
            System.out.println("This set is not empty.");
        }

        treeSet.remove(9);


        treeSet.clear();




        //NASTY PATH

        //this is a double, but should be in integer
        //returns null
        try {
            treeSet.add(4);
            treeSet.add(9);
            treeSet.add(11);
            System.out.println(treeSet.ceiling(8.5));
        }
        catch(Exception e){
            System.out.println("You can not insert a double here.");
        }


        //NASTY PATH

        //This tries to insert a double, but should be in an integer
        try {
            treeSet.add(8.4);
        }
        catch(Exception e){
            System.out.println("You can not add a double to this set.");
        }


        //NASTY PATH

        //This tries to insert a null
        try {
            treeSet.add(null);
        }
        catch(Exception e){
            System.out.println("No Nulls.");
        }


        //NASTY PATH

        //should return the element higher, but this is the highest element
        System.out.println(treeSet.higher(11));


        //NASTY PATH

        //Grabs the first and last element from an empty set
        TreeSet treeSetThree = new TreeSet();
        System.out.println(treeSetThree.pollFirst());
        System.out.println(treeSetThree.pollLast());


        //NASTY PATH

        //remove something that doesn't exist
        //returns false
        System.out.println(treeSetThree.remove(3));


        //NASTY PATH

        //tries to find ceiling for null
        //throws error
        try {
            System.out.println(treeSet.ceiling(null));
        }
        catch(Exception e){
            System.out.println("No NUlls.");
        }


        //NASTY PATH

        //tries to find floor for element that's lower than every element in treeSet
        //returns null
            System.out.println(treeSet.floor(1));

    }

}
