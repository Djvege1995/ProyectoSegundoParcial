/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Personas.Representante;
import Personas.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

//Uso de herencia
public class Cliente extends Usuario{
    private Representante datosRepresentante;

    public Cliente(Representante datosRepresentante, String cedula, String nombre, String telefono,String email) {
        super(cedula, nombre, telefono,email);
        this.datosRepresentante = datosRepresentante;
    }

    public Representante getDatosRepresentante() {
        return datosRepresentante;
    }

    public void setDatosRepresentante(Representante datosRepresentante) {
        this.datosRepresentante = datosRepresentante;
    }

    @Override
    public String toString() {
        return "datosRepresentante = ||" + datosRepresentante+" || , "+super.toString();
    }
 //Presentacion de sub menu 
  public static void modificarCliente(ArrayList<Cliente> lista_cliente){
    Scanner opcion =new Scanner(System.in);
    System.out.println("1. agregar cliente");
    System.out.println("2. editar cliente");
      System.out.println("3. Salir");
    System.out.println("Cual es su opcion: ");
    int op=opcion.nextInt();
    opcion.nextLine();

    if(op==1){
      System.out.println("Ingrese la informacion.- ");
          System.out.println("ingrese la cedula del cliente: ");
          String nuevaCedula = opcion.nextLine();
          System.out.println("ingrese el nombre del cliente: ");
          String nuevoCliente= opcion.nextLine();
          System.out.println("ingrese el telefono del cliente: ");
          String nuevoTelefono= opcion.nextLine();
          System.out.println("ingrese el email del cliente: ");
          String nuevoEmail= opcion.nextLine();

        
          System.out.println("Ingrese la informacion del representante.- ");
          System.out.println("ingrese la cedula del representante: ");
          String nuevaCedulaRepresentante = opcion.nextLine();
          System.out.println("ingrese el nombre del representante: ");
          String nuevoRepresentante= opcion.nextLine();
          System.out.println("ingrese el telefono del representante: ");
          String nuevoTelefonoRepresentante= opcion.nextLine();
          System.out.println("ingrese el email del representante: ");
          String nuevoEmailRepresentante= opcion.nextLine();
          //Todos los datos pedidos previamente para agregarlos en rp, el cual es un objeto de tipo Representante
          Representante rp=new Representante(nuevaCedulaRepresentante,nuevoRepresentante,nuevoTelefonoRepresentante,nuevoEmailRepresentante);
          //Creando nuevo cliente y anadiendolo a la lista
          lista_cliente.add(new Cliente(rp,nuevaCedula,nuevoCliente,nuevoTelefono,nuevoEmail )); 
    }

    if(op==2){
      System.out.println("EDITAR CLIENTE");
      //for para mostrar todos los clientes que ya estan en la lista
        for(Cliente c:lista_cliente){
            System.out.println(c.getCedula());}

        System.out.println("ingreselo: ");
          String clienteSeleccionado=opcion.nextLine();
          boolean confirmacion = false;
          Cliente climod = null;
          for(Cliente c:lista_cliente){
            if(c.getCedula().equals(clienteSeleccionado)){
              confirmacion = true;
              climod = c;
                } 
            }
            
          if(!confirmacion){
              System.out.println("No se encontro el cliente.");
              return;
          }
          modificarCliente(climod);
              
            }  
      }
  // Modulacion para modificar el cliente y ahorrar lineas de codigo
  public static void modificarCliente(Cliente c){
      Scanner opcion = new Scanner(System.in);
      System.out.println("ingrese el nuevo nombre del cliente: ");
              String nuevoNomCliente= opcion.nextLine();
              c.setNombre(nuevoNomCliente);
              System.out.println("ingrese el nuevo telefono del cliente: ");
              String nuevoTelefCliente= opcion.nextLine();
              c.setTelefono(nuevoTelefCliente);
              System.out.println("ingrese el nuevo email del cliente");
              String nuevoEmailCliente= opcion.nextLine();
              c.setEmail(nuevoEmailCliente);
              
              creaRepresentante(c);
  }
  // Modulacion para crear el representante del cliente y ahorrar lineas de codigo 
  public static void creaRepresentante(Cliente c){
      Scanner opcion = new Scanner(System.in);
       System.out.println("ingrese el nuevo nombre del representante: ");
              String nuevoNomRepresentante= opcion.nextLine();
              c.getDatosRepresentante().setNombre(nuevoNomRepresentante);
             
              System.out.println("ingrese la nueva cedula del representante: ");
              String nuevoCedulaRepresentante= opcion.nextLine();
              c.getDatosRepresentante().setCedula(nuevoCedulaRepresentante);
             
              System.out.println("ingrese el nuevo telefono del representante: ");
              String nuevoTelefonoRepresentante= opcion.nextLine();
              c.getDatosRepresentante().setTelefono(nuevoTelefonoRepresentante);
             
              System.out.println("ingrese el nuevo email del representante: ");
              String nuevoEmailRepresentante= opcion.nextLine();
              c.getDatosRepresentante().setEmail(nuevoEmailRepresentante);
  }
  
}
    