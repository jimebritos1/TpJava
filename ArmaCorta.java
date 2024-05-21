package clases;

public class ArmaCorta extends Arma {

    private Policia policiaAsociado;

    // Constructor
    public ArmaCorta(int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        super(cantMuniciones, alcance, marca, calibre, estado);
    }

    // Implementación del método abstracto Policia
    @Override
    public void Policia(Policia policia) {
        // Aquí puedes implementar la lógica para asociar el policía al arma corta
        this.policiaAsociado = policia;
        System.out.println("Se ha asociado al policía " + policia.getNombre() + " con el arma corta.");
    }

    // Implementación del método abstracto setPolicia
    @Override
    public void setPolicia(Policia policia) {
        // Aquí puedes implementar la lógica para establecer el policía asociado al arma corta
        this.policiaAsociado = policia;
        System.out.println("Se ha asociado al policía " + policia.getNombre() + " con el arma corta.");
    }

    // Otros métodos y atributos...


private boolean automatica;


    //Get and Set automatica
    public void setAutomatica(boolean automatica){

        this.automatica = automatica;
    }

    public boolean getAutomatica() {

        return automatica;
    }

    // Metodo

    public boolean esEfectivaEnMetros(){

        if(getAlcance() >= 200){

            return true; }
        else {
            return false;
        }
    }
}
