package com.example.recyclerviewexercise;

public class Food {
    private String foodName;
    private int thubmnail;

    public Food(String foodName, int thubmnail) {
        this.foodName = foodName;
        this.thubmnail = thubmnail;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getThubmnail() {
        return thubmnail;
    }

    public void setThubmnail(int thubmnail) {
        this.thubmnail = thubmnail;
    }
}
