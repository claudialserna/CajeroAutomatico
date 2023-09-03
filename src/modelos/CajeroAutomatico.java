package modelos;

public class CajeroAutomatico implements IManejadora{

    public int saldo = 300000;
    
    public void retiro(int monto){
        
        Transaccion transaccion = new Transaccion(monto, saldo);

        if((transaccion.getMonto())%5000 != 0){
            System.out.println("La cantidad a retirar debe ser múltiplo de $5.000");
            return;
        }
        else
           solicitud(transaccion);
    }

    @Override
    public void solicitud(Transaccion transaccion) {
        if(transaccion.getMonto()<=transaccion.getSaldo()){
            siguiente(transaccion);
        }else
            System.out.println("El monto solicitado es superior a su saldo\nSu saldo es "+ transaccion.getSaldo());
    }

    @Override
    public void siguiente(Transaccion transaccion) {

        billetesCien monto = new billetesCien();
        monto.solicitud(transaccion);

    }
}
