package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private boolean cheeseAdded;
    private boolean toppingAdded;
    private boolean carryBagAdded;
    private boolean billIsGenerated;
    private String bill;
    private int cheese;
    private int topping;


    public Pizza(Boolean isVeg) {
        this.bill = "";
        this.carryBagAdded = false;
        this.cheeseAdded = false;
        this.toppingAdded = false;
        this.billIsGenerated = false;
        this.isVeg = isVeg;
        if (this.isVeg)
        {
            this.price = 300;
            this.topping = 70;
        }
        else
        {
            this.price = 400;
            this.topping = 120;

        }
        this.cheese = 80;
        System.out.println("Base Price Of The Pizza: " + this.price);
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
           this.price += this.cheese;
        }

    }

    public void addExtraToppings(){
        if(!this.toppingAdded){
            this.toppingAdded = true;
            this.price+=topping;
        }
    }

    public void addTakeaway(){
        if(!this.carryBagAdded){
            this.carryBagAdded = true;
            this.price +=20;
        }
    }

    public String getBill()
    {
        if(!billIsGenerated) {
            this.billIsGenerated = true;
            if (cheeseAdded)
                this.bill += "Extra Cheese Added: 80"+ "\n";
            if (toppingAdded)
                this.bill += "Extra Toppings Added: "+this.topping +"\n";
            if (carryBagAdded)
                this.bill += "Paperbag Added: 20"+" \n";
            this.bill += "Total Price: " + this.price + "\n";
        }
        return bill;
    }
}
