import modelos.CajeroAutomatico;

public class App {
    public static void main(String[] args) throws Exception {
        
        CajeroAutomatico retiro = new CajeroAutomatico();
        retiro.retiro(35000);
        System.out.println("Transaccion terminada");
    }
}
