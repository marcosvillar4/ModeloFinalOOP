package Clases;

public class Smartphone extends DispositivoElectronico {
    private double bateria;
    private double pantalla; // Ocultamiento


    // Creacion de constructor

    public Smartphone(int id, String nombre, int horas, double bateria, double pantalla) {
        super(id, nombre, horas);
        this.bateria = bateria;
        this.pantalla = pantalla;
    }


    //Getters y setters para encapsulamiento

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String imprimirDatos(){
        String resp = super.imprimirDatos();
        resp = resp + getBateria();
        resp = resp + "\n";
        resp = resp + getPantalla();
        resp = resp + "\n";
        return resp;
    }
}
