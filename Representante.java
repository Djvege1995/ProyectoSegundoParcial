/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Personas.Usuario;


public class Representante extends Usuario{
    private String cedulaRepresentante,nombreRepresentante,telefonoRepresentante,emailRepresentante;

   
  
    public Representante(String cedulaRepresentante, String nombreRepresentante, String telefonoRepresentante, String emailRepresentante) {
        super(cedulaRepresentante,nombreRepresentante,telefonoRepresentante,emailRepresentante);
    }
    
    
    
    public  String getCedulaRepresentante(){
        return cedulaRepresentante;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    
    public String getEmailRepresentante() {
        return emailRepresentante;
    }
    
    //Todo esto seria sobreescritura

    public void setNombre(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public  void setCedula(String cedulaRepresentante){
      this.cedulaRepresentante = cedulaRepresentante;
    }

    public  void setTelefono(String telefonoRepresentante){
      this.telefonoRepresentante = telefonoRepresentante;
    }

    public  void setEmail(String emailRepresentante){
      this.emailRepresentante = emailRepresentante;
    }
    
}