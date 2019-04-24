package br.com.dasa.job.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;


public class Impressora{


    private String id;
    private String macaddress;
    @JsonProperty("ultima_atualizacao")
    private LocalDateTime ultimaAtualizacao;
    private String unidade;
    private String empresa;
    private String nome;

    public Impressora() { }


    public Impressora(String macaddress, String id, LocalDateTime ultimaAtualizacao,String unidade,String nome,String empresa) {
        this.macaddress = macaddress;
        this.id = id;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.unidade = unidade;
        this.nome = nome;
        this.empresa = empresa;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}