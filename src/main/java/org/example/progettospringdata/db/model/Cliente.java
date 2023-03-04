package org.example.progettospringdata.db.model;

public class Cliente {
    private int id;
    private String nome;
    private String cognome;
    private String codice_fiscale;
    private String email;
    private String telefono;
    private String username;
    private String password;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cognome, String codice_fiscale, String email, String telefono, String username, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.codice_fiscale = codice_fiscale;
        this.email = email;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
    }

    public Cliente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodice_fiscale() {
        return codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
