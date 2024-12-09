import java.util.ArrayList;
import java.util.Scanner;

// Importamos la utilidad ArrayList o eso no les va a funcionar SIEMPRE TIENEN QUE HACERLO

public class EmpleadosEstructurada{

  public static void main(String[] args) {

    // Declaramos variables primero
    String nombre, cargo;

    double salario, total = 0, minSalario, maxSalario;

    // Variable INT cantidad para asignar cuantas veces se hara la iteracion FOR
    int cantidad, posicion = 0; // La posicion del Array

    // Creamos 3 arrays (Listas para almacenar cada uno de los datos del empleado)
    
    ArrayList<String> nombres = new ArrayList<String>(); // para los nombres

    ArrayList<Double> salarios = new ArrayList<Double>(); // para los salarios
       
    ArrayList<String> cargos = new ArrayList<String>(); // para los cargos
      
    // Usamos util java Scanner para almacenar los datos que se le pediran luego en el FOR al usuario
    Scanner cantidades = new Scanner(System.in);
    Scanner names = new Scanner(System.in);
    Scanner salari= new Scanner(System.in);
    Scanner carg = new Scanner(System.in);
     
    // Pedir que ingrese cantidad de empleados que se agregaran
     System.out.println("Ingresar cantidad de empleados");
     cantidad = cantidades.nextInt();
     
    for (int i =1 ; i <= cantidad ; i++) {

        // Solicitar los datos x terminal del empleado 
          System.out.println("Ingrese el nombre del empleado");
          nombre = names.next();
          System.out.println("Ingrese el cargo del empleado");
          cargo = carg.next();
          System.out.println("Ingrese el salario del empleado");
          salario = salari.nextDouble();
          
        // Agregar los datos que se solicitaron en el arreglo (Fila) correspondiente

          nombres.add(nombre);
          salarios.add(salario);
          cargos.add(cargo);
          
         
     }
      
    // Mostrar total de empleados
    System.out.println("El total de empleados es: " + cantidad);

    // Mostrar los nombres y salarios de los empleados
    System.out.println("Los nombres y salarios son: ");


    // Se hace una iteracion for para ir mostrando cada empleado junto con su salario correspondiente
    for (int i =0; i < cantidad ; i++) {
        System.out.println("Nombres: " + nombres.get(i) + " Salarios: " + salarios.get(i));
          
      }
      
    // Una iteracion FOR para ir sumando cada uno de los salarios asignados
    for (int i =0; i < cantidad ; i++) {

          total = total + salarios.get(i);
          
      }
      
      // Mostrar por terminarl el total de salarios de los empleados

      System.out.println("El total de salarios pagados es de: " +total);
      
      // Asignar el empleado que mas dinero gana
      System.out.println("El empleado que mas dinero gana es: ");
      // el max salario va ser igual a lo que contenga el arreglo salarios desde la primera posicion
      // es decir la 1 (los arreglos empienzan desde 0 no desde 1)
      maxSalario = salarios.get(0);
      

      // Se realiza iteracion con if para ir comparando con es el mayor salario de todos los que hay
      // en el arreglo, desde la primera posicion que fue desde donde es inicio originalmente
      for (int i =1; i < cantidad ; i++) {
          // Comparacion con if todos los salarios y saber cual es el mayor y segun ello
          // asignar max salario el salario mayor que este en x posicion
          if(salarios.get(i) > maxSalario) {
              maxSalario = salarios.get(i);
              posicion = i;
          }
      }

      // Mostrar la persona con mayor salario en la posicion que esta (EJM: Juanpilaguna posicion = 2, cargo = x, salario = x)
      
      System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario: " + salarios.get(posicion));
      
      
      // Mismo proceso que el del arriba pero esta vez comparando cual es el menor y no el mayor

      System.out.println("El empleado que menos dinero gana es: ");
      minSalario = salarios.get(0);
      
      
      for (int i =1; i < cantidad ; i++) {
          
          if(salarios.get(i) < minSalario) {
              minSalario = salarios.get(i);
              posicion = i;
          }
      }
      
      System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario: " + salarios.get(posicion));
      
      
      
      
      
      
      
      
      
      
     

     
     
  }
  
}