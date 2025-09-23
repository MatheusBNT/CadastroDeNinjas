package dev.matheus.cadastrodeninjas.missoes.model;

import dev.matheus.cadastrodeninjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    private int tempoDaMissao;

    // Uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List <NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldade, int tempoDaMissao) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.tempoDaMissao = tempoDaMissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public float getTempoDaMissao() {
        return tempoDaMissao;
    }

    public void setTempoDaMissao(int tempoDaMissao) {
        this.tempoDaMissao = tempoDaMissao;
    }
}
