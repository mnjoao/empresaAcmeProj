/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresaacme.model;

import java.util.List;

/**
 *
 * @author mnjoa
 */
public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    // Getters and Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<String> getTelefones() { return telefones; }
    public void setTelefones(List<String> telefones) { this.telefones = telefones; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public Setor getSetor() { return setor; }
    public void setSetor(Setor setor) { this.setor = setor; }

    public Cargo getCargo() { return cargo; }
    public void setCargo(Cargo cargo) { this.cargo = cargo; }
}