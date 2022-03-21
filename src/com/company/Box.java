package com.company;

import java.util.ArrayList;

public class Box <B>{

   public static  <B> void method(){
           ArrayList<Box> arrayList = new ArrayList<>();
           arrayList.add(new Box());
       System.out.println("Salam -> "+arrayList);
   }

}
