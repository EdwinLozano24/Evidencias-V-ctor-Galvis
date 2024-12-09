import java.util.Scanner;


public class ejercicioEmpleadoPOO2 {
    public static void main(String[] args) throws Exception {

        // Creamos las variables exactas c

        int cantidad; // Siempre que vea un cantidad hace referencia a solicitar cuantas veces el for se repetira y ya
        String nombre;
        String cargo;
        double salario;

    
        // Creamos un objeto de la clase empresa llamado empresa xd 
        Empresa empresa = new Empresa(); // el de color blanco es el nombre y el que esta en mayusculas es la clase objeto

        // Utilidad scanner vean un video esa vaina es re facil de usar xd
        Scanner cantidades = new Scanner(System.in);

        Scanner nombres = new Scanner(System.in);

        Scanner cargos = new Scanner(System.in);

        Scanner salarios = new Scanner(System.in);
    

        // Cantidad
        System.out.println("Ingrese cantidad de empleados");
        cantidad = cantidades.nextInt();

        // Iteracion segun cantidad FOR
        
        for (int i = 0; i <= cantidad ; i++) {
            // Solicitar los datos del empleado
            System.out.println("Ingresar nombre del empleado");
            nombre = nombres.next();
            System.out.println("Ingresar cargo del empleado");
            cargo = cargos.next();
            System.out.println("Ingresar salario del empleado");
            salario = salarios.nextInt();
            // Agregar los datos del objeto empresa osea la clase :V
            // al metodo o funcion contratarEmpleado y que atributos agregar
            empresa.contratarEmpleado(new Empleado(cargo, nombre, salario));



        } 


        // Mostrar por terminal o pantalla xd la misma joda
        // el total y todo eso la misma joda pero ahora llamando a las funciones previamente creadas en la clase Empresa
        // asi nos ahorramos linea de codigo y se ve mas organizado WUALA esto es POO papa

        System.out.println("Numero total de empleados: " + empresa.getTotalEmpleados());

      
        System.out.println("Nombres y salarios de los empleados son: ");
        empresa.nombreSalario();

        System.out.println("Total de dinero pagado a todos es de: " + empresa.getTotalSalarios());

        empresa.empleadoMayorSalario();
        empresa.empleadoMenorSalario();





 
        }


    }




