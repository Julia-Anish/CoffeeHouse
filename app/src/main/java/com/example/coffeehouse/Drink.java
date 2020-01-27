package com.example.coffeehouse;

public class Drink {
    private String name;
    private String description;


    public static final Drink [] drinks = {
            new Drink("Latte", "It is a coffee-based drink made primarily from espresso and steamed milk. It consists of one-third espresso, two-thirds heated milk and about 1cm of foam. The foam can be poured in such a way to create a picture."),
            new Drink("Cappuccino", "It is a coffee-based drink made primarily from espresso and milk. It consists of one-third espresso, one-third heated milk and one-third milk foam"),
            new Drink("Amaretto", "It is a liqueur with an almond flavor, but surprisingly, it may or may not contain almonds. The standard base of the liqueur is primarily made from either apricot pits or almonds or both."),
            new Drink("Green Tea","It is a type of tea that is made from Camellia sinensis leaves and buds that have not undergone the same withering and oxidation process used to make oolong teas and black teas. Green tea originated in China, but its production and manufacture has spread to other countries in East Asia.")

    };
    private Drink (String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}
