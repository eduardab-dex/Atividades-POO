import java.util.Scanner;
public class BranchCarroDono {
    Scanner scanstr = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    // ATRIBUTOS
    String nome;
    String cpf;

    //MÉTODO REGISTRAR
    void registrar(){
        System.out.println("Digite o nome do dono: ");
        nome = scanstr.nextLine();
        System.out.println("Digite o cpf do dono: ");
        cpf = scan.nextLine();
    }

    // MÉTODO CONSULTAR
    void consultar(){
        System.out.println("NOME DO DONO: "+ nome);
        System.out.println("CPF DO DONO: "+ cpf);
    }
    
    // MÉTODO ATUALIZAR
    void atualizar(){
        registrar();
    }
}
