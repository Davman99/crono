/*
 * UnidadTiempo.java
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package cronometro.logica;

/** Esta clase se instancian las variables tope y valor y hace la operacion de 
 * avanzar y retroceder los valores de las unidades de  tiempo.
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class UnidadTiempo {
    
    private int tope;
    private int valor;

    public UnidadTiempo(int tope) {
        this.tope = tope;
        this.valor = 0;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String obtenerValorFormateado() {
        if (this.valor < 10 && this.tope >10) {
            return "0" + this.valor;
        } else {
            return String.valueOf(this.valor);
        }
    }
    /*
     * Suma uno a "valor" y si este es igual a tope lo iguala a 0.
     */
    public void avanzar() {
        valor++;
        if (valor == tope) {
            valor = 0;
        }
    }
    /*
    * Resta uno a "valor" y si este es menor a 0, lo iguala a tope y le resta uno.
    */
    public void retroceder(){
        valor--;
        if (valor < 0){
            valor = tope - 1;
        }
    }

}
