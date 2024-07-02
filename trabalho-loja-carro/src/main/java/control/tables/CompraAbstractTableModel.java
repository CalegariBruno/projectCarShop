/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.tables;

import domain.Compra;
import domain.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class CompraAbstractTableModel extends AbstractTableModel{
    
    private List<Compra> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }
        

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Revendedor", "Tipo", "Placa", "Renavam" , "Marca" ,"Modelo" ,"Ano",  "Cor", "Combustível", "Data Compra", "Valor"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Compra item = listaItens.get(rowIndex);

        switch (columnIndex) {
            case 0: return item.getRevendedor().getNome();
            case 1: return item.getVeiculo().getTipo();
            case 2: return item.getVeiculo().getPlaca();
            case 3: return item.getVeiculo().getRenavam();
            case 4: return item.getVeiculo().getMarca();
            case 5: return item.getVeiculo().getModelo();
            case 6: return item.getVeiculo().getAno();
            case 7: return item.getVeiculo().getCor();
            case 8: return item.getVeiculo().getCombustivel();
            case 9: return item.getData();
            case 10: return item.getValor();
            default: return null;
        }

    }
    
    public void adicionar (Compra item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        
    }
    
    public void remover (int indice) {
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Compra getVeiculo(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Compra> novaLista) {
        
        if ( novaLista.isEmpty()) {
            if ( !listaItens.isEmpty() ) {
                listaItens.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted( 0, listaItens.size() - 1);
        }
                
    }
    
    
}
