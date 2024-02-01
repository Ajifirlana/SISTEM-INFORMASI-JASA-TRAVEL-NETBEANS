/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem.informasi.jasa.travel.netbeans;

/**
 *
 * @author Aji
 */
public class usersession {
      private static int id;    
    private static String username;
    
    public static int get_id(){
        return id;
    }
    
    public static void set_id(int id){
        usersession.id = id;
    }
    
    
    public static String get_nama(){
        return username;
    }
    
    public static void set_nama(String username){
        usersession.username = username;
    }
}
