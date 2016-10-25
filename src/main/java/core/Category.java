package core;

import resourses.Categorytype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category {



     //static double totalPrice;
    int i=0;
    Bill bill = new Bill();

    public void calculateTotalPrice(double price, Categorytype categorytype){
        
        System.out.println("Order item:"+ categorytype + "  "+ "ItemPrice:" + price);
       }

    public double displayBill(){

        double totalPrice = bill.sendBill();
        System.out.println("The total price of items are:"+ totalPrice);
        return totalPrice;

    }




}
