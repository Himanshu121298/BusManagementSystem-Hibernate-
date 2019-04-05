/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Student;
import HelpingClasses.BCrypt;
import java.util.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hp
 */
public class StudentOperation implements StudentDeclaration {

    SessionFactory sf;
    Session ss;
    Transaction tr;

    public StudentOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public long insertStudent(Student st) {
        tr = ss.beginTransaction();
        System.err.println(" " + st.getName());
        long l = (Long) ss.save(st);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public long upDate(long id, Student st) {
        tr=ss.beginTransaction();
        st.setS_id(id);
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
        Student st = new Student();
        st.setS_id(id);
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
    public Student selectStudent(long id) {
        Student st=(Student)ss.get(Student.class,id);
        if(st!=null)
        {
            return st;
        }
        return null;
    }

    @Override
    public List selectAllStudents() {
        tr = ss.beginTransaction();
        String hql = "from Bean.Student where account='Student'";
        Query query = ss.createQuery(hql);
        List<Student> li = query.list();
        ListIterator lit = li.listIterator();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }
   @Override
    public List selectAllFaculty() {
        tr = ss.beginTransaction();
        String hql = "from Bean.Student where account='Faculty'";
        Query query = ss.createQuery(hql);
        List<Student> li = query.list();
        ListIterator lit = li.listIterator();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }
    @Override
    public List searchByName(String name) {
        Criteria criteria=ss.createCriteria(Student.class);
        criteria.add(Restrictions.like("name","%"+name+"%")).add(Restrictions.eq("account","Student"));
        List li=criteria.list();
        if(li.size()>0){
            return li;
        }
      return null;
    }
    @Override
    public List searchByName2(String name) {
        Criteria criteria=ss.createCriteria(Student.class);
        criteria.add(Restrictions.like("name","%"+name+"%")).add(Restrictions.eq("account","Faculty"));
        List li=criteria.list();
        if(li.size()>0){
            return li;
        }
      return null;
    }

    @Override
    public Student SignIn(Student st) {
      try{
          Criteria criteria=ss.createCriteria(Student.class);
          criteria.add(Restrictions.eq("username",st.getUsername())).add(Restrictions.eq("account",st.getAccount()));;
          System.err.println("///////////////"+criteria+"///////////////");
          Student st2=(Student) criteria.uniqueResult();
          System.err.println("-------------"+st2.getPassword()+"----------");
          if(BCrypt.checkpw(st.getPassword(),st2.getPassword()))
          {
              System.err.println("///////////////"+st2+"///////////////");
             
              
              return st2;
          }
          else{
          System.err.println("................"+st2+"...............");
          }
      }
      catch(Exception ex){
            ex.printStackTrace();
        }
      
      return null;
    }

   
    

}
