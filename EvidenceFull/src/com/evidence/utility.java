
package com.evidence;


public class utility {
    public boolean chechkEmailValidityNew(String email){
     int atpos = email.indexOf("@");
     int dotpos = email.indexOf(".");
     
     if(atpos >1 && (dotpos-atpos)>2 && dotpos<email.length()-2){
     return true;
     }else{
        return false;
     }
    }
}
