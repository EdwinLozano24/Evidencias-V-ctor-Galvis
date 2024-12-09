import java.util.Scanner;

// PUEDEN USAR JOPTIONPANE si lo desea
// Yo prefiero usar SCANNER ya que el otro no me funciono en mi pc x,d ns porque

public class ejercicioEstudiantePOO2 {
    public static void main(String[] args) throws Exception {


        // Tomamos la clase estudiante como un objeto es decir
        // Crearemos aquí un objeto de Estudiante que se llamará est

        Estudiante est; 
        
        // Declaramos variables a utilizar, estas deben ser  EXACTAMENTE iguales
        // a las que se puso en la clase Estudiante
        String nombre;
        double nota1, nota2;

        // Utilidad scanner me da pija explicar xdddd almacena datos y eso
        Scanner name = new Scanner(System.in);
        Scanner not1 = new Scanner(System.in);
        Scanner not2 = new Scanner(System.in);

        // Iteracion for que en este caso se repetira hasta llegar al 3 
        

        for (int i = 1; i < 4; i++) {
        // Solicitar los datos
        System.out.println("Ingrese el nombre del " + i + " Estudiante: ");
        nombre = name.next();
        System.out.println("Ingrese la nota 1 del parcial del " + i + " Estudiante: ");
        nota1 = not1.nextDouble();
        System.out.println("Ingrese la nota 2 del parcial del " + i + " Estudiante: ");
        nota2 = not2.nextDouble();

        // Dichos datos que se solicitaron al principio se iran guardando en los metodos
        // previamente hechos en la clase Estudiante

        // Usaremos el est que creamos es decir el objeto de Estudiante

        est = new Estudiante(nombre);
        est.asignarNota1(nota1);
        est.asignarNota2(nota2);
        est.calcularNotaFinal();

        // Mostrar por pantalla la informacion y notas y promedio del estudiante y la funcion IF 
        // previamente creada en Estudiante EASY papa

        System.out.println("Querido estudiante: " + est.nombre + " Su nota 1 fue de: " + est.obtenerNota1() + " Su nota 2 fue de: " + est.obtenerNota2() + " El promedio de sus 2 notas parciales es de: " + est.obtenerNotaFinal() + " Usted" + est.obtenerMensaje());
        



 
        }


    }

}
