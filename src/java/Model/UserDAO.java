
package Model;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {
    
   public User check(String uname)
    {
         User u = null;
         Configuration cf=null;
         SessionFactory sf=null;
         Session session=null;
        
         try
         {
             cf=new Configuration();
             cf.configure();
             sf=cf.buildSessionFactory();
             session= sf.openSession();
             Transaction tx= session.beginTransaction();
             Query q = session.createQuery("from User where uname =:uname");
             q.setString("uname", uname);
             u = (User)q.uniqueResult();
             tx.commit();
             return u;
         }
           catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
             
         return u;
    }

 
    public boolean auth(String name , String pass){
        
        User u = null;
        u = check(name);
        if(u!=null){
            if(u.getName().equals(name) && u.getPwd().equals(pass)){
                return true;
            }
        }
           else{
        return false;
        }
        return false;
    }
        
        public Admin checkAdmin(String uname)
    {
         Admin u = null;
         Configuration cf=null;
         SessionFactory sf=null;
         Session session=null;
        
         try
         {
             cf=new Configuration();
             cf.configure();
             sf=cf.buildSessionFactory();
             session= sf.openSession();
             Transaction tx= session.beginTransaction();
             Query q = session.createQuery("from Admin where uname =:uname");
             q.setString("uname", uname);
             u = (Admin)q.uniqueResult();
             tx.commit();
             return u;
         }
           catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
             
         return u;
    }

 
    public boolean authAdmin(String name , String pass){
        
        Admin u = null;
        u = checkAdmin(name);
        if(u!=null){
            if(u.getUname().equals(name) && u.getPass().equals(pass)){
                return true;
            }
        }
        else{
        return false;
        }
        return false;
    }

    public void Add(schedule s)
    {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        Transaction t = null;
        User u = null;
        try{ 
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            t = session.beginTransaction(); 
            session.save(s);
            t.commit();
        }
        catch(Exception e ){
             e.printStackTrace();
            }
        finally{
            session.close();
            sf.close();
        }
    }
     public void AddD(driver d)
    {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        Transaction t = null;
        User u=null;
        try{ 
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            t = session.beginTransaction(); 
            session.save(d);
            t.commit();
        }
        catch(Exception e ){
             e.printStackTrace();
            }
        finally{
            session.close();
            sf.close();
        }
    }
}