package zooAnimales;

import gestion.Zona;
import zooAnimales.Animal;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    public Mamifero(String nombre, int edad, String habitat, String genero, int patas, boolean pelaje){
        super(nombre, edad, habitat, genero);
        this.patas = patas;
        this.pelaje = pelaje;
        listado.add(this);
    }

    public Mamifero crearCaballo(String nombre, int edad, String genero){
        pelaje = true;
        patas = 4;
        String habitat = "pradera";
        Mamifero a = new Mamifero(nombre, edad, habitat, genero, patas, pelaje);
        caballos++;
        return a;
    }

    public Mamifero crearLeon(String nombre, int edad, String genero){
        pelaje = true;
        patas = 4;
        String habitat = "selva";
        Mamifero a = new Mamifero(nombre, edad, habitat, genero, patas, pelaje);
        leones++;
        return a;
    }

    public ArrayList<Mamifero> getListado(){
        return listado;
    }
    public void setlistado(ArrayList<Mamifero> listado){
        this.listado = listado;
    }
    public boolean getPelaje(){
        return pelaje;
    }
    public void setPelaje(){
        this.pelaje = pelaje;
    }

    public int cantidadMamiferos(){
        return leones + caballos;
    }

}
