package com.sifunirios.barbearia;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tableModelAgendamento extends AbstractTableModel {

    static ArrayList<Agendamento> agendamento = new ArrayList();
    String[] colunaAgendamento = {"Nome", "Data", "Hora"};
    
    public void realizarAgendamento(Agendamento agendou){
        agendamento.add(agendou);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return agendamento.size();
    }

    @Override
    public int getColumnCount() {
        return colunaAgendamento.length;
    }
    
    @Override
    public String getColumnName (int column){
        return colunaAgendamento[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex){
            case 0 -> agendamento.get(rowIndex).getNome();
            case 1 -> agendamento.get(rowIndex).getData();
            default -> agendamento.get(rowIndex).getHora();
        };
    }
}
