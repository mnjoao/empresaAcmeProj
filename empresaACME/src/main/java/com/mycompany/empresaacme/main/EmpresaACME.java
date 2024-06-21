/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresaacme.main;

import java.util.List;

import com.mycompany.empresaacme.model.*;
import com.mycompany.empresaacme.service.RHService;

/**
 *
 * @author mnjoa
 */
public class EmpresaACME {

      public static void main(String[] args) {
        // Exemplo de criação e reajuste de salário
        Funcionario dev = new Funcionario("João", List.of("123456789"), "Rua A", 5000.0, Setor.DESENVOLVIMENTO, Cargo.PLENO);
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Maria", List.of("987654321"), "Rua B", 4000.0, Setor.DEVOPS, Cargo.JUNIOR, "Empresa X", 12);

        RHService rh = new RHService();
        rh.reajustarSalario(dev, 10);  // Novo salário de João: 5500.0
        rh.reajustarSalario(terceirizado, 10);  // Reajuste não aplicável para funcionários terceirizados.
    }
}
