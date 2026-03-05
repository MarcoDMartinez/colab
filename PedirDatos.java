import java.util.Scanner;
public class PedirDatos {
    
    private final Scanner sc;

    public PedirDatos(){

        this.sc = new Scanner(System.in);

    }

    public PedirDatos(Scanner sc){

        this.sc = sc;

    }

    // Método para textos o cadena
    public String pedirCadena(String mensaje){
        while (true) {
            
            System.out.println(mensaje+": ");
            String cadenaTemporal = sc.nextLine().trim();
            if(!cadenaTemporal.isEmpty()){
                return cadenaTemporal;
            }
            System.out.println("Error: El campo no puede estar vacio.");

        }
    }

    // Pedir caractér
        public Character pedirCaracter(String mensaje){
        while (true) {
            
            System.out.println(mensaje+": ");
            Character caracterTemporal = sc.next().charAt(0);
            if(!caracterTemporal.equals(' ')){
                return caracterTemporal;
            }
            System.out.println("Error: El campo no puede estar vacio.");
        }
    }

        // Pedir Booleano
        public Boolean pedirBooleano(String mensaje){
        while (true) {
            
            System.out.println(mensaje+": ");
            Boolean booleanTemporal = sc.nextBoolean();
            if(booleanTemporal != true || booleanTemporal != false){
                return booleanTemporal;
            }
            System.out.println("Error: El campo no puede estar vacio.");
        }
    }

    //Sobrecarga de metodos
    //Método para números enteros
    public int pedirEntero(String mensaje){
        return pedirEntero(mensaje,1,Integer.MAX_VALUE);
    }

    public int pedirEntero(String mensaje, int min, int max){
        while (true) {
            System.out.println(mensaje+": ");
            try {
                int numeroTemporal = Integer.parseInt(sc.nextLine().trim());
                if (numeroTemporal >= min && numeroTemporal <= max){
                    return numeroTemporal;
                }
                System.out.println("Error: El número debe estar entre "+min+" y "+max);
            }  catch (NumberFormatException e) {
                System.out.println("Entrada invalida, por favor ingresa un número entero.");
            }
            
        }
    }

    // Método para números decimales
    public double pedirDecimal(String mensaje){
        return pedirDecimal(mensaje, 0.01, Double.MAX_VALUE);
    }

    public double pedirDecimal(String mensaje, double min, double max){
        while (true) {
            System.out.println(mensaje+": ");
            try{

                double numeroTemporal = Double.parseDouble(sc.nextLine().trim().replace(",", ":"));
                if (numeroTemporal >= min && numeroTemporal <= max) {
                    return numeroTemporal;
                }
                System.out.println("Error: el númerp debe estar entre "+min+" y "+ max);       
            } catch (NumberFormatException e){
                System.out.println("Entrada invalida, por favor ingresa un número entero.");
            }
        }
    }
}

