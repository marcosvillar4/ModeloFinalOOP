package Clases;

public class Tablet extends DispositivoElectronico{
    private int resolucionX;
    private int resolucionY;

    public Tablet(int id, String nombre, int horas, int resolucionX, int resolucionY) {
        super(id, nombre, horas);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    // Getters y setters para encapsulamiento

    public int getResolucionX() {
        return resolucionX;
    }

    public void setResolucionX(int resolucionX) {
        this.resolucionX = resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    public void setResolucionY(int resolucionY) {
        this.resolucionY = resolucionY;
    }

    @Override
    public String imprimirDatos(){
        String resp = super.imprimirDatos();
        resp = resp + getResolucionX();
        resp = resp + "\n";
        resp = resp + getResolucionY();
        resp = resp + "\n";
        return resp;
    }
}
