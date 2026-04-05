package test;
 
import com.student2; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration; 
 
public class studenttest2 { 
 
    public static void main(String[] args) { 
 
        Configuration cfg = new Configuration(); 
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory(); 
        Session session = factory.openSession(); 
 
        Transaction tx = session.beginTransaction(); 
 
        student2 stud = new student2(); 
        stud.setSname("Mumbai"); 
 
        session.save(stud); 
tx.commit(); 
session.close(); 
System.out.println("Data inserted successfully!"); 
} 
} 