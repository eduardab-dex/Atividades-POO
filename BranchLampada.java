import java.util.Scanner;
public class BranchLampada {

    Scanner scan = new Scanner(System.in);
    Scanner scanstr = new Scanner(System.in);

    /*
    1. Para cada um dos objetos abaixo apresente pelo menos 3 atributos e 2 métodos.
        a) Lâmpada
        b) Data
        c) Reunião
        d) Fabricante
        e) Aluno

    2. Implemente a classe Lampada utilizando as regras de JAVA.

    3. Crie uma classe Principal/Main que faça a criação de três objetos do tipo Lampada, informando, pelo teclado, os dados de cada lampada.

    4. Permita que o usuário escolha qual das lâmpadas, ele/ela deseja atualizar e faça a mudança solicitada.

    5. Crie uma classe chamada Fabricante. Quais atributos seriam importantes? Quais atributos? É possível relacionar com a classe Lampada criada?
    */

    // ATRIBUTOS
    float tamanho;
    String cor;
    boolean estado = false; // ligada ou desligada
    BranchFabrLampada fabricante;

    // MÉTODO cadastrar
    void cadastrar(){
        System.out.println("Digite o tamanho da sua lâmpada (cm): ");
        tamanho = scan.nextFloat();

        System.out.println("Digite a cor da sua lâmpada: ");
        cor = scanstr.nextLine();

        System.out.println("Digite o estado que você deseja deixar a lâmpada (false: desligada / true: ligada): ");
        estado = scan.nextBoolean();

        fabricante = new BranchFabrLampada();
        fabricante.cadastrarFab();
    }

    // MÉTODO LIGAR
    void ligar(){
        if (estado == true) {
            System.out.println("A Lâmpada já está ligada");
        }
        else if (estado = false) {
            System.out.println("A lâmpada foi apagada");
        }
    }

    // MÉTODO DESLIGAR
    void desligar(){
        if (estado == false) {
            System.out.println("A Lâmpada já está apagada");
        }
        else if (estado = true) {
            System.out.println("A lâmpada foi ligada");
        }
    }

    void mostrar(){
        System.out.println("TAMANHO: "+ tamanho +"cm\nCOR: "+ cor +"\nESTADO: "+ estado +"FABRICANTE: "+ fabricante);
    }

}

