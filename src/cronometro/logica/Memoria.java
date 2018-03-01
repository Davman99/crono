/*
 * Memoria.java
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package cronometro.logica;

/** La clase Memoria
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */


public class Memoria {
    private UnidadTiempo decimas;
    private UnidadTiempo segundos;
    private UnidadTiempo minutos;
    private UnidadTiempo horas;

    public Memoria() {
        decimas = new UnidadTiempo(10);
        segundos = new UnidadTiempo(60);
        minutos = new UnidadTiempo(60);
        horas = new UnidadTiempo(24);
    }  
    
    public void setValorDecimas(int valor){
        decimas.setValor(valor);
    }
    
    public void setValorSegundos(int valor){
        segundos.setValor(valor);
    }
    
    public void setValorMinutos(int valor){
        minutos.setValor(valor);
    }
    
    public void setValorHoras(int valor){
        horas.setValor(valor);
    }
    
    public String obtenerTiempo(){
        return horas.obtenerValorFormateado()+ " : " +
                minutos.obtenerValorFormateado()+ " : " +
                segundos.obtenerValorFormateado()+ " : " +
                decimas.obtenerValorFormateado();
    }
    
        
}
