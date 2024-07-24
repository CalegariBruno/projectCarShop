package control.tables;

import domain.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendaAbstractTableModel extends AbstractTableModel {

    private List<Venda> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    public void limpar() {
        listaItens.clear();
        fireTableDataChanged();
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Nome Comprador", "Placa", "Marca", "Modelo", "Data", "Valor Venda", "Valor Compra", "Despesas", "Lucro"};
        return nomesColunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda item = listaItens.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return item.getCliente().getNome();
            case 1:
                return item.getVeiculo().getPlaca();
            case 2:
                return item.getVeiculo().getMarca();
            case 3:
                return item.getVeiculo().getModelo();
            case 4:
                return item.getData();
            case 5:
                return item.getValor();
            case 6:
                return item.getValorCompra();
            case 7:
                return item.getVeiculo().getValorTotalDespesas();
            case 8:
                return item.getLucro();
            default:
                return null;
        }

    }

    public void adicionar(Venda item) {
        listaItens.add(item);
        fireTableRowsInserted(listaItens.size() - 1, listaItens.size() - 1);

    }

    public void remover(int indice) {
        listaItens.remove(indice);
        fireTableRowsDeleted(indice, indice);

    }

    public Venda getVeiculo(int linha) {
        return listaItens.get(linha);
    }

    public void setLista(List<Venda> novaLista) {

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
