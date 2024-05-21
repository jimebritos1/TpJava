package clases;

public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {

    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;
    private Policia policiaAsociado;

    // Constructor de ArmaLarga
    public ArmaLarga(int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        super(cantMuniciones, alcance, marca, calibre, estado);
    }

    // Implementación del método compareTo de Comparable<ArmaLarga>
    @Override
    public int compareTo(ArmaLarga otraArma) {
        // Comparación por algún criterio relevante para tu aplicación
        // En este ejemplo, se compara por el nivel de arma
        return Integer.compare(this.nivelArma, otraArma.nivelArma);
    }


    // Métodos getter y setter para justifUso
    public String getJustifUso() {
        return justifUso;
    }

    public void setJustifUso(String justifUso) {
        this.justifUso = justifUso;
    }

    // Métodos getter y setter para nivelArma
    public int getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    // Métodos getter y setter para tieneSello
    public boolean isTieneSello() {
        return tieneSello;
    }

    public void setTieneSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    // Implementación del método abstracto Policia(Policia) definido en Arma
    @Override
    public void Policia(Policia policia) {
        // Asignar el policía proporcionado al atributo de instancia policiaAsociado
        this.policiaAsociado = policia;
    }

    // Implementación del método abstracto setPolicia(Policia) definido en Arma
    @Override
    public void setPolicia(Policia policia) {
        // Asignar el policía proporcionado al atributo de instancia policiaAsociado
        this.policiaAsociado = policia;
    }

    // Otros métodos y atributos...
}

