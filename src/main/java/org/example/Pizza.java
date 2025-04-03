package org.example;

public class Pizza {
     String flavor;
     String topping;
     String size;
     String sauce;
     // A pizza constructor with everything
     public Pizza(String newFlavour,String newTopping, String newSize, String sauce){
         this.flavor=newFlavour;
         this.topping=newTopping;
         this.size=newSize;
         this.sauce=newSize;
     }
     //A constructor with a differnt signature
     public Pizza(String flavor, String newSize,String sauce){
        this.flavor=flavor;
        this.size=newSize;
        this.sauce=sauce;
     }

}
