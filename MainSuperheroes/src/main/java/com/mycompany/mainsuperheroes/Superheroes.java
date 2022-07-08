
package com.mycompany.mainsuperheroes;


public class Superheroes {
    String name;
    String country;
    String power;
    int points=0;
    
    public Superheroes(String name,String country,String power,int points){
        this.name=name;
        this.country=country;
        this.power=power;
        this.points=points;
    }
    @Override
    public String toString(){
        return "Super "+name+" desde "+country+ " con su habilidad "+power+" consigue: "+points+" puntos";
        
    }
    
}
