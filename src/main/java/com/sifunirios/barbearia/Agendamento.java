package com.sifunirios.barbearia;

public class Agendamento {
    private String nome;
    private String data;
    private String hora;
    
    public Agendamento(String nome, String data, String hora){
        this.nome = nome;
        this.data = data;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }
}
