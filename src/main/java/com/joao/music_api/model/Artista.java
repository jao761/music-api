package com.joao.music_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ARTISTA")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nomeArtistico;
    private String nome;
    private Integer anoNascimento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public Artista() {}

    public Artista(String nomeArtistico, String nome, Integer anoNascimento, Sexo sexo) {

        this.nomeArtistico = nomeArtistico;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;

    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Artista: " +
                "id=" + id +
                ", nomeArtistico='" + nomeArtistico + '\'' +
                ", nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", sexo=" + sexo;
    }
}
