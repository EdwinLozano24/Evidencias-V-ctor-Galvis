import java.util.ArrayList;

public class Empresa {

     
    // EMPRESA NO TENDRA ATRIBUTOS ES DECIR, aquí lo que nos interesa
    // es contratar y almacenar dichos empleados en una array (fila) para ellos y crear funciones

    // Creamos el array (fila) para la clase empleado que se llamara empleados
    public ArrayList <Empleado> empleados; // empleados es el nombre de array no confundir
    
    //constructor que tomara los datos del array list empleados
    // o algo asi xd
  
  
    public Empresa()
    {
    empleados = new ArrayList<Empleado>();
    }

    //método que agrega empleados a la empresa
    // el metodo sera para clase Empleado y lo llamaremos como e para no hacerlo tan largo
    
    public void contratarEmpleado(Empleado e) 
    {
    empleados.add(e); // Se agregara todos los datos del arreglo empleados es decir de la fila a la variable e 
    }

    //método que obtiene el total de empleados
    public int getTotalEmpleados()
    {
    return empleados.size();
    }

    //método que muestra el nombre y salario de todos los empleados
    public void nombreSalario()
    {
    for(Empleado e:empleados) // por cada empleado que haya esto se repetira, esto es un foreach no un FOR
    {
    System.out.println("Nombre: "+ e.getNombre()+ " Salario: " +e.getSalario());
    }
    }

    //método que retorna el total de dinero pagado a todos los empleados
    public double getTotalSalarios()
    {
    double total=0;
    for(Empleado e:empleados)
    
    
    
    
    {
    total=total+e.getSalario();
    }
    return total;
    }

    public void empleadoMayorSalario()
    {
    Empleado empMayorSalario=empleados.get(0);
    double maxSalario=empleados.get(0).getSalario();
    for(Empleado e:empleados)
    {
    if(e.getSalario()>maxSalario)
    {
    maxSalario=e.getSalario();
    empMayorSalario=e;
    }
    }
    System.out.println("El empleado que mas dinero gana es: ");
    System.out.print("Nombre: " +empMayorSalario.getNombre());
    System.out.print(" Cargo: " +empMayorSalario.getCargo());
    System.out.println(" Salario: " +empMayorSalario.getSalario());
    }

    //método que muestra el nombre, cargo y salario del empleado que menos dinero
    

    
    public void empleadoMenorSalario()
    {
    Empleado empMenorSalario=empleados.get(0);
    double menSalario=empleados.get(0).getSalario();
    
    for(Empleado e:empleados)
    {
    if(e.getSalario()<menSalario)
    {
    menSalario=e.getSalario();
    empMenorSalario=e;
    }
    }
    System.out.println("El empleado que menos dinero gana es: ");
    System.out.print("Nombre: "+empMenorSalario.getNombre());
    System.out.print(" Cargo: "+empMenorSalario.getCargo());
    System.out.println(" Salario: " +empMenorSalario.getSalario());
    }

    }


