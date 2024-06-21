/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresaacme.service;

import com.mycompany.empresaacme.model.Funcionario;
import com.mycompany.empresaacme.model.FuncionarioTerceirizado;

/**
 *
 * @author mnjoa
 */
public class RHService {
    public void reajustarSalario(Funcionario funcionario, double percentual) {
        if (funcionario instanceof FuncionarioTerceirizado) {
            System.out.println("Reajuste não aplicável para funcionários terceirizados.");
            return;
        }
        double novoSalario = funcionario.getSalario() * (1 + percentual / 100);
        funcionario.setSalario(novoSalario);
        System.out.println("Novo salário de " + funcionario.getNome() + ": " + novoSalario);
    }
}
