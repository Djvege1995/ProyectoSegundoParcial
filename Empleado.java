/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import Main.Servicio;
import Personas.Cliente;
import Personas.Usuario;
import java.util.*;

public class Empleado extends Usuario {
    private Tipo estado;
    static ArrayList <Servicio> listaServiciosEmpleado = new ArrayList<> (); 

//Constructor de Empleados
    public Empleado(String cedula, String nombre, String telefono,String email, Tipo estado, ArrayList<Servicio> listaServiciosEmpleado) {
        super(cedula, nombre, telefono,email);
        this.estado = estado;
        this.listaServiciosEmpleado=listaServiciosEmpleado;
    }

    public Tipo getEstado() {
        return estado;
    }

    public void setEstado(Tipo estado) {
        this.estado = estado;
    }

    public ArrayList <Servicio> getListaServiciosEmpleado(){
      return listaServiciosEmpleado;
    }

    public static void setListaServiciosEmpleado(ArrayList<Servicio> listaServiciosEmpleado) {
        Empleado.listaServiciosEmpleado = listaServiciosEmpleado;
    }
    
    

    

  


  // Muestra el submenu y desarrolla las opciones 
  public static void modificarEmpleado(ArrayList<Empleado> lista_empleados,ArrayList<Servicio> lista_servicio){
      Scanner opcion =new Scanner(System.in);
      System.out.println("1. agregar empleado");
      System.out.println("2. editar empleado");
      System.out.println("3. eliminar empleado");
      System.out.println("4. Salir");
      System.out.println("Cual es su opcion: ");
      int op=opcion.nextInt();
      opcion.nextLine();
      // Crea el empleado 
      if(op==1){
          creaEmpleado(lista_empleados,lista_servicio);
      }
// Edita el empleado 
      if(op==2){
          Empleado emp = null;
          System.out.println("EDITAR EMPLEADO");
          System.out.println("ingrese Cedula del empleado: ");
          String empleadoced=opcion.nextLine();
          while(!(emp != null)){
          for(Empleado e:lista_empleados){
              if(e.getCedula().equals(empleadoced)){
                  emp = e;
              }   
            }
            if(!(emp != null)){
              System.out.println("Cedula de empleado no encontrada, ingresar otra: ");
              empleadoced=opcion.nextLine();
            }
          }
          System.out.println("ingrese la nueva cedula del empleado: ");
          String cedulaSeleccionada= opcion.nextLine();
          emp.setCedula(cedulaSeleccionada);
          System.out.println("ingrese el nuevo telefono del empleado: ");
          String telefonoSelecionado= opcion.nextLine();
          emp.setTelefono(telefonoSelecionado);
          System.out.println("ingrese el nuevo email del empleado");
          String emailSeleccionado= opcion.nextLine();
          emp.setEmail(emailSeleccionado);    
          String i="S";
          while(!(i.equals("N"))){
              System.out.println("Servicios: ");
            for(Servicio s: lista_servicio){
                System.out.println(s.getNombre_Servicio());
            }
            
            System.out.println("Servicio nuevo que realiza el empleado: ");
            String servicioNuevoEmpleado = opcion.nextLine();
            ArrayList<Servicio> servnewemp = new ArrayList<Servicio>();
            for (Servicio s : lista_servicio){
              if(s.getNombre_Servicio().equals(servicioNuevoEmpleado)){
                  servnewemp.add(s);
                }
              
            }
            System.out.println("Desea anadir otro servicio? (S/N):  ");
            String respuesta = opcion.nextLine();
            if (respuesta.equals("N")){
              emp.setListaServiciosEmpleado(servnewemp);
              i ="N";
            } else i="S";
            
              
              }
          
          
          //modificaEmpleado(lista_empleados,lista_servicio,emp);
          //opcion.close();
               
         
 
        } 
      // Elimina el empleado cambiando el tipo de ACTIVO a INACTIVO
      if(op==3){
          Empleado emp = null;
          System.out.println("Que empleado desea despedir ");
          for(Empleado e:lista_empleados){
              System.out.println(e.getCedula());
          }
          
          System.out.println("Ingrese la cedula: ");
          String empleadoced=opcion.nextLine();
          while(!(emp != null)){
              //Recorre la lista de empleados y busca la cedula pedida en la lista para cambiar el tipo
          for(Empleado e:lista_empleados){
              if(e.getCedula().equals(empleadoced)){
                  emp = e;
              }   
            }
          if(!(emp!= null)){

              System.out.println("Cedula de empleado no encontrada, ingresar otra: ");
              empleadoced=opcion.nextLine();
          }
            }
          eliminaEmpleado(lista_empleados,emp);
      }
      
  }
  // Modulacion para eliminar el empleado y ahorrar lineas de codigo 
  public static void eliminaEmpleado(ArrayList<Empleado> lista_empleados,Empleado emp){
      for(Empleado e:lista_empleados){
            if ((e.getCedula().equals(emp.getCedula()))){
              e.setEstado(Tipo.INACTIVO);}}
      
  }
  // Modulacion para editar el empleado y ahorrar lineas de codigo 
  public static void modificaEmpleado(ArrayList<Empleado> lista_empleados, ArrayList<Servicio> lista_servicio, Empleado emp){
      Scanner opcion = new Scanner(System.in);
      
      
  }
  
  
  // Modulacion para crear un nuevo empleado y ahorrar lineas de codigo 
  public static void creaEmpleado(ArrayList<Empleado> lista_empleados,ArrayList<Servicio> lista_servicio){
      Scanner opcion = new Scanner(System.in);
      System.out.println("Ingrese la informacion.- ");
          System.out.println("ingrese la cedula del empleado: ");
          String nuevaCedula = opcion.nextLine();
          System.out.println("ingrese el nombre del empleado: ");
          String nuevoEmpleado= opcion.nextLine();
          System.out.println("ingrese el telefono del empleado: ");
          String nuevoTelefono= opcion.nextLine();
          System.out.println("ingrese el email del empleado: ");
          String nuevoEmail= opcion.nextLine();
          System.out.println("ingrese el tipo de empleado: ");
          String empleadoTipo= opcion.nextLine();
          ArrayList<Servicio> listaClonada= new ArrayList<Servicio>();
    
         String i="S";
          while(i!="N"){
            System.out.println("Servicio que realiza el empleado: ");
           
            for(Servicio s: lista_servicio){
                System.out.println(s.getNombre_Servicio());
            }
            System.out.println("Seleccionar: ");
            String servicioEmple = opcion.nextLine();
            boolean encuentraconf = false;
            for (Servicio servicio : lista_servicio){
              if (servicio.getNombre_Servicio().equals(servicioEmple)){
                  encuentraconf = true;
              listaClonada.add(servicio);}}
            if(!encuentraconf){
                System.out.println("No se ha encontrado el servicio");
            }
            System.out.println("Desea anadir otro servicio? (S/N):  ");
            String respuesta = opcion.nextLine();
            if (respuesta.equals("N")){
              i ="N";
            } else i="S";
          }
        
        
          
          if(empleadoTipo.equals("ACTIVO")){
            lista_empleados.add(new Empleado(nuevaCedula,nuevoEmpleado,nuevoTelefono,nuevoEmail,Tipo.ACTIVO,listaClonada));}
          if(empleadoTipo.equals("INACTIVO")){
            lista_empleados.add(new Empleado(nuevaCedula,nuevoEmpleado,nuevoTelefono,nuevoEmail,Tipo.INACTIVO,listaClonada));}
      
  }
  
  


  
  @Override
  public String toString(){
      
      
      ArrayList<String> lista_nombre_servicios = new ArrayList<>();
      for (Servicio servicio1 : listaServiciosEmpleado){
      lista_nombre_servicios.add(servicio1.getNombre_Servicio());
      }
      return super.toString()+", "+"Estado:"+estado+", Servicio/Servicios que brinda: "+lista_nombre_servicios;   
  }
  
   
}