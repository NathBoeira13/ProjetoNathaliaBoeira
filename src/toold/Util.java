/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toold;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u05521391142
 */
public class Util {
   public static void habilitar(boolean valor, JComponent ... vetCampo) {
        for (int i = 0; i < vetCampo.length; i++) {
           vetCampo[i].setEnabled(valor);
            
        }
    }
    
    public static void limp(JComponent ... vetCamp) {
        for (int i = 0; i < vetCamp.length; i++) {
            if (vetCamp [i] instanceof JTextField){
            ((JTextField) vetCamp[i]).setText("");
            }
            if(vetCamp [i] instanceof JComboBox){
             ((JComboBox) vetCamp[i]).setSelectedIndex(-1);   
            }
        }
    }
    public static void msg( String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }
    public static int perguntar(String mensagem, String pergunta) {
      return  JOptionPane.showConfirmDialog(null,  mensagem, pergunta, JOptionPane.YES_NO_OPTION);
        
    }
    public static int strInt(String cad) {
        return 0;
    }
     public static String intStr(int num) {
        return "" ;
    }
     public static double strDouble(String cad) {
        return 0;
    }
      public static String doubleStr(String num) {
        return "";
    }
      public static Date strData(String cad) {
        return null;
    }
      public static String dataStr(String data) {
        return "";
    }

    //public static String dateStr(Date dataNascimentoNvb) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    public static boolean perg(String deseja_cancelar_o_registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void mostrar(String nenhuma_registro_selecionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
}
