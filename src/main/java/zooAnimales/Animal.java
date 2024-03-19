package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private ArrayList<Zona> listado = new ArrayList<>();

    public Animal (String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String movimiento(){
        return "Desplazarse";
    }


}
