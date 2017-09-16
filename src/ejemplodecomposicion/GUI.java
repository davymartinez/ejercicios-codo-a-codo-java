package ejemplodecomposicion;

import javax.swing.JOptionPane;

public class GUI {
	
	public static void mostrarCartel(Object mensaje) {
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
	
	public static void mostrarCartel(Object mensaje, String titulo, int tipoDeMensaje) {
		
		JOptionPane.showMessageDialog(null, mensaje, titulo, tipoDeMensaje);
		
	}
	
	public static int mostrarCuadroDeConfirmacion(String mensaje, String titulo, int tipoDeOpcion) {
		
		return JOptionPane.showConfirmDialog(null, mensaje, titulo, tipoDeOpcion);
		
	}
	
	public static String mostrarCuadroDeLista(String mensaje, String titulo, String[] valores)
	{
		return (String) JOptionPane.showInputDialog(null, mensaje, titulo, 3, null, valores, valores[0]);
	}
	
	public static int mostrarCuadroDeBotones(String mensaje, String titulo, String[] valores)
    {
        return JOptionPane.showOptionDialog(null, mensaje, titulo, 0, 3, null, valores, valores[0]);
    }
	
	public static int ingresarEntero(String mensaje)
    {
        try
        {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
        catch (NumberFormatException nfe)
        {
            mostrarCartel("El dato ingresado no representa un número entero. Volvé a intentar...");
            return ingresarEntero(mensaje);
        }
    }
	
	public static double ingresarReal(String mensaje)
    {
        try
        {
            return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        }
        catch (NumberFormatException nfe)
        {
            mostrarCartel("El dato ingresado no representa un número. Volvé a intentar...");
            return ingresarReal(mensaje);
        }
    }
	
	public static String ingresarCadena(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje);
    }

}
