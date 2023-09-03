package modelos;

public class billetesDiez implements IManejadora{
    public int numBill;

    @Override
    public void solicitud(Transaccion transaccion) {
      if(transaccion.getMonto()<=transaccion.getSaldo()){
            numBill = transaccion.getMonto()/10000;

            if(numBill != 0 ){
                transaccion.setMonto(transaccion.getMonto()-numBill*10000);
                transaccion.setSaldo(transaccion.getSaldo()-numBill*10000);
                System.out.println(numBill + " billetes de $10.000");
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
        
        billetesCinco monto = new billetesCinco();
        monto.solicitud(transaccion);
    }
    
}
