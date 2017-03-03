

import java.util.HashMap;
import java.util.Map;

public class JavaCollectionsMap {

    public static void createMap() {

        //Creates a new map object called map
        Map<String, Integer> map = new HashMap<String, Integer>();


        //HAPPY PATH

        //sets how many there are of each book  -  map.put(key, value)
        map.put("Harry Potter", 2);
        map.put("Lord of The Rings", 7);
        map.put("Pride & Prejudice", 4);

        //map.size() finds how many items are in map
        System.out.println("There are " + map.size() + " books in total.");

        //sets key variable
        String key = "Harry Potter";

        //gets number of Harry Potter books
        System.out.println("There are " + map.get(key) + " " + key + " books.");

        //checks whether it contains a key named Harry Potter (boolean)
        if (map.containsKey(key)){
            System.out.println(key + " is a key in this map.");
        } else{
            System.out.println(key + " is not a key in this map.");
        }

        //checks whether there is a value of 3 in the map somewhere (boolean)
        if (map.containsValue(3)){
            System.out.println("3 is a value in this map.");
        } else{
            System.out.println("3 is not a value in this map.");
        }

        //checks whether the map is empty
        if (map.isEmpty()){
            System.out.println("This map is empty.");
        } else{
            System.out.println("This map is not empty.");
        }

        //removes the Harry Potter
        map.remove("Harry Potter");

        //checks again how many there are in the map
        System.out.println("There are " + map.size() + " books in total.");

        //clears all values in map
        map.clear();

        //check again how many there are in the map
        System.out.println("There are " + map.size() + " books in total.");




        //NASTY PATH

        //This will try to get the value of an element that doesn't exist.
        //returns a null within the string
        map.put("Harry Potter", 2);
        map.put("Lord of The Rings", 7);
        map.put("Pride & Prejudice", 4);
        System.out.println("There are " + map.get("Sense & Sensibility") + " books.");


        //NASTY PATH

        //This one tries to remove an item that doesn't exist
        // returns null
        System.out.println(map.remove("Wuthering Heights"));


        //NASTY PATH

        //This one enters an empty string as the key - only one null/empty string can exist in a single map.
        //the key is an empty string
        map.put("", 5);
        System.out.println(map);


        //NASTY PATH

        //Insert a null key and null value
        //inserts as null
        map.put(null, null);
        System.out.println(map);


        //NASTY PATH

        //remove a null
        //removes the null element
        map.remove(null);
        System.out.println(map);


        //NASTY PATH

        //add two of the same item
        //replaces the old element
        map.put("Harry Potter", 7);
        System.out.println(map);



      
    }

}