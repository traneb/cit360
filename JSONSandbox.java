package JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.quickconnectfamily.json.*;

import java.io.File;

public class JSONSandbox {

    public static void main(String[] args) {

        try {
//happy paths
            File myFile = new File("FileData.json");
            FileOutputStream fileOut = new FileOutputStream(myFile);
            FileInputStream fileIn = new FileInputStream(myFile);

            JSONOutputStream jsonOut = new JSONOutputStream(fileOut);
            JSONInputStream jsonIn = new JSONInputStream(fileIn);

            //Change this to qcjson
            VehicleBean car1 = new VehicleBean("Ford", "f150", 2015,"black");
            VehicleBean car2 = new VehicleBean("Chevy", "Blazer", 1992,"white");
            VehicleBean car3 = new VehicleBean("Dodge", "Sprinter", 2014,"red");

            //writes the data into a file
            jsonOut.writeObject(car1);
            jsonOut.writeObject(car2);
            jsonOut.writeObject(car3);


            String jsonString1 = JSONUtilities.stringify(car1);
            System.out.println("JSON: "+jsonString1);
            String jsonString2 = JSONUtilities.stringify(car2);
            System.out.println("JSON: "+jsonString2);
            String jsonString3 = JSONUtilities.stringify(car3);
            System.out.println("JSON: "+jsonString3);

            //jsonIn.readObject reads data and store it to a hashmap
            HashMap parsedJSONMap = (HashMap) jsonIn.readObject();

           
             System.out.println(parsedJSONMap.get("color")); 
            System.out.println();

//nasty paths below
            System.out.println("Nasty path examples");
            System.out.println();
            System.out.println();

            // entering in null
            VehicleBean car4 = new VehicleBean(null,null,null,null);
            jsonOut.writeObject(car4);

            String jsonString4 = JSONUtilities.stringify(car4);
            System.out.println("JSON: "+jsonString4);

            // entering in empty strings and 0 for year
            VehicleBean car5 = new VehicleBean("","",0,"");
            jsonOut.writeObject(car5);

            String jsonString5 = JSONUtilities.stringify(car5);
            System.out.println("JSON: "+jsonString5);
            System.out.println();

            // Null string
            String jsonString6 = JSONUtilities.stringify(null);
            System.out.println("JSON: "+jsonString6);

            // Get Null from ParsedJSONMap
            System.out.println(parsedJSONMap.get(null));


            // read and parse object twice,
            File DbFile = new File("double.json");
            FileOutputStream DbOut = new FileOutputStream(DbFile);
            FileInputStream DbIn = new FileInputStream(DbFile);

            JSONOutputStream DbjsonOut = new JSONOutputStream(DbOut);
            JSONInputStream DbjsonIn = new JSONInputStream(DbIn);

            DbjsonOut.writeObject(car1);
            DbjsonOut.writeObject(car1);

           

            // try to write to a file without proper perms
            File accessFile = new File("NoAccess.json");
            FileOutputStream aOut = new FileOutputStream(accessFile);
            FileInputStream aIn = new FileInputStream(accessFile);

            JSONOutputStream accessOut = new JSONOutputStream(aOut);
            JSONInputStream accessIn = new JSONInputStream(aIn);

            accessOut.writeObject(car3);

            


            // Creating a file without a name 
            File NullFile = new File("");
            FileOutputStream fOut = new FileOutputStream(NullFile);
            FileInputStream fIn = new FileInputStream(NullFile);

            JSONOutputStream jOut = new JSONOutputStream(fOut);
            // this causes a null pointer exeption
            JSONInputStream jIn = new JSONInputStream(null);

            // Write to a string that does not exist
            jOut.writeObject(car4);

            // Parse a string that does not exist
            System.out.println();
            HashMap parsedNONMap = (HashMap) jIn.readObject();
            System.out.println(parsedNONMap.get("color")); //get method
            System.out.println();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
