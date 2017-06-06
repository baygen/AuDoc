/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audoc.model.dbrelation;

import com.audoc.model.entity.Seanses;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Buy
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            
            Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
            ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            
            sessionFactory = configuration.buildSessionFactory(registry);
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    private Session getOpenedSession(){
        Session s;
        try{
            s=getSessionFactory().getCurrentSession();
        }catch(HibernateException e){
            s=getSessionFactory().openSession();
        }
        return s;    
    }

    
    public void addSeanse (Object seanse) throws HibernateException{
        
        Session session=getOpenedSession();
        Seanses s=(Seanses)seanse;
        session.beginTransaction();
//            String queryByDate="SELECT s FROM Seanses s where s.seansesTime like '"+s.getSeansesTime()+"%'";
//            try{
//                List<Seanses> res=ses.createQuery(queryByDate).list();
//                if(res.isEmpty()){
        session.save(s);
            try{
                session.getTransaction().commit();
//                }else{
//                    if((JOptionPane.showConfirmDialog(null, "Перезаписати сеанс?"))==JOptionPane.YES_OPTION){
//                        ses.createNativeQuery("UPDATE seanses SET pacientName= " +s.getPacientName()
//                            +", pacientPhone="+s.getPacientPhone()+" WHERE seansesTime="
//                            + s.getSeansesTime());
//                        ses.save(s);
//                        tr.commit();
//                    }
//                }
            }catch(HibernateException e){
                session.getTransaction().rollback();
                throw new HibernateException("This time already exist.");
            }
        }    
    public void updateSeanse(Seanses seanse){
        Session session =getOpenedSession();
        String updateQuery="UPDATE s Seanses SET s.pacientName="
                +seanse.getPacientName()+" s.pacientPhone ="
                +seanse.getPacientPhone()+" s.isFirstTime="
                +seanse.getIsFirstTime()+" WHERE s.seansesTime="
                +seanse.getTime();
    }

    public List<?> getListByDate(LocalDate firstDate, LocalDate secondDate) throws NullPointerException{
        
        Session session = getOpenedSession();
        session.beginTransaction();
        String getByDate="";
        
            if(firstDate!=null&&secondDate!=null){
                getByDate="SELECT s FROM Seanses s where s.seansesTime like '"+firstDate+"%'"
                    +" AND s.seansesTime LIKE '"+secondDate+"%'";
            }else if(firstDate!=null){
                getByDate="SELECT s FROM Seanses s where s.seansesTime like '"+firstDate+"%'";
            }
        
        List<Seanses> res=session.createQuery(getByDate).list();
            try{
                session.getTransaction().commit();
            }catch(HibernateException e){
                session.getTransaction().rollback();
            }   
        return res;
        
    }

    public List<?> getSeanseByPacientName(String name) {
        
        String queryByName = "SELECT s FROM Seanses s WHERE s.pacientName LIKE"+name+"%";
        Session ses = getOpenedSession();
        ses.beginTransaction();
        
        List<Seanses> res = ses.createQuery(queryByName).list();
        ses.getTransaction().commit();
        try{
            ses.close();
        }catch(HibernateException he){
        }
        return res;
    }

    
    public List<Seanses> getAllSeanse() {
        Session session = getOpenedSession();
        session.beginTransaction();
        
        List<Seanses> res=session.createQuery("SELECT s FROM Seanses s").list();
//        getNamedQuery("Seanse.findAll");
            try{
                session.getTransaction().commit();
            }catch(HibernateException e){
                session.getTransaction().commit();
            }
        return res;
    }

    public int removeByDate(Timestamp datetime) throws HibernateException{
        
        int res = 0;
        try (Session session = getSessionFactory().openSession()) { 
            String remove = "DELETE FROM Seanses s WHERE s.seansesTime = '"+datetime+"%'";
            
            session.beginTransaction();
            session.createQuery(remove).executeUpdate();
            session.getTransaction().commit();
            res = 1;
        }
        return res;
    }
     
}
