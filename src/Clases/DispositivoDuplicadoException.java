package Clases;

public class DispositivoDuplicadoException extends RuntimeException {
    public DispositivoDuplicadoException() {
        super("ID ya existe");
    }
}
