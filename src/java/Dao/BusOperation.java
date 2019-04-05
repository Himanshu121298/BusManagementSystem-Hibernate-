/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Buses;
import Bean.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hp
 */
public class BusOperation implements BusDeclaration {
     SessionFactory sf;
    Session ss;
    Transaction tr;

    public BusOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public long insertBus(Buses st) {
       tr = ss.beginTransaction();
       
        long l = (Long) ss.save(st);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public long upDate(long id, Buses st) {
    tr=ss.beginTransaction();
        st.setB_id(id);
        try{
            ss.update(st);
            tr.commit();
            return id;  
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean deleteinfo(long id) {
    tr = ss.beginTransaction();
        Buses st = new Buses();
        st.setB_id(id);
        try {
            ss.delete(st);
            tr.commit();
            return true; 
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Buses selectBuses(long id) {
    Buses st=(Buses)ss.get(Buses.class,id);
        if(st!=null)
        {
            return st;
        }
        return null;
    }

    @Override
    public List selectAllBuses() {
      tr = ss.beginTransaction();
        String hql = "from Bean.Buses";
        Query query = ss.createQuery(hql);
        List<Buses> li = query.list();
        ListIterator lit = li.listIterator();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }

    @Override
      public List searchByRoute(String BusRoute) {
        Criteria criteria=ss.createCriteria(Buses.class);
        criteria.add(Restrictions.like("BusRoute","%"+BusRoute+"%"));
        List li=criteria.list();
        if(li.size()>0){
            return li;
        }
      return null;
    }
    

}
