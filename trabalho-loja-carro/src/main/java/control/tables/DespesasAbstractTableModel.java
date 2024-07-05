package control.tables;

import domain.Despesa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class DespesasAbstractTableModel extends AbstractTableModel{
    
    private List<Despesa> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
        
    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Modelo", "Descrição", "Valor"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Despesa item = listaItens.get(rowIndex);

        switch (columnIndex) {            
            case 0: return item.getVeiculo().getModelo();            
            case 1: return item.getDescricao();
            case 2: return item.getValor();
            default: return null;
        }

    }
    
    public void adicionar (Despesa item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
    }
    
    public void remover (int indice) {
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
    }

    public Despesa getDespesa(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Despesa> novaLista) {
        
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
