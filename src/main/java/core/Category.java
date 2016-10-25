package core;

import resourses.Categorytype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category {

    public List<Double> SelectedItems = new ArrayList<Double>();

     //static double totalPrice;
    int i=0;
    Bill bill = new Bill();

    public void calculateTotalPrice(double price, Categorytype categorytype){
        //SelectedItems.add(price);
        System.out.println("Order item:"+ categorytype + "  "+ "ItemPrice:" + price);
       }

    public void displayBill(){

        double totalPrice = bill.sendBill();
        System.out.println("The total price of items are:"+ totalPrice);

    }




}
