package com.compilers.segcookhelper;

import java.util.LinkedList;

/**
 * Created by Jolain Poirier on 11/16/2016.
 */

public class Category {
    // **** Instance variable

    private String name;


    // **** Constructor

    public Category(String name) {
        this.name = name;
        //TODO database.addCategory(this)
    }

    public String getName(){
        return name;
    }

    //TODO possibly add more info to toString
    public String toString(){
        return name;
    }
}



/*
private LinkedList<Recipe> linkedRecipe = new LinkedList<>();

public void addRecipe(Recipe recipe){
    if(!linkedRecipe.contains(recipe)) {
        linkedRecipe.add(recipe);
    } else{
        System.out.print("Category " + getName() +
                " is already associated with recipe "
                + recipe.getName());
    }
}

public void removeRecipe(Recipe recipe){
    if(!linkedRecipe.remove(recipe)) {
        System.out.println("Failed to remove " + recipe.getName() + " from " + getName());
    }
}

public Recipe[] getRecipeArray(){
    return (Recipe[])linkedRecipe.toArray();
}
*/
