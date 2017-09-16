/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeagregacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Charly
 */
public class GUI
{

    /**
     * Muestra una ventana de informaci�n al usuario.
     *
     * @param mensaje Mensaje que se desea mostrar.
     */
    public static void mostrarCartel(Object mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Muestra una ventana al usuario.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo T�tulo de la ventana.
     * @param tipoDeMensaje Tipo de mensaje.
     * <ul>
     * <li>0: Error.</li>
     * <li>1: Informaci�n.</li>
     * <li>2: Advertencia.</li>
     * <li>3: Pregunta.</li>
     * <li>-1: Sin �cono.</li>
     * </ul>
     */
    public static void mostrarCartel(Object mensaje, String titulo, int tipoDeMensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoDeMensaje);
    }
    
    /**
     * Muestra una ventana que permite una elecci�n al usuario a trav�s de botones.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo T�tulo de la ventana.
     * @param tipoDeOpcion Tipo de elecci�n.
     * <ul>
     *      <li>0: SI o NO</li>
     *      <li>1: SI, NO o CANCELAR</li>
     *      <li>2: ACEPTAR o CANCELAR</li>
     * </ul>
     * @return Opci�n elegida por el usuario.
     * <ul>
     *      <li>0: Si se eligi� "SI" o "ACEPTAR".</li>
     *      <li>1: Si se eligi� "NO".</li>
     *      <li>2: Si se eligi� "CANCELAR".</li>
     *      <li>-1: Si se cerr� la ventana.</li>
     * </ul>
     */
    public static int mostrarCuadroDeConfirmacion(String mensaje, String titulo, int tipoDeOpcion)
    {
        return JOptionPane.showConfirmDialog(null, mensaje, titulo, tipoDeOpcion);
    }
    
    /**
     * Muestra una ventana que permite una elecci�n al usuario a trav�s de una lista.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo T�tulo de la ventana.
     * @param valores Arreglo de cadenas, donde cada una de ellas representa un �tem de la lista.
     * @return �tem de la lista elegido por el usuario en formato String. Si se cierra la ventana o se presiona "CANCELAR", devuelve null.
     */
    public static String mostrarCuadroDeLista(String mensaje, String titulo, String[] valores)
    {
        return (String) JOptionPane.showInputDialog(null, mensaje, titulo, 3, null, valores, valores[0]);
    }
    
    /**
     * Muestra una ventana que permite una elecci�n al usuario a trav�s de botones personalizados.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo T�tulo de la ventana.
     * @param valores Arreglo de cadenas, donde cada una de ellas representa un bot�n a visualizar.
     * @return Posici�n del bot�n elegido en formato int (comenzando desde 0). Si se cierra la ventana, devuelve null.
     */
    public static int mostrarCuadroDeBotones(String mensaje, String titulo, String[] valores)
    {
        return JOptionPane.showOptionDialog(null, mensaje, titulo, 0, 3, null, valores, valores[0]);
    }
    
    /**
     * Muestra una ventana al usuario que permite introducir un n�mero entero.
     *
     * @param mensaje Mensaje que se desea mostrar.
     * @return Dato introducido por el usuario en formato int.
     * @exception NumberFormatException Si el dato no representa un n�mero entero.
     */
    public static int ingresarEntero(String mensaje)
    {
        try
        {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
        catch (NumberFormatException nfe)
        {
            mostrarCartel("El dato ingresado no representa un n�mero entero. Volv� a intentar...");
            return ingresarEntero(mensaje);
        }
    }
    
    /**
     * Muestra una ventana al usuario que permite introducir un n�mero real.
     *
     * @param mensaje Mensaje que se desea mostrar.
     * @return Dato introducido por el usuario en formato double.
     * @exception NumberFormatException Si el dato no representa un n�mero.
     */
    public static double ingresarReal(String mensaje)
    {
        try
        {
            return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        }
        catch (NumberFormatException nfe)
        {
            mostrarCartel("El dato ingresado no representa un n�mero. Volv� a intentar...");
            return ingresarReal(mensaje);
        }
    }
    
    /**
     * Muestra una ventana al usuario que permite introducir una cadena.
     *
     * @param mensaje Mensaje que se desea mostrar.
     * @return Dato introducido por el usuario en formato String.
     */
    public static String ingresarCadena(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje);
    }
}
