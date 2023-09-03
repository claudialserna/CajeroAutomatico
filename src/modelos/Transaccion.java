package modelos;

public class Transaccion {
    
    public int monto;
    public int saldo;


    public Transaccion() {
    }

    public Transaccion(int monto, int saldo) {
        this.monto = monto;
        this.saldo = saldo;
    }
    
    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getMonto() {
        return monto;
    }
    public int getSaldo() {
        return saldo;
    }

    
}
