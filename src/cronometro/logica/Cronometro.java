/*Cronometro.java
 *copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package cronometro.logica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * la clase Cronometro establece el cambio de las unidades de tiempo y el formato 
 * del cronometro. Ademas guarda los tiempos
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class Cronometro {
    

    private UnidadTiempo decimas;
    private UnidadTiempo segundos;
    private UnidadTiempo minutos;
    private UnidadTiempo horas;
    private ArrayList<Memoria> memorias;
    
    
    /** Asignar los valores de tope a las unidades de tiempo*/
    
    public Cronometro() {
        
        decimas = new UnidadTiempo(10);
        segundos = new UnidadTiempo(60);
        minutos = new UnidadTiempo(60);
        horas = new UnidadTiempo(24);
        memorias = new ArrayList<Memoria>();
    }
    
    public UnidadTiempo getDecimas() {
        return decimas;
    }

    public void setDecimas(UnidadTiempo decimas) {
        this.decimas = decimas;
    }

    public UnidadTiempo getSegundos() {
        return segundos;
    }

    public void setSegundos(UnidadTiempo segundos) {
        this.segundos = segundos;
    }

    public UnidadTiempo getMinutos() {
        return minutos;
    }

    public void setMinutos(UnidadTiempo minutos) {
        this.minutos = minutos;
    }

    public UnidadTiempo getHoras() {
        return horas;
    }

    public void setHoras(UnidadTiempo horas) {
        this.horas = horas;
    }
    /**
     * Avanza las unidadede tiempo y analizan cuando estas llegan al tope para
     * aumentar en uno la siguiente 
     */
    public void avanzar() {
        decimas.avanzar();
        if (decimas.getValor()==decimas.getTope()-1) {
            segundos.avanzar();
            if (segundos.getValor() == segundos.getTope()-1) {
                minutos.avanzar();
                if (minutos.getValor() == minutos.getTope()-1) {
                    horas.avanzar();
                }
            }
        }
    }
    /**
     * Retrocede las unidadede tiempo y analizan cuando estas llegan al 0 para
     * disminuir en uno la anterior
     */
    public void retroceder(){
        decimas.retroceder();
        if(decimas.getValor() == decimas.getTope()-1){
            segundos.retroceder();
            if(segundos.getValor() == segundos.getTope()-1){
                minutos.retroceder();
                if(minutos.getValor() == minutos.getTope()-1){
                    horas.retroceder();
                }
            }
        }
    }
    /**
     * Le da formato al cronometr0
     */
    public String obtenerTiempo() {
        return horas.obtenerValorFormateado() + " : "
                + minutos.obtenerValorFormateado() + " : "
                + segundos.obtenerValorFormateado() + " : "
                + decimas.obtenerValorFormateado();
    }
    /**
     * Guarda los valores de decimas, segundos, minutos y horas para luego mostrarlos
     * 
     */
    public void guardarMemoria() {
        Memoria m = new Memoria();
        
        m.setValorDecimas(decimas.getValor());
        m.setValorSegundos(segundos.getValor());
        m.setValorMinutos(minutos.getValor());
        m.setValorHoras(horas.getValor());
        
        memorias.add(m);
        
    }
    /**
     * Muestra los valores almacenados en Memoria
     */
    public void mostrarMemorias() {
        for (Memoria memoria : memorias) {
            System.out.println("memoria : " + memoria.obtenerTiempo());
        }
    }

}
