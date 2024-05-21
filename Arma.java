package clases;

import java.util.Scanner;

public abstract class Arma {

    private int cantMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;

    // Constructor
    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    // Getters and setters
    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public void setCantMuniciones(int cantMuniciones) {
        if (cantMuniciones >= 0) {
            this.cantMuniciones = cantMuniciones;
        } else {
            System.out.println("La cantidad de municiones no puede ser negativa");
        }
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        if (alcance <= 0.0) {
            this.alcance = alcance;
        } else {
            System.out.println("El alcance no puede ser negativo");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        if (calibre >= 0) {
            this.calibre = calibre;
        } else {
            System.out.println("El calibre no puede ser negativo");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos abstractos
    public abstract void Policia(Policia policia);

    public abstract void setPolicia(Policia policia);

    // Otros métodos
    public boolean esArmaCorta() {
        return false; // Implementa la lógica apropiada
    }

    public boolean estaEnCondiciones() {
        return estado.equals("EN USO") && calibre >= 9;
    }
}
