public class Programa {
    public static void main(String[] args) {

        // Creación de empleados
        Empleado e1 = new Empleado("Juan Perez", "11111111A", 2000);
        Empleado e2 = new Empleado("Ana García", "22222222B", 2500);

        // Creación de empresas
        Empresa emp1 = new Empresa("Empresa 1", "11111111A");

        // Añadir empleados a empresas
        emp1.addEmpleado(e1);
        emp1.addEmpleado(e2);

        // Mostrar información de empleados de una empresa
        System.out.println("Empleados de " + emp1.getNombre() + ":");
        emp1.mostrarEmpleados();

        // Mostrar información de todos los empleados
        System.out.println("Todos los empleados:");
        emp1.mostrarEmpleados();
        
        System.out.println("------------------SUMAS TOTALES------------------");
        // Calcular sumas totales de sueldos brutos y netos
        double sumaSueldosBrutos = emp1.getTotalSueldosBrutos();
        double sumaSueldosNetos = emp1.getTotalSueldosNetos();

        System.out.println("Suma total de sueldos brutos: " + sumaSueldosBrutos);
        System.out.println("Suma total de sueldos netos: " + sumaSueldosNetos);
        
          // Eliminamos un empleado
          emp1.eliminarEmpleado(e2);
          System.out.println("------------------INFORMACIÓN CON UN EMPLEADO BORRADO------------------");
          // Mostramos la información de los empleados de nuevo
          emp1.mostrarEmpleados();
    }
}
