
package com.mycompany.mainsuperheroes;


public class Superheroes {
    private String name;
    private String country;
    private String power;
    private int points=0;
    
    public Superheroes(String name,String country,String power,int points){
        this.name=name;
        this.country=country;
        this.power=power;
        this.points=points;
    }
    public String getName(){
        return name;
    }
     public String getCountry(){
        return country;
    }
     public int getPoints(){
        return points;
    }
     public void setPoints(int points){
         this.points=points;
     }
     
    @Override
    public String toString(){
        return "Super "+name+" desde "+country+ " con su habilidad "+power+" consigue: "+points+" puntos";
        
    }
    
}
