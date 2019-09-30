/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 *
 * @author Asus
 */
public class Desafoi04 {
   
   public void powerSet() {
       
        Set<Integer> ints = ImmutableSet.of(1,2,3);
        Set<Set<Integer>> R= Sets.powerSet(ints);
        R.forEach((set) -> {
            System.out.println(set);
        });
        
    }



    
}
