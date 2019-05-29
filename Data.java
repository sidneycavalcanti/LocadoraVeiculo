/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sidney
 */
public class Data {
    
    
    
    public void retornaData(){
     Date data = new Date(System.currentTimeMillis());  
      SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy");
      
      String dtalu = formatarDate.format(data);
   
   }


}