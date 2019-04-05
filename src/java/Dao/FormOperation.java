/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Contact;
import org.hibernate.*;

/**
 *
 * @author hp
 */
public class FormOperation implements FormDeclaration {
    
    SessionFactory sf;
    Session ss;
    Transaction tr;
    
    public FormOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
    }
    @Override
    public long insertQuestion(Contact st) {
       tr = ss.beginTransaction();
        long l = (Long) ss.save(st);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    }
    

