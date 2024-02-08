package Empleado;

public class Empleado {
 
    private String nombre;
    private int cedula;
    private int sueldoBase;
    private int valorHorasExtras;
    private int cantidadHorasExtras;
    private String estadoCivil;
    private int numeroDeHijos;
    
    public int calculoHorasExtra(){
        
        int total = getCantidadHorasExtras() * getValorHorasExtras();
        
        return total;
        
    }

    public void informacionBasica(){
        
        System.out.println("El Nombre Del Empleado Es: " +  getNombre() );
        System.out.println("La Cedula Del Empleado Es: " + getCedula());
        System.out.println("El Estado Civil Del Empleado Es: " + getEstadoCivil());
        if(getNumeroDeHijos() == 0){
            System.out.println("El Empleado No Tiene Hijos");
        }else{
            System.out.println("El Empleado Tiene "+ getNumeroDeHijos()+" Hijos");
        }
        
        
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(int valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public int getCantidadHorasExtras() {
        return cantidadHorasExtras;
    }

    public void setCantidadHorasExtras(int cantidadHorasExtras) {
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumeroDeHijos() {
        return numeroDeHijos;
    }

    public void setNumeroDeHijos(int numeroDeHijos) {
        this.numeroDeHijos = numeroDeHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}