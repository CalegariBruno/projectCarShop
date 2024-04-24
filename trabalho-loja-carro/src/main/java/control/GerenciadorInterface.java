/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import viewer.DlgCompra;
import viewer.DlgDespesas;
import viewer.DlgVenda;
import viewer.FrmPrincipalLoja;

/**
 *
 * @author 2022122760044
 */
public class GerenciadorInterface {

    private FrmPrincipalLoja frmPrinc = null;
    private DlgCompra dlgCompra = null;
    private DlgVenda dlgVenda = null;
    private DlgDespesas dlgDepesa = null;
    
    //  SINGLETON
    private static GerenciadorInterface myInstance = new GerenciadorInterface();

    
    // CONSTRUTOR PRIVADO
    private GerenciadorInterface() {
       
    }
    
    public static GerenciadorInterface getInstance(){
        return myInstance;
    }
    
    
    //  ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe){
        if(dlg == null){
            try{
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            }catch(NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
                JOptionPane.showMessageDialog(parent, "ERRO AO ABRIR A JANELA " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }
    
    
    public void abrirJanelaPrincipal(){
        if( frmPrinc == null){
            frmPrinc = new FrmPrincipalLoja();
        }
        frmPrinc.setVisible(true);
    }
    
    public void abrirJanCompra(){
        dlgCompra = (DlgCompra) abrirJanela(frmPrinc, dlgCompra, DlgCompra.class);
    }
    
    public void abrirJanVenda(){
        dlgVenda = (DlgVenda) abrirJanela(frmPrinc, dlgVenda, DlgVenda.class);
    }
    
    public void abrirJanDespesa(){
        dlgDepesa = (DlgDespesas) abrirJanela(frmPrinc, dlgDepesa, DlgDespesas.class);
    }
    
      
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        GerenciadorInterface.getInstance().abrirJanelaPrincipal();
        ConexaoHibernate.getSessionFactory().openSession();
    }
    
}
