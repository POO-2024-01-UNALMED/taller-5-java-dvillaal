package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    private ArrayList<Reptil> listado = new ArrayList<>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public Reptil crearIguana(String nombre, int edad, String genero){
        colorEscamas = "verde";
        largoCola = 3;
        String habitat = "humedal";
        Reptil a = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
        iguanas++;
        return a;
    }

    public Reptil crearSerpiente(String nombre, int edad, String genero){
        colorEscamas = "blanco y amarillo";
        largoCola = 1;
        String habitat = "jungla";
        Reptil a = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola );
        serpientes++;
        return a;
    }

    public ArrayList<Reptil> getListado(){
        return listado;
    }
    public void setlistado(ArrayList<Reptil> listado){
        this.listado = listado;
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola(){
        return largoCola;
    }
    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

    public int cantidadReptiles(){
        return iguanas + serpientes;
    }

    public String movimiento() {
        return "reptar";
    }
}
