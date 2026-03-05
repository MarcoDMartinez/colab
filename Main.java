public class Main {

    public static void main(String[] args) {
        
            Alumno alumno1 = new Alumno("Pedro");

            PedirDatos pd1 = new PedirDatos();
            int calificacion1 = pd1.pedirEntero("Escribe la primera calificación");
            int calificacion2 = pd1.pedirEntero("Escribe la segunda calificación");
            int calificacion3 = pd1.pedirEntero("Escribe la tercera calificación");

            alumno1.setpromedio((calificacion1 + calificacion2 + calificacion3) / 3);

            alumno1.calcularPromedio();


    }
    
}