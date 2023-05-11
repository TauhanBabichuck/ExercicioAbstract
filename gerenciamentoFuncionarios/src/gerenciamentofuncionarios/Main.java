
package gerenciamentofuncionarios;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Funcionario Pedro = new Professor("Matemática", "Pedro", 31, 2800.0);
        Funcionario Marta = new Administrativo("Secretário", "Marta", 46, 2600.0);
        
        System.out.println(Marta.exibirDetalhes());
        System.out.println(Pedro.exibirDetalhes());
        
    }
}
