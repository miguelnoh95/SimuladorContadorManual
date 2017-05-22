/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contadormanual;

/**
 *
 * @author edeco
 */
public class ContadorManual {
    private int valor;
    
    public ContadorManual() {
        valor = 0;
    }
    
    public void contar() {
        valor = valor + 1;
    }
    
    public int getConteoActual() {
        return valor;
    }
    
    public void reiniciarConteo() {
        valor = 0;
    }
    
    public int getConteoAcutal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

