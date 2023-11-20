import javax.swing.JOptionPane;
/*
@author Pedro Piñeiro ordax
@version 1.0
 */
public class lerDatos {

    public static int lerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;

        //tamén

        // return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    public static float lerFloatPositivo(String mensaxe){
        float dato;
        do{
            dato=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }while(dato<=0);
        return dato;

    }
}