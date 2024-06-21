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
public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPrevistoDePermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo,
                                   String empresaContratada, int tempoPrevistoDePermanencia) {
        super(nome, telefones, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia;
    }

    // Getters and Setters
    public String getEmpresaContratada() { return empresaContratada; }
    public void setEmpresaContratada(String empresaContratada) { this.empresaContratada = empresaContratada; }

    public int getTempoPrevistoDePermanencia() { return tempoPrevistoDePermanencia; }
    public void setTempoPrevistoDePermanencia(int tempoPrevistoDePermanencia) { this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia; }
}