package core;


import resourses.furnitureType;

import java.util.HashMap;

public class Furniture extends Category {

    HashMap<furnitureType,Integer> furn = new HashMap();
    private furnitureType type;
    private int quantity,val;
    public double price;
    Bill bill = new Bill();



    public void setMap(){
        furn.put(furnitureType.DiningTable,1000);
        furn.put(furnitureType.Sofa,  800);
        furn.put(furnitureType.TVUnit, 500);
    }

    public Furniture(furnitureType type, int quantity){

        this.type = type;
        this.quantity = quantity;
        setMap();
        calculatePrice();

    }

    public void calculatePrice(){

        val = furn.get(type);

        price = (quantity * val);

         bill.getPrice(price);
        calculateTotalPrice(price,type);


    }



}
