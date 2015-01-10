/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitytimetablemanagement;

/**
 *
 * @author amrutha
 */
public class userClass {
    static String userType = " ";
    
   public userClass(){}
   
   static public String userget(){
       return userType;
       
   }
   
   static public void userset(String str){
   userType = str;
   }
}
