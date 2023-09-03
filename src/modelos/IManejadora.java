package modelos;

public interface IManejadora {
    
    public void solicitud(Transaccion transaccion);

    public void siguiente(Transaccion transaccion);
}
