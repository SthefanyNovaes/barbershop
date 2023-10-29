package com.sifunirios.barbearia;

public class User {
    private String nome;
    private String login;
    private String senha;
    private String tel;
    private String email;
    
    public User(String nome, String login, String senha, String tel, String email){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tel = tel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
