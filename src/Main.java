import Clases.Inventario;
import Clases.Laptop;
import Clases.Smartphone;
import Clases.Tablet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Smartphone smartphone = new Smartphone(1,"test",10,1000,10);
        System.out.println("AAAAAAAAAAAAAAAAAAAA");
        System.out.println(smartphone.imprimirTipo());
        System.out.println("BBBBBBBBBBBBBBBBBBBB");
        System.out.println(smartphone.imprimirDatos());
        System.out.println("CCCCCCCCCCCCCCCCCCCC");


        inv.AgregarDispositivo(smartphone);
        inv.AgregarDispositivo(new Laptop(2, "laptop", 10, 10, 10));
        inv.AgregarDispositivo(new Tablet(3, "laptop", 10, 10, 10));



        System.out.println(inv.imprimirDatos());
        System.out.println("DDDDDDDDDDDDDDDDDDDD");
        inv.imprimirNombre();
        System.out.println("EEEEEEEEEEEEEEEEEEEE");
        System.out.println(inv.imprimirHoras());
        System.out.println("______________");
        System.out.println(inv.datosDispositivoPorId(1));


        try{
            FileWriter fileWriter = new FileWriter("Dispositivos.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(inv.imprimirDatos());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}