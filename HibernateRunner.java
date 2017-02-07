import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HibernateRunner {
    private List<User> users;
    private HibernateConfig theHibernateUtility;

    public HibernateRunner(){
        theHibernateUtility = new HibernateConfig();
    }

    public static void main(String[] args){

        HibernateRunner aSillyHibernateUseExample = new HibernateRunner();
        aSillyHibernateUseExample.addNewUsers();
        aSillyHibernateUseExample.showAllUsers();
        aSillyHibernateUseExample.modifyUser();
        aSillyHibernateUseExample.addSharedPhoneNumber();
        aSillyHibernateUseExample.deleteAddedUsers();

    }

   // add records
    private void addNewUsers() {
        Session session = theHibernateUtility.getCurrentSession();
      
        Transaction transaction = session.beginTransaction();
      // new users
        User aNameUser = new User();
        aNameUser.setUname("aName");
        aNameUser.setPword("aPass");

        User billyUser = new User();
        billyUser.setUname("billy");
        billyUser.setPword("bob");

        User sammyUser = new User();
        sammyUser.setUname("sammy");
        sammyUser.setPword("hagar");


       //commits to database
        session.save(aNameUser);
        session.save(billyUser);
        transaction.commit();
       //prints out user
        System.out.println("aUser ID is: " + aNameUser.getId());
        System.out.println("Input user ID is: " + billyUser.getId());
    }

  // list users
    private void showAllUsers() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();
       
        Query allUsersQuery = session.createQuery("select u from User as u order by u.id");
       //query users
        users = allUsersQuery.list();
        System.out.println("number of  users: "+users.size());
        
        Iterator<User> iter = users.iterator();;
        while(iter.hasNext()) {
            User element = iter.next();
            System.out.println(element.toString());
            System.out.println("number of phone numbers: "+element.getPhoneNumbers().size());
        }
        transaction.commit();
    }

   // making changes to the database
    private void modifyUser() {

        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();
       
        Query singleUserQuery = session.createQuery("select u from User as u where u.uname='billy'");
        User billyUser = (User)singleUserQuery.uniqueResult();
       //Insert new name
       billyUser.setUname("bobby");
       
        session.merge(billyUser);

        
        transaction.commit();
     //commit the changes
        showAllUsers();
    }

    private void addSharedPhoneNumber() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();
      
        Query bobbyQuery = session.createQuery("select u from User as u where u.uname='bobby'");
        User bobbyUser = (User)bobbyQuery.uniqueResult();

        Query aNameQuery = session.createQuery("select u from User as u where u.uname='aName'");
        User aNameUser = (User)aNameQuery.uniqueResult();

      
        PhoneNumber sharedPhoneNumber = new PhoneNumber();
        sharedPhoneNumber.setPhone("(555)555-5555");

       //add number to user

        Set<PhoneNumber> bobbyPhoneNumbers = bobbyUser.getPhoneNumbers();
        bobbyPhoneNumbers.add(sharedPhoneNumber);
       
        Set<PhoneNumber> aNamePhoneNumbers = aNameUser.getPhoneNumbers();
        aNamePhoneNumbers.add(sharedPhoneNumber);
      //hibernate number
        session.save(sharedPhoneNumber);
       
        session.merge(bobbyUser);
        session.merge(aNameUser);
      //insert to database
        transaction.commit();
      
        showAllUsers();
    }
    private void deleteAddedUsers() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        int numUsers = users.size();
        System.out.println("user number: " + numUsers);
       for(int i = 0; i < numUsers; i++){
            System.out.println("delete user "+users.get(i).getUname());
            session.delete(users.get(i));
        }
        transaction.commit();
       
        System.out.println(users);
        users.clear();
       //return to original state
        System.out.println(users);
    }
}
