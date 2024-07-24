package control.tables;

import domain.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VeiculoAbstractTableModel extends AbstractTableModel {

    private List<Veiculo> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public void limpar() {
        listaItens.clear();
        fireTableDataChanged();
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Placa", "Marca", "Modelo", "Cor"};
        return nomesColunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo item = listaItens.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return item.getPlaca();
            case 1:
                return item.getMarca();
            case 2:
                return item.getModelo();
            case 3:
                return item.getCor();
            default:
                return null;
        }

    }

    public void adicionar(Veiculo item) {
        listaItens.add(item);
        fireTableRowsInserted(listaItens.size() - 1, listaItens.size() - 1);

    }

    public void remover(int indice) {
        listaItens.remove(indice);
        fireTableRowsDeleted(indice, indice);

    }

    public Veiculo getVeiculo(int linha) {
        return listaItens.get(linha);
    }

    public void setLista(List<Veiculo> novaLista) {

        if (novaLista.isEmpty()) {
            if (!listaItens.isEmpty()) {
                listaItens.clear();
                fireTableRowsDeleted(0, 0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted(0, listaItens.size() - 1);
        }

    }

}
