/*
 * The Many-To-Many relationship between User and PhoneNumber objects requires two tables
 * app_user and phone_number with a transition table user_number that maps phone numbers to users.
 * The @ManyToMany annotation shows how to make the User object aware of its phone numbers.
 */

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String uname;
    private String pword;
    private int active;
    private int manager_level;
    private String session;

   // allows multiple numbers
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="user_number",
            joinColumns = { @JoinColumn( name="user_id") },
            inverseJoinColumns = @JoinColumn( name="phone_id")
    )
    private Set<PhoneNumber> phoneNumbers;
    public User() {
        this.active = 1;
        this.manager_level = 0;
        this.session = "";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pword='" + pword + '\'' +
                ", active=" + active +
                ", manager_level=" + manager_level +
                ", session='" + session + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPword() {
        return pword;
    }
    public void setPword(String pword) {
        this.pword = pword;
    }
    public Set<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public int getManager_level() {
        return manager_level;
    }

    public void setManager_level(int manager_level) {
        this.manager_level = manager_level;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setActive(int anIndicator){
        this.active = anIndicator;
    }

    public int getActive(){
        return this.active;
    }
}