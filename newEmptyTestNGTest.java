/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author PC
 */
public class newEmptyTestNGTest {
    
    public newEmptyTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
        String person;
    int age =0;
    boolean same_i_am= false;

    public jtest(String person, int age, boolean same_i_am) {
        this.person = person;
        this.age = age;
        this.same_i_am = same_i_am;
    }

    public void setPerson(String person) {

        this.person = person;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSame_i_am(boolean same_i_am) {
        this.same_i_am = same_i_am;
    }

    public String getPerson() {

        return person;
    }

    public int getAge() {
        return age;
    }

    public boolean isSame_i_am() {
        return same_i_am;
    }

}

