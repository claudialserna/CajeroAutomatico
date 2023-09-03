package modelos;

public class billetesCien implements IManejadora{
    public int numBill;

    @Override
    public void solicitud(Transaccion transaccion) {
        numBill = transaccion.getMonto()/100000;

        if(numBill != 0 ){
            transaccion.setMonto(transaccion.getMonto()-numBill*100000);
            transaccion.setSaldo(transaccion.getSaldo()-numBill*100000);
            System.out.println(numBill + " billetes de $100.000");
            if(transaccion.getMonto() != 0){                 
                siguiente(transaccion);
            }else{
                System.out.println("Su nuevo saldo es " + transaccion.getSaldo());
                return;
            } 
        }else siguiente(transaccion);           
    }

    @Override
    public void siguiente(Transaccion transaccion) {
        
        billetesCincuenta monto = new billetesCincuenta();
        monto.solicitud(transaccion);
    }
}
