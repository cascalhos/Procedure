package br.com.procedure.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("procedures")
public class Procedures{
    @Id
    @Indexed(unique = true)
    private Integer a;
    private String nome;

    public Procedures(Integer a, String nome) {
        this.a = a;
        this.nome = nome;
    }

    public Procedures() {
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
