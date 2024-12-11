package Clases;

import java.util.LinkedList;

public class Inventario {
    private LinkedList<DispositivoElectronico> dispositivos = new LinkedList<>();


    public void AgregarDispositivo(DispositivoElectronico disp){
        try {
            datosDispositivoPorId(disp.getId());
            throw new DispositivoDuplicadoException();
        } catch (DispositivoNoEncontradoException e) {
            dispositivos.add(disp);
        }

    }

    public String imprimirDatos(){
        StringBuilder resp = new StringBuilder();
        for (DispositivoElectronico dispositivo : dispositivos) {
            resp.append("_____________\n");
            resp.append(dispositivo.imprimirDatos());

        }
        return resp.toString();
    }

    public int imprimirHoras(){
        int horas = 0;
        for (DispositivoElectronico dispositivo : dispositivos) {
            horas = horas + dispositivo.getHoras();
        }
        return horas;
    }

    public void imprimirNombre(){
        System.out.println("NOMBRES: ");
        System.out.println();
        for (DispositivoElectronico dispositivo : dispositivos) {
            System.out.println(dispositivo.getNombre());
            System.out.println();
        }
    }

    public String datosDispositivoPorId(int id) throws DispositivoNoEncontradoException {
        boolean encontrado = false;
        DispositivoElectronico disp = null;
        for (DispositivoElectronico dispositivo : dispositivos) {
            if (dispositivo.getId() == id){
                encontrado = true;
                disp = dispositivo;
            }
        }
        if (encontrado){
            return disp.imprimirDatos();
        }
        else {
            throw new DispositivoNoEncontradoException();
        }
    }

}
