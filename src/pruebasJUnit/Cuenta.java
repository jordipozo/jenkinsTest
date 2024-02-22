/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasJUnit;

/**
 *
 * @author Jordi
 */
public class Cuenta {
    // Atributos
    private String numero; //Número cuenta bancaria
    private float  saldo;  //Saldo cuenta
    private String nombre; //Nombre titular
    // Constructor
    public Cuenta (String numCta, float saldoCta, String nombreCta){
        numero=numCta;
        saldo=saldoCta;
        nombre = nombreCta;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public float getSaldo(){
        return saldo;
    }
        
    public String getNombre(){
        return nombre;
    }
    
    public void setNumero(String numCta){
        numero=numCta;
    }
    
    public void setSaldo(float saldoCta){
        saldo=saldoCta;
    }

    public void setNombre(String nombreCta){
        nombre=nombreCta;
    }
    
    public void ingresarDinero(float importe){
        saldo = saldo + importe;
    }
    
    public void retirarDinero(float importe){
        saldo = saldo + importe;
    }
    
    public void mostrarCuenta(){
        System.out.println("Nº Cuenta: " + getNumero());
        System.out.println("Saldo actual: "+ getSaldo()+" €");
        System.out.println("Titular: " + getNombre());
        
    }
}
