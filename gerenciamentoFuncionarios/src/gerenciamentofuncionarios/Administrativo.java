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
public class Administrativo extends Funcionario{
    private String setor;

    public Administrativo(String setor, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "setor=" + setor + '}';
    }

    @Override
    public double calcularBonusSalario() {
        return this.getSalario()/100*(0.05);
    }
}
