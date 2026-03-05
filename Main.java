public class Main {

    public static void main(String[] args) {
        
            Alumno alumno1 = new Alumno("Pedro", "20253rd035");

            PedirDatos pd1 = new PedirDatos();
            int calificacion1 = pd1.pedirEntero("Escribe la primera calificación");
            int calificacion2 = pd1.pedirEntero("Escribe la segunda calificación");
            int calificacion3 = pd1.pedirEntero("Escribe la tercera calificación");

            alumno1.setpromedio((calificacion1 + calificacion2 + calificacion3) / 3);

            alumno1.calcularPromedio();

            alumno1.mostrarAlumno();

            Escuela alumno2 = new Escuela("Pedro", "20253rd035");

            PedirDatos pd2 = new PedirDatos();
             calificacion1 = pd2.pedirEntero("Escribe la primera calificación");
             calificacion2 = pd2.pedirEntero("Escribe la segunda calificación");
             calificacion3 = pd2.pedirEntero("Escribe la tercera calificación");

            alumno2.setpromedio((calificacion1 + calificacion2 + calificacion3) / 3);

            alumno2.calcularPromedio();

            alumno2.mostrarAlumno();


    }
    
}