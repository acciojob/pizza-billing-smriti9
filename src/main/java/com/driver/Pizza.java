package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extra_Topping;
    private int extra_Cheese=80;
    private int paper_Bag=20;
    private Boolean is_Extra_Topping=false;
    private Boolean is_Extra_Cheese=false;
    private Boolean is_Paper_Bag=false;
    private Boolean is_Bill_generate=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price = 300;
            extra_Topping=70;
        }
        else {
            price = 400;
            extra_Topping=120;
        }
        bill="Base Price Of The Pizza:"+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!is_Extra_Cheese)
            price=price+extra_Cheese;
        is_Extra_Cheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!is_Extra_Topping)
            price=price+extra_Topping;
        is_Extra_Topping=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!is_Paper_Bag)
        price=price+paper_Bag;
        is_Paper_Bag=true;
    }

    public String getBill(){
        // your code goes here
       if(!is_Bill_generate) {
           is_Bill_generate=true;
           if (is_Extra_Cheese)
               bill = bill + "Extra Cheese Added:" + extra_Cheese + "\n";
           if (is_Extra_Topping)
               bill = bill + "Extra Toppings Added:" + extra_Topping + "\n";
           if (is_Paper_Bag)
               bill = bill + "Paperbag Added:" + paper_Bag + "\n";

           bill = bill + "Total Price:" + price + "\n";
       }
       //returning ans
        return this.bill;
    }
}
