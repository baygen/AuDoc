/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audoc.model.dbrelation;

import com.audoc.model.entity.Seanses;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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

    
    public void addSeanse (Object seanse) {
       
        Session ses = getSessionFactory().openSession();
        
        Seanses s=(Seanses)seanse;
        Transaction tr = ses.beginTransaction();
        String queryByDate="SELECT s FROM Seanses s where s.seansesTime like '"+s.getSeansesTime()+"%'";
       
        try{
            List<Seanses> res=ses.createQuery(queryByDate).list();
            if(res.isEmpty()){
                ses.save(s);
                tr.commit();
            }else{
                if((JOptionPane.showConfirmDialog(null, "Перезаписати сеанс?"))==JOptionPane.YES_OPTION){
                    ses.delete(res.get(0));
                    ses.save(s);
                tr.commit();
                }
            }
        }catch(HibernateException e){
            tr.rollback();
        }
        ses.close();
    }
    

    public List<Seanses> getListByDate(LocalDate date) {
        
        Session ses =getSessionFactory().openSession();
        ses.beginTransaction();
        String getByDate="SELECT s FROM Seanses s where s.seansesTime like '"+date+"%'";
        
        List<Seanses> res=ses.createQuery(getByDate).list();
        
        ses.getTransaction().commit();
//        ses.flush();
            try{
                ses.close();
            }catch(HibernateException he){
                JOptionPane.showMessageDialog(null, he.getMessage());
            }
        return (!res.isEmpty())?res: null;   
        
    }

    public List<?> getSeanseByPacientName(String name) {
        
        Session ses = getSessionFactory().openSession();
        ses.beginTransaction();
        
        List<Seanses> res = ses.getNamedQuery("Seanses.findByPacientName")
                .setString("pacientName", name).list();
        ses.getTransaction().commit();
        try{
            ses.close();
        }catch(HibernateException he){
        }
        return res;
    }

    
    public List<?> getAllSeanse() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        query = session.createQuery("SELECT s FROM Seanses s");
//        getNamedQuery("Seanse.findAll");
        List<?> res = query.list();
        session.getTransaction().commit();
        
        try{
            session.close();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null, he.getMessage());
        }
        return res;
    }

    public int removeByDate(Timestamp datetime) throws HibernateException{
        
        int res = 0;
            Session session = getSessionFactory().openSession(); 
            String rem = "DELETE FROM Seanses s WHERE s.seansesTime = '"+datetime+"%'";
            
            session.beginTransaction();
            session.createQuery(rem).executeUpdate();
//        session.delete(seans);
            session.getTransaction().commit();
            res = 1;
        return res;
    }
     
}
