package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    public static int total;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        total++;
    }

    public Anfibio crearRana(String nombre, int edad, String genero){
        colorPiel = "rojo";
        venenoso = true;
        String habitat = "selva";
        Anfibio a = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
        ranas++;
        return a;
    }

    public Anfibio crearSalamandra(String nombre, int edad, String genero){
        colorPiel = "negro y amarillo";
        venenoso = true;
        String habitat = "selva";
        Anfibio a = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso );
        salamandras++;
        return a;
    }

    public ArrayList<Anfibio> getListado(){
        return listado;
    }
    public void setlistado(ArrayList<Anfibio> listado){
        this.listado = listado;
    }
    public String getcolorPiel(){
        return colorPiel;
    }
    public void setcolorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }
    public boolean getVenenoso(){
        return venenoso;
    }
    public void setvenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        return total;
    }

    public String movimiento() {
        return "saltar";
    }
}
