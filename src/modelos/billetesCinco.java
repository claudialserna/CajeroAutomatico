package modelos;


public class billetesCinco implements IManejadora{
    public int numBill;

    @Override
    public void solicitud(Transaccion transaccion) {    
        numBill = transaccion.getMonto()/5000;

            transaccion.setMonto(transaccion.getMonto()-numBill*5000);
            transaccion.setSaldo(transaccion.getSaldo()-numBill*5000);            
            System.out.println(numBill + " billetes de $5.000");
            if(transaccion.getMonto() == 0){
                System.out.println("Su nuevo saldo es $" + transaccion.getSaldo());
                return;
            }
    }

    @Override
    public void siguiente(Transaccion transaccion) {
        
    }
    
}
