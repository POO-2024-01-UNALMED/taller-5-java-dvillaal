package zooAnimales;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave crearHalcon(String nombre, int edad, String genero){
        colorPlumas = "cafe glorioso";
        String habitat = "montanas";
        Ave a = new Ave(nombre, edad, habitat, genero, colorPlumas);
        halcones++;
        return a;
    }

    public Ave crearAguila(String nombre, int edad, String genero){
        colorPlumas = "blanco y amarillo";
        String habitat = "montanas";
        Ave a = new Ave(nombre, edad, habitat, genero, colorPlumas);
        aguilas++;
        return a;
    }

    public ArrayList<Ave> getListado(){
        return listado;
    }
    public void setlistado(ArrayList<Ave> listado){
        this.listado = listado;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public String movimiento(){
        return "volar";
    }
}
