package ejercicio1_sem2;

/**
 *
 * @author zc201
 */
public class Ejercicio1_sem2 {
public static void main(String[] args) {
        
         NumberFormat formato = new DecimalFormat("#0.00");
        double rebaja, iva, preT,pre1, preF, total;
                
        rebaja = 0.15;
        iva = 0.13;
        preT= 0.0;
        
   
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese precio de la computadora");
        double n = leer.nextDouble();
        
        preT = n * iva;
        pre1 = n + preT;
        preF = pre1* rebaja;
        total = pre1 - preF;
        
         System.out.println("El total del precio es: $" +formato.format(total));

        



    }
}
