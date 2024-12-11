package Clases;

public class DispositivoNoEncontradoException extends RuntimeException {
    public DispositivoNoEncontradoException() {
        super("Dispositivo no existe");
    }
}
