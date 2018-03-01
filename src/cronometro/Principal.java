/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package cronometro;

import cronometro.logica.Cronometro;
import java.util.Timer;
import java.util.TimerTask;

/**
 * La clase principal es la que llama a las demas clases e imprime los resultados.
 * En ella tambien se encuentra anidada la funcion timer y timer task la cual nos permite
 * estandarizar el conteo en tiempo real.
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class Principal {
    /*Esta clase llama a la subclase Cronometro y a la subclase Memoria y utiliza sus
    * datos para la impresion de los mismos al usuario.
    */
    /**Constructor de la clase
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Esta 
         * 
         */
        Cronometro c = new Cronometro();

        for (int i = 0; i < 1000; i++) {
            c.avanzar();
            System.out.println(c.obtenerTiempo());
            if (i % 100 == 0) {
                c.guardarMemoria();
            }
        }
        System.out.println("Memorias");
        c.mostrarMemorias();
        System.out.println("Retrocediendo");
        for (int i = 0; i < 1000; i++) {
            c.retroceder();
            System.out.println(c.obtenerTiempo());
        }
        Timer tiempo = new Timer();
        TimerTask task = new TimerTask() {
            int tic = 0;

            @Override
            public void run() {

                c.avanzar();
                System.out.println(c.obtenerTiempo());

            }

        };
        tiempo.schedule(task, 10, 100);
    }

}
