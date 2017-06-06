/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audoc.model;

import com.audoc.model.dbrelation.HibernateUtil;
import com.audoc.model.entity.Seanses;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Buy
 */
public class Functions {
    
   private final HibernateUtil hibernateUtil;
   public static ArrayList<Seanses> allData;

    public Functions() {
        hibernateUtil = new HibernateUtil();
        allData = (ArrayList<Seanses>) hibernateUtil.getAllSeanse();
    }
   
   public void removeSeanse(Timestamp timestamp){
       hibernateUtil.removeByDate(timestamp);
       
       allData.forEach((Seanses s) -> {
           if(s.getSeansesTime().compareTo(timestamp)==0)
               allData.remove(s);
       });
   }
    
   public void addSeanse(Seanses seanse){
       if(!allData.contains(seanse)){
           seanse.setIsFirstTime(Boolean.TRUE);
       hibernateUtil.addSeanse(seanse);
       allData.add(seanse);
       }else{
           hibernateUtil.updateSeanse(seanse);
           allData.forEach((Seanses s)->{
               if(s.getSeansesTime().compareTo(seanse.getSeansesTime())==0){
                   s.setIsFirstTime(Boolean.FALSE);
                   s.setPacientName(seanse.getPacientName());
                   s.setPacientPhone(seanse.getPacientPhone());
               }
           
           });
       }
   }
    
}
