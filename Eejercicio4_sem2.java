package eejercicio4_sem2;
public class Eejercicio4_sem2 {
public static void main(String[] args) {
        
        double Salario = 300.00; 
        double Comision = 50.00;
        double Renta = 0.10;
        double SalarioC;
        double SalarioR;
        double SalarioT;
        double Renta;
        double Comi;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese nombre de el vendedor"); 
        String nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas realizo en el mes");
        double Venta = leer.nextDouble();
        
        Comi= Venta * comision;
        
        SalarioC = Salario + Comi;
        SalarioR = Salario * Renta;
        SalarioT = SalarioC - SalarioR;
        
        System.out.println("El Salatio total es de: $" + SalarioT);
        
        Renta = Salario * Renta;
        
        System.out.println("El monto a pagar de renta es de: $" + Renta);

    }
