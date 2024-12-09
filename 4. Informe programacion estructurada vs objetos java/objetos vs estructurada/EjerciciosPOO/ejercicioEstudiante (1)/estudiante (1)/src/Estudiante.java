
public class Estudiante {

       // Creamos los atributos que posee la clase Estudiante
       // o en otras palabras las variables la misma joda
       public String nombre;
       public double nota1;
       public double nota2;
       public double notaFinal;
       


       // Asignamos los contructores es decir
       // Aquellos que no sirven para identificar
       // Los atributos que se usaran

       public Estudiante (String nombre)
       {
        this.nombre = nombre;
       }

       public Estudiante (String nombre, double np1, double np2)
       {
        this.nombre = nombre;
        nota1 = np1;
        nota2 = np2;
       }

       // Creamos los metodos que utilizaremos
       // Es decir las funciones como se hacian en PSEINT

       // Las funciones siempre van con un tipo void ya que estas
       // No devolveran ningun valor obviamente
       public void asignarNota1(double np1){
        nota1 = np1;
       }

       public void asignarNota2(double np2){
        nota2 = np2;
       }


       // Las funciones con su tipo si devolveran o retornaran un valor
       // Ejemplo la nota1 del estudiante etc..
       public double obtenerNota1(){
        return nota1;
       }

       public double obtenerNota2(){
        return nota2;
       }

       
       public void calcularNotaFinal()
       {
        notaFinal = (nota1 + nota2) / 2;
       }

       public double obtenerNotaFinal(){

        return notaFinal;
       }

       // Finalmente creamos una funcion con el nombre
       // ObtenerMnesaje que sera un IF para saber si aprobo o no segun la condicion 

       public String obtenerMensaje(){
        if(notaFinal < 3) 
        return " ha reprobado lo lamento";
        else
        return " ha aprobado felicidades";
       }









}
