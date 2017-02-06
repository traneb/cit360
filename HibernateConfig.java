import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateConfig

{

    private SessionFactory sessionFactory;

    public HibernateConfig() {
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        //change the code to match my MySQL URL and port

        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost8080:360/polaris");

        //change your MySQL user name and password.

        config.setProperty("hibernate.connection.username", "BenjaminTrane");

        config.setProperty("hibernate.connection.password", "Trane6352113");

        //change the pool size to 1 to start

        config.setProperty("hibernate.connection.pool_size", "1");

        // tests for error test.hibernate_sequence

        config.setProperty("hibernate.id.new_generator_mappings","false");

        config.setProperty("hibernate.connection.autocommit", "true");

        config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

		

       // config.setProperty("hibernate.hbm2ddl.auto", "create-drop");

        config.setProperty("hibernate.show_sql", "true");

        config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

        config.setProperty("hibernate.current_session_context_class", "thread");

		
		 //  Add your classes to your database tables
		 //  User and a PhoneNumber class.
		 

        config.addAnnotatedClass(User.class);

        config.addAnnotatedClass(PhoneNumber.class);

         
         ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        

        sessionFactory = config.buildSessionFactory(serviceRegistry);
    }

    public  Session getCurrentSession() {

        return sessionFactory.getCurrentSession();

    }

}