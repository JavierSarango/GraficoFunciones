
package graficarfunciones;
import com.singularsys.jep.JepException;
/**
 *
 * @author OMAR LEZAMAP
 * Recuperado de: https://youtu.be/NIpjixNP1Qc por Javier Sarango
 */
public class metodo {
    public double raiz(funcion f, double x0, double x1, Integer c, double e) throws JepException{
    /*
        instancia de una funcion en la clase funcion.
        x0 y x1 = parametros
        c = ciclos máximos hasta encontrar la raíz
        e = error permitido hasta encontrar la raiz.
        */
        double r= Double.NaN; //se inicializa la variable r
    double x2 = x0; //Interseccion con el eje x
    Integer k = 0; //constante
        while (Math.abs(f.evaluar(x2))> e && k < c) {   
            x2 = x0 - f.evaluar(x0)* (x1-x0)/(f.evaluar(x1)-f.evaluar(x0));
            x0 = x1;
            x1= x2;
            k++;
            
        }
        if (k < c) {
            r = x2;
        }
        return r;
    }
}
