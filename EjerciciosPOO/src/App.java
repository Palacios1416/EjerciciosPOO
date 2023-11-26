import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
		public static int count;
		public static int opcion;
		public static double cantidadDeposito, cantidadRetiro;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, "Juan Pérez", "juan@example.com", "555-1234");

        System.out.println("Bienvenido, " + cuenta.getNombreCliente());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");

           while (count < 3) {
                try {
                    do {
                       opcion = scanner.nextInt();
                        if ((opcion < 1 || opcion > 3) && count < 3) {
                            System.out.println("El valor ingresado no es una opcion");
                            System.out.println("¿Qué operación desea realizar?");
                            System.out.println("1. Depositar");
                            System.out.println("2. Retirar");
                            System.out.println("3. Salir");
                            count++; 
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((opcion < 1 || opcion > 3) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
            }

            switch (opcion) {
    		case 1:
        		while (count < 3) {
            			try {                
                			System.out.print("Ingrese la cantidad a depositar: ");
                			do {
                    				cantidadDeposito = scanner.nextDouble();
                    			if (cantidadDeposito <= 0) {
                                		System.out.println("Debe ingresar una cantidad a depositar logica");
                                		System.out.print("Ingrese la cantidad a depositar: ");
                            		}
                			} while (cantidadDeposito <= 0);
                		break;
            			} catch (InputMismatchException e) {
                			System.out.println("Valor incorrecto, intente nuevamente.");
                			scanner.nextLine();
                			count++;
            			}
        		}
        		if(count == 3){
            			System.out.println("Se agotaron los intentos.");
        		}else {
            			cuenta.depositar(cantidadDeposito);        
			}
        	break;

    		case 2:
        		while (count < 3) {
            			try {                
                			System.out.print("Ingrese la cantidad a retirar: ");
                			do {
                    				cantidadRetiro = scanner.nextDouble();
                    			if (cantidadRetiro <= 0) {
                                		System.out.println("Debe ingresar una cantidad a retirar logica");
                                		System.out.print("Ingrese la cantidad a retirar: ");
                            		}
                			} while (cantidadRetiro <= 0);
                		break;
            			} catch (InputMismatchException e) {
                			System.out.println("Valor incorrecto, intente nuevamente.");
                			scanner.nextLine();
                			count++;
            			}
        		}
        		if(count == 3){
            			System.out.println("Se agotaron los intentos.");
        		}else {
            			cuenta.retirar(cantidadRetiro);        
				}
	
        	break;

    		case 3:
        		System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta luego!");
        	break;
	    }

            System.out.println("Saldo actual: $" + cuenta.getSaldo());
        

        scanner.close();
    }
}
