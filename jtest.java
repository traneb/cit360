
public class jtest {

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
