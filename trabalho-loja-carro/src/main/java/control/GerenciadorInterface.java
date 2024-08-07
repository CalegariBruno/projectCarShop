package control;

import domain.Pessoa;
import domain.Veiculo;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import viewer.DlgCadPessoa;
import viewer.DlgCadVeiculo;
import viewer.DlgCompra;
import viewer.DlgDespesas;
import viewer.DlgVenda;
import viewer.FrmPrincipalLoja;

public class GerenciadorInterface {

    private FrmPrincipalLoja frmPrinc = null;
    private DlgCompra dlgCompra = null;
    private DlgVenda dlgVenda = null;
    private DlgDespesas dlgDepesa = null;
    private DlgCadPessoa pesqPessoa = null;
    private DlgCadVeiculo pesqVeiculo = null;
    
    //  SINGLETON
    private static GerenciadorInterface myInstance = new GerenciadorInterface();
    private GerenciadorDominio gerDom;
    
    // CONSTRUTOR PRIVADO
    private GerenciadorInterface() {
        gerDom = new GerenciadorDominio();
    }
    
    public static GerenciadorInterface getInstance(){
        return myInstance;
    }
    
    public GerenciadorDominio getGerenciadorDominio() {
        return gerDom;       
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
    
    public Pessoa abrirJanCadPessoa(){
        pesqPessoa = (DlgCadPessoa) abrirJanela(frmPrinc, pesqPessoa, DlgCadPessoa.class);
        return pesqPessoa.getPessoaSelecionada();
    }
    
    public Veiculo abrirJanCadVeiculo(){
        pesqVeiculo = (DlgCadVeiculo) abrirJanela(frmPrinc, pesqVeiculo, DlgCadVeiculo.class);
        return pesqVeiculo.getVeiculoSelecionado();
    }
      
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        UIManager.put("OptionPane.yesButtonText", "Sim"); 
        UIManager.put("OptionPane.noButtonText", "Não");
        
        GerenciadorInterface.getInstance().abrirJanelaPrincipal();        
    }
    
}
