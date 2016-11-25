package com.compilers.segcookhelper;



import java.util.LinkedList;

/**
 * Created by Jolain Poirier on 11/16/2016.
 */

public class Recipe {

    private String name;
    private String description;
    private int img; // Maybe not Image type
    private LinkedList<Ingredient> linkedIngeredient = new LinkedList<>();
    private LinkedList<Category> linkedCategory = new LinkedList<>();
    private String cookTime;

    public Recipe(String name, String cookTime, LinkedList<Category> linkedCategory, LinkedList<Ingredient> linkedIngredient, int img, String description) {
        this.name = name;
        this.cookTime = cookTime;
        this.linkedCategory = linkedCategory;
        this.linkedIngeredient = linkedIngredient;
        this.img = img;
        this.description = description;
        //TODO database.addRecipe(this)

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public void addIngredient(Ingredient ingredient){
        if(!linkedIngeredient.contains(ingredient)){
            linkedIngeredient.add(ingredient);
        } else {
            System.out.println("Ingredient " + ingredient.toString() +
                    " is already associated with recipe " + getName());
        }
    }

    public void removeIngredient(Ingredient ingredient){
        if(linkedIngeredient.remove(ingredient)) { // If the remove operation succeeded, check list size
            if(linkedCategory.size() < 1 && linkedIngeredient.size() < 1) {} //TODO database.removeRecipe(this)
        } else {
            System.out.println("Failed to remove " + ingredient.getName() + " from " + getName());
        }
    }

    public void addCategory(Category category){
        if(!linkedCategory.contains(category)) {
            linkedCategory.add(category);
        } else{
            System.out.println("Category " + category.getName() +
                    " is already associated with recipe " + getName());
        }
    }

    public void removeCategory(Category category) {
        if(linkedCategory.remove(category)) { // If the remove operation succeeded, check list size
            if(linkedCategory.size() < 1 && linkedIngeredient.size() < 1) {} //TODO database.removeRecipe(this)
        } else {
            System.out.println("Failed to remove " + category.getName() + " from " + getName());
        }
    }

    public Ingredient[] getIngredientArray(){
        return (Ingredient[])linkedIngeredient.toArray();
    }

    public Category[] getCategoryArray(){
        return (Category[])linkedCategory.toArray();
    }

    //TODO possibly add more info to toString
    public String toString(){
        return name;
    }
}
