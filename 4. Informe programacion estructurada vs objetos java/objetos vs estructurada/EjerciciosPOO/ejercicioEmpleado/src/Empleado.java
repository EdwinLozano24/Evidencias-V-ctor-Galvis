public class Empleado {

    // Atributos que tendra el empleado
    public String nombre;
    public String cargo;
    public double salario;

    // Constructor que obtendra y sabra que datos exactos se utilizaran

    public Empleado(String cargo, String nombre, double salario) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.salario = salario;
    }

    

  
    // GET and SET para obtener y poner el nombre y devolverlo
    // Es easy la verdad con un video de 5m ya te la sabes v.v

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    
    

    
}
