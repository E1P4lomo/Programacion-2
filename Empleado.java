import java.time.LocalDate;

public class Empleado {
    
    private String dni,nombre,apellido,domicilio,fecNa;
    private double sueldoBruto;
    private String edad="";
    
    public Empleado(String dni, String nombre, String apellido, String domicilio, String fecNa, double sueldoBruto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fecNa = fecNa;
        this.sueldoBruto = sueldoBruto;
        this.edad = calcular_edad();
    }
    
    public String calcular_edad(){
        int añoNac= Integer.parseInt(fecNa.substring(6, 10));
        int añoAct = LocalDate.now().getYear();
        int obtenerEdad = añoAct - añoNac;
        edad=String.valueOf(obtenerEdad);
        return edad;
                
    } 
    
    public void mostrar_datos(){
        calcular_edad();
        System.out.println("dni "+ dni);
        System.out.println("nombre "+ nombre);
        System.out.println("apellido "+ apellido);
        System.out.println("domicilio "+ domicilio);
        System.out.println("Año de nacimiento "+ fecNa);
        System.out.println("Sueldo bruto "+ sueldoBruto);
        System.out.println("Edad: " +edad);
        
        
    }
}

public static void main(String[] args){
    Empleado laburante1 = new Empleado("41992409","Mauricio", "Aiello", "Avellaneda 329", "19/06/1999",2400);
    Empleado laburante2 = new Empleado("95373337","Santiago", "Diaz", "Orcones 3539", "14/06/2003",8000);
    Empleado laburante3 = new Empleado("47440699","Sofia", "Grimaldi", "Olascoagas 2020", "06/04/2006",15002);
        
    String edad = laburante1.calcular_edad();
    System.out.println();
   laburante1.mostrar_datos();

   String edad2 = laburante2.calcular_edad();
   System.out.println();
  laburante2.mostrar_datos();

  String edad3 = laburante3.calcular_edad();
  System.out.println();
 laburante3.mostrar_datos();


}
