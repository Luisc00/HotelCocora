package com.hotel.Model;
 public class Cliente {
     private int cedula;
     private int telefono;
     private String email;

     public Cliente(int cedula, int telefono, String email) {
         this.cedula = cedula;
         this.telefono = telefono;
         this.email = email;
     }

     public int getCedula() {
         return cedula;
     }

     public void setCedula(int cedula) {
         this.cedula = cedula;
     }

     public int getTelefono() {
         return telefono;
     }

     public void setTelefono(int telefono) {
         this.telefono = telefono;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }
 }
