import java.util.Scanner;

public class NotasEstructurada {
    public static void main(String[] args) throws Exception {



        // declaramos variables primero
    String name;
    Double noteParcial1;
    Double noteParcial2;
    Double noteFinal;

    // Se utiliza la herramienta Scanner brindada por java para almacenar los datos

    Scanner nombre = new Scanner(System.in);
    Scanner nota1 = new Scanner(System.in);
    Scanner nota2 = new Scanner(System.in);


    // Se crea estructura repetitiva FOR para un indice y se asigna el numero de veces que se repetira

for (int i = 1 ; i < 4 ; i++)
{

    // Solicitamos que ingrese por terminal los datos del estudiante y sus 2 notas
    System.out.println("Ingrese el nombre del " + i + " Estudiante: ");
    name = nombre.next();
    System.out.println("Ingrese la nota 1 del parcial del " + i + " Estudiante: ");
    noteParcial1 = nota1.nextDouble();
    System.out.println("Ingrese la nota 2 del parcial del " + i + " Estudiante: ");
    noteParcial2 = nota2.nextDouble();


    // Se hace una funcion para que calcule el promedio de las 2 notas
    noteFinal = (noteParcial1 + noteParcial2) / 2;


    // Se muestra por pantalla la informacion con sus 2 notas y el promedio
    System.out.println("Informacion del Estudiante: " + name + " Nota 1: " + noteParcial1 + " Nota 2: " + noteParcial2 + "  Resultado del promedio de las 2 notas: " + noteFinal );


    // Finalizando la iteracion, se hace una condicion IF para saber si aprobo o no

    if (noteFinal < 3) {

        System.out.println("Usted: " + name + " Reprobo");
        
    }
    else {
        System.out.println("Usted: " + name + " Aprobo");
    }

}

    }
}
