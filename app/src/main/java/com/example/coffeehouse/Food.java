package com.example.coffeehouse;

public class Food {
    private String name;
    private String description;
    private  int imageResourceId;


    public static final Food [] dessert = {
            new Food("Pancakes", "Five pancakes made from flour milled in the Smokies. Served with our house made, warm maple syrup, and real whipped butter.", R.drawable.pancakes),
            new Food("Waffles", "The Original Belgian Sugar Waffle smeared with peanut butter, with or without a dip in Belgian milk chocolate ", R.drawable.waffles),
            new Food("Panna cotta", "It   is an Italian dessert of sweetened cream thickened with gelatin and molded. The cream may be aromatized with coffee, vanilla, or other flavorings.",R.drawable.pannacotta)


    };
    private Food (String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }


    public String toString(){
        return this.name;
    }


}
