package org.example.progettospringdata.db.model;

public class Prodotto {
    private int id;
    private String nome;
    private Categoria categoria;
    private String descrizione;
    private int prezzo_unitario;
    private String unita_di_misura;

    public Prodotto() {
    }

    public Prodotto(int id, String nome, Categoria categoria, String descrizione, int prezzo_unitario, String unita_di_misura) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.descrizione = descrizione;
        this.prezzo_unitario = prezzo_unitario;
        this.unita_di_misura = unita_di_misura;
    }

    public Prodotto(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo_unitario() {
        return prezzo_unitario;
    }

    public void setPrezzo_unitario(int prezzo_unitario) {
        this.prezzo_unitario = prezzo_unitario;
    }

    public String getUnita_di_misura() {
        return unita_di_misura;
    }

    public void setUnita_di_misura(String unita_di_misura) {
        this.unita_di_misura = unita_di_misura;
    }
}
