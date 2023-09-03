package modelos;

public class billetesCincuenta implements IManejadora {
    public int numBill;

    @Override
    public void solicitud(Transaccion transaccion) {
        numBill = transaccion.getMonto()/50000;

        if (numBill != 0) {
            transaccion.setMonto(transaccion.getMonto() - numBill * 50000);
            transaccion.setSaldo(transaccion.getSaldo() - numBill * 50000);
            System.out.println(numBill + " billetes de $50.000");
            if (transaccion.getMonto() != 0) {                
                siguiente(transaccion);
            }else {
                System.out.println("Su nuevo saldo es " + transaccion.getSaldo());
                return;
            }
        } else
            siguiente(transaccion);
   
    }

    @Override
    public void siguiente(Transaccion transaccion) {

        billetesVeinte monto = new billetesVeinte();
        monto.solicitud(transaccion);
    }

}
