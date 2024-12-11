package Clases;

public class Laptop extends DispositivoElectronico{
    private int ram;
    private int almacenamiento;

    public Laptop(int id, String nombre, int horas, int ram, int almacenamiento) {
        super(id, nombre, horas);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }


    // Getters y setters para encapsulamiento
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String imprimirDatos(){
        String resp = super.imprimirDatos();
        resp = resp + getRam();
        resp = resp + "\n";
        resp = resp + getAlmacenamiento();
        resp = resp + "\n";
        return resp;
    }
}
