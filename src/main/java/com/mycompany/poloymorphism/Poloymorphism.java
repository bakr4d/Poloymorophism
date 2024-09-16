/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poloymorphism;

/**
 *
 * @author Lenovo
 */
public class Poloymorphism {

    public static void main(String[] args) {
        
        //Polymorphism
        Animal a1=new Dog ();// this dog is an animal ..يعني العبارة صحيحه عادي
       Animal a2;// انا عرفت متغير من نوع حيوان
       a2=new Dog ();
       a2 =new Cat();
       
       Small s1=new Cat(); // i can take from abstract or interface by this way
       Small s3=new Dog();
       
       // he he ze 
       int x;
       x=3;
       x=4;
       
       
      
    
}
}

