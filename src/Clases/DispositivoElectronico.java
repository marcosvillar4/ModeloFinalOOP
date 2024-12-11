package Clases;

public abstract class DispositivoElectronico {
    private int id;
    private String nombre;      // Ocultamiento
    private int horas = 0;

    // Creacion del consturctor
    public DispositivoElectronico(int id, String nombre, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
    }


    // Getters y setters para encapsulamiento

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }




    public String imprimirTipo(){
        return "Es un: " + getClass().getSimpleName();
    }

    public String imprimirDatos(){
        String resp = "";
        resp = resp + getNombre();
        resp = resp + "\n";
        resp = resp + getId();
        resp = resp + "\n";
        resp = resp + getHoras();
        resp = resp + "\n";
        return resp;
    }
}
