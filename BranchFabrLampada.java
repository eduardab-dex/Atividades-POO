import java.util.Scanner;
public class BranchFabrLampada {
    Scanner scanstr = new Scanner(System.in);

    String local, produto, nome;

    void cadastrarFab(){
        System.out.println("Digite o nome do fabricante: ");
        nome = scanstr.nextLine();
        System.out.println("Digite o local de fabricação: ");
        local = scanstr.nextLine();
        System.out.println("Digite o produto fabricado: ");
        produto = scanstr.nextLine();

    }
}
