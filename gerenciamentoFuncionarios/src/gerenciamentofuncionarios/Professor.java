/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentofuncionarios;

/**
 *
 * @author Escola
 */
public class Professor extends Funcionario {

    private String diciplina;

    public Professor(String diciplina, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
    
    public String exibirDetalhes() {
        return "Professor{" + super.exibirDetalhes()+  "disciplina=" + diciplina + '}';
    }

    @Override
    public double calcularBonusSalario() {
        return super.getSalario()*(0.1);
    }

}
