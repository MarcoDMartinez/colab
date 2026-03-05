public class Alumno {
    String nombre;
    private  String matricula;
    private  double promedio;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public void setpromedio(double promedio){
         this.promedio = promedio;
    }

    public double promedio(){
        return this.promedio();
    }

    public void calcularPromedio(){
        System.out.println("Promedio: " + this.promedio);
    }


    //metodo del alumno
    //mostrar calcular promedio

    public void mostrarAlumno(){
        System.out.println("---Reporte del alumno---");
        System.out.println("Nombre : " + nombre);
        System.out.println("matricula: " + matricula);
        System.out.println("Promedio final");
    }

    }

