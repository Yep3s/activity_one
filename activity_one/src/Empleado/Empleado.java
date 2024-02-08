package Empleado;

public class Empleado {

    private String nombre;
    private int cedula;
    private int sueldoBase;
    private int valorHorasExtras;
    private int cantidadHorasExtras;
    private String estadoCivil;
    private int numeroDeHijos;
    private int tipoEstadoCivil;
    private int retencion;
    private int salarioFinal;
    
    public int calculoHorasExtra() {

        int total = getCantidadHorasExtras() * getValorHorasExtras();

        return total;

    }

    public int calculoSueldoBruto() {

        int totalBruto = getSueldoBase() + calculoHorasExtra();

        return totalBruto;
    }

    public void informacionBasica() {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("El Nombre Del Empleado Es " + getNombre());
        System.out.println("La Cedula Del Empleado Es  " + getCedula());
        System.out.println("El Estado Civil Del Empleado Es  " + getEstadoCivil());
        if (getNumeroDeHijos() == 0) {
            System.out.println("El Empleado No Tiene Hijos");
        } else {
            System.out.println("El Empleado Tiene " + getNumeroDeHijos() + " Hijos");
        }

         System.out.println("--------------------------------------------------------------------");
    }

    public int calculoRetencion(){
        
        int totalRetencion = calculoSueldoBruto();
        
        if(getEstadoCivil().equals("casado")){
            setTipoEstadoCivil(2);
        }else{
            setTipoEstadoCivil(0);
        }
        
        
        if(totalRetencion <= 1038 ){
            
            int descuento = 19 - getNumeroDeHijos() - tipoEstadoCivil;
            
            int porcentaje = descuento / 100;
            
            int totalSalarioEnd = calculoSueldoBruto() * porcentaje;
            
            int totalDescuentoImpuesto = calculoSueldoBruto() - totalSalarioEnd;
            
            setRetencion(totalDescuentoImpuesto);
            
            System.out.println("Retencion Del 19%");
        }if(totalRetencion <= 1684){
            System.out.println("Retencion Del 24%");
        }if(totalRetencion <= 2934){
            System.out.println("Retencion Del 30%");
        }if(totalRetencion <= 5000){
            System.out.println("Retencion Del 37%");
        }if(totalRetencion <= 25000){
            System.out.println("Retencion Del 45%");
        }if(totalRetencion >= 25001){
            System.out.println("Retencion Del 47%");
        }
        
        return totalRetencion;
    }
    
    public int calculoSueldoFinal(){
        
       int totalSalarioEnd = calculoSueldoBruto() - getRetencion();
        
       return totalSalarioEnd;
    }
    
    
    public void informacionCompleta() {
        informacionBasica();

        System.out.println("El Sueldo Base Del Empleado Son " + getSueldoBase() + " Euros");
        System.out.println("El Total De Dinero Por Las Horas Extras Son " + calculoHorasExtra() + " Euros");
        System.out.println("El Total Del Sueldo Bruto Del Empleado Es " + calculoSueldoBruto() + " Euros");
        System.out.println("La Retencion Del IRPF Del Empleado Es De  " + calculoRetencion()+ " Euros");
        System.out.println("El Sueldo Neto Del Empleado Despues De Las Retenciones De IRPF Son " + calculoSueldoFinal()+ " Euros");

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

    public int getTipoEstadoCivil() {
        return tipoEstadoCivil;
    }

    public void setTipoEstadoCivil(int tipoEstadoCivil) {
        this.tipoEstadoCivil = tipoEstadoCivil;
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) {
        this.retencion = retencion;
    }

    public int getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(int salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    
    
    
}
