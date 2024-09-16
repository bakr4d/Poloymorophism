/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poloymorphism;

/**
 *
 * @author Lenovo
 */
public class Dog {// بنضرب امثله علي overloading في الافعالل والصفات 
    
   private String name;
   private int age;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name ,int age) {
        this.age = age;
        this.name=name;
    }
   
    
    
   public void  add(int num1 ,int num2){
       
   }// علشان اشيل الايرور لازم  اما اغير نوع او اسم الميثود او اغير الداتا تايب بتاعت variblues
   public void add(int num3 , int num4, int num5 ){
   }
    
    

}
