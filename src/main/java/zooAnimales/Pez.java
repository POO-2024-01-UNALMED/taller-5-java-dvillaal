package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
    private ArrayList<Pez> listado = new ArrayList<>();
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez crearSalmon(String nombre, int edad, String genero){
        colorEscamas = "rojo";
        cantidadAletas = 6;
        String habitat = "oceano";
        Pez a = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        salmones++;
        return a;
    }

    public Pez crearBacalao(String nombre, int edad, String genero){
        colorEscamas = "gris";
        cantidadAletas = 6;
        String habitat = "oceano";
        Pez a = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas );
        bacalaos++;
        return a;
    }

    public ArrayList<Pez> getListado(){
        return listado;
    }
    public void setlistado(ArrayList<Pez> listado){
        this.listado = listado;
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public int getCantidadAletas(){
        return cantidadAletas;
    }
    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }

    public int cantidadPeces(){
        return salmones + bacalaos;
    }

    public String movimiento() {
        return "nadar";
    }
}
