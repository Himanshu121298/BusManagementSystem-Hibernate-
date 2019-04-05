/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Buses;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public interface BusDeclaration {
   public long insertBus(Buses st);
   public long upDate(long id,Buses st);
   public boolean deleteinfo(long id);
   public Buses selectBuses(long id);
   public List selectAllBuses();
   public List searchByRoute(String BusRoute); 
}
