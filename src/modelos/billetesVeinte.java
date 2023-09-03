package modelos;

public class billetesVeinte implements IManejadora{
    public int numBill;

    @Override
    public void solicitud(Transaccion transaccion) {
        if(transaccion.getMonto()<=transaccion.getSaldo()){
            numBill = transaccion.getMonto()/20000;

            if(numBill != 0 ){
                transaccion.setMonto(transaccion.getMonto()-numBill*20000);
                transaccion.setSaldo(transaccion.getSaldo()-numBill*20000);
                System.out.println(numBill + " billetes de $20.000");
                if(transaccion.getMonto() != 0){                    
                    siguiente(transaccion);
                }else {
                    System.out.println("Su nuevo saldo es " + transaccion.getSaldo());
                    return;
                }
            }else siguiente(transaccion);
        }
    }

    @Override
    public void siguiente(Transaccion transaccion) {
       
        billetesDiez monto = new billetesDiez();
        monto.solicitud(transaccion);
    }

    
    
}
