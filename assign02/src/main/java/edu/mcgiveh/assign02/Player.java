package edu.mcgiveh.assign02;

public class Player {

    private String firstName = "";

    private String lastName = "";

    private int height;

    private double weight;

    public String getFirstName(){

        return firstName;
    }

    public String getLastName(){

        return lastName;
    }

    public int getHeight(){

        return height;
    }

    public double getWeight(){

        return weight;
    }

    public void setFirstName(String first){

        firstName = first;
    }

    public void setLastName(String last){

        lastName = last;
    }

    public void setHeight(int totalInches){

        height = totalInches;
    }

    public void setWeight(double pounds){

        weight = pounds;
    }

    public int calculateBMI(){
        int BMI;
        BMI = (int) ((703 * weight)/(height * height));
        return BMI;
    }

    public String getNameString(){
        String name = "";
        name = (lastName + ", " + firstName);
        return name;
    }

    public String getHeightString(){
        int height = getHeight();
        int feet = 0;
        int inches = 0;
        String heightString = "";

        feet = height/12;
        inches = height%12;

        heightString = (feet +"'-" + inches + "\"");

        return heightString;

    }

    public String getWeightString(){
       double weight = getWeight();
       String weightString = "";

        weightString = (weight + " lbs.");

        return weightString;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("NAME: " + getNameString() + "\n");
        sb.append("WEIGHT: " + getWeightString() + "\n");
        sb.append("HEIGHT: " + getHeightString() + "\n");
        sb.append("BMI: " + calculateBMI() + "\n");
        return sb.toString();
    }
}

