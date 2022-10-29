
package graficarfunciones;
import com.singularsys.jep.JepException;
import org.nfunk.jep.JEP;
/**
 * @author OMAR LEZAMAP
 * Recuperado de: https://youtu.be/NIpjixNP1Qc por Javier Sarango
 */
public class funcion {

    JEP j = new JEP();

    public funcion(String def) throws JepException {
        j.addVariable("x", 0); //valida la variable x
        j.addStandardConstants(); //
        j.addStandardFunctions();
        j.parseExpression(def); //parseamos la cadena y se evalua como funcion
        if (j.hasError()) { // verifica errores
            System.out.println(j.getErrorInfo());
        }
    }
    public double evaluar(double x) throws JepException { //evalua el valor de X
        double r;
        j.addVariable("x", x); //se evalua la variable x en el metodo
        r = j.getValue(); //se almacena el resultado de la operacion anterior en r
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
        }

        return r;
    }
}
