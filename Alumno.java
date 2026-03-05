public class Alumno {
    String nombre;
    protected String matricula;
    protected double calificacion1;
    protected double  calificacion2;
    protected double  calificacion3;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    //metodo del alumno
    //mostrar calcular promedio
    public double calcularPromedio(){
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public void mostrarAlumno(){
        System.out.println("---Reporte del alumno---");
        System.out.println("");
    }

    }

