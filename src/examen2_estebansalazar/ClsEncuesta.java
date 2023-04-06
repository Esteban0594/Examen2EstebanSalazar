/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_estebansalazar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yogui
 */
public class ClsEncuesta {
    
    private List<ClsEncuesta> listaEncuestas = new ArrayList<>();
    
     private String nombre;
    private int edad;
    private String correo;
    private String tieneCarro;
    private String numAleatorio;
    
    
    public String getNumale() {
        return numAleatorio;
    }
    
    public void setNumale(String numAleatorio) {
        this.numAleatorio = numAleatorio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTieneCarro() {
        return tieneCarro;
    }

    public void setTieneCarro(String tieneCarro) {
        this.tieneCarro = tieneCarro;
    }

   
    
}
