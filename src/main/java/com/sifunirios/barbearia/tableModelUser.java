package com.sifunirios.barbearia;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tableModelUser extends AbstractTableModel {
    
    static ArrayList<User> user = new ArrayList();
    String[] colunaUser = {"Nome", "Senha", "Telefone", "Email"};
    
    public void cadastrarUsuario(User u){
        user.add(u);
        this.fireTableDataChanged();
    }
    
    public boolean validarUsuario(String login, String senha){
        int indexLogin = 0, indexSenha = 1;
        
        for(int x=0; x<=user.size() ; x++){
            String loginCad = (String) getValueAt(x,indexLogin);
            String senhaCad = (String) getValueAt(x,indexSenha);
            return loginCad.equals(login) && senhaCad.equals(senha);
        }
        return false;
    } 
    
    @Override
    public int getRowCount() {
        return user.size();
    }

    @Override
    public int getColumnCount() {
        return colunaUser.length;
    }

    @Override
    public String getColumnName (int column){
        return colunaUser[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> user.get(rowIndex).getNome();
            case 1 -> user.get(rowIndex).getSenha();
            case 2 -> user.get(rowIndex).getTel();
            default -> user.get(rowIndex).getEmail();
        };
    }
}