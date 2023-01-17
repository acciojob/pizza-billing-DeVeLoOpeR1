package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private boolean cheeseAdded;
    private boolean toppingAdded;
    private boolean carryBagAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg)
           this.price = 300;
        else
        {
           this.price = 400;
        }
        System.out.println("Base Price Of The Pizza: " + getPrice());
    }

    public int getPrice(){

        return this.price;
    }
    public void setPrice(int price){
        this.price +=price;
    }

    public void addExtraCheese(){
        if(!this.cheeseAdded)
        {
           this.cheeseAdded = true;
           this.price += 80;
            System.out.println("Extra Cheese Added: 80");
        }

    }

    public void addExtraToppings(){
        if(!this.toppingAdded){
            this.toppingAdded = true;
            if(this.isVeg){
               this.price += 70;
                System.out.println("Extra Toppings Added: 70");
            }
            else {
                this.price +=120;
                System.out.println("Extra Toppings Added: 120");
            }
        }
    }

    public void addTakeaway(){
        if(!this.carryBagAdded){
            this.carryBagAdded = true;
            this.price +=20;
            System.out.println("Paper bag Added: 20");
        }
    }

    public String getBill(){
        return ("Total Price: " + this.getPrice());
    }
}
