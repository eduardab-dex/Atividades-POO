import java.util.Scanner;
public class BranchCarro {
    Scanner scan = new Scanner(System.in);
    Scanner scanstr = new Scanner(System.in);

    /*
    1 - Crie a classe Carro, com os seguinte atributos: placa, modelo, preco, cor, velocidade. Os métodos são: 
        lerDados, exibirDados, acelerar (acrescenta uma unidade no atributo velocidade), 
        frear (decrementa uma unidade no atributo velocidade), 
        vender (solicita a forma de pagamento e exibe o valor a pagar. 
        Se a forma de pagamento for pix ou dinheiro tem um desconto de 20% - se o pagamento for em cartão, há um acréscimo de 10%).
    2 - Crie a classe Dono, com os seguintes atributos: nome, CPF. Adicione os seguintes métodos: registrar, consultar, atualizar.
    3 - Adicione Dono como atributo da classe Carro.
    4 - Crie uma classe principal (main) que faça a criação de 2 objetos de carro, com seus respectivos donos. Faça a leitura das informações dos atributos pelo teclado.
    5 - Acrescente o seguinte um menu:
        1 - Acelerar carro
        2 - Frear carro
        3 - Exibir dados do carro, com os dados do dono
        4 - Vender carro
        5 - Atualizar o dono do carro
        O usuário deverá  escolher o carro e a opção desejada para ser executada.
    */

    // ATRIBUTOS
    String placa, modelo, cor;
    float preco;
    int velocidade;
    BranchCarroDono dono = new BranchCarroDono();

    // MÉTODO CADASTRAR CARRO
    void cadastrar_carro(){
        System.out.println("Digite a placa do seu carro: ");
        placa = scanstr.nextLine();
        
        System.out.println("Digite o modelo do seu carro: ");
        modelo = scanstr.nextLine();
        
        System.out.println("Digite a cor do seu carro: ");
        cor = scanstr.nextLine();
        
        System.out.println("Digite o preço do seu carro (R$): ");
        preco = scan.nextFloat();
        
        System.out.println("Digite a velocidade do seu carro (Km/h): ");
        velocidade = scan.nextInt();
    
    }

    // MÉTODO EXIBIR CARRO
    void exibir_carro(){
        System.out.println("PLACA: "+ placa);
        System.out.println("MODELO: "+ modelo);
        System.out.println("COR: "+ cor);
        System.out.println("PRECO: "+ preco);
        System.out.println("VELOCIDADE: "+ velocidade);
    }

    // MÉTODO ACELERAR (velocidade += 1)
    void acelerar(){
        velocidade += 1;
    }

    // MÉTODO FREAR (velocidade -= 1)
    void frear(){
        velocidade -= 1;
    }

    /* MÉTODO VENDER
        (solicita a forma de pagamento e exibe o valor a pagar. Se a forma de pagamento for pix ou dinheiro tem um desconto de 20% 
        - se o pagamento for em cartão, há um acréscimo de 10%).
    */ 
    void vender(){
        System.out.println("\n===== FORMAS DE PAGAMENTO =====");
        System.out.println("1 - PIX (-20%)");
        System.out.println("2 - Dinheiro (-20%)");
        System.out.println("3 - Cartão (+10%)");
        System.out.println("Digite a sua forma de pagamento desejada:)");
        int forma_pagamento = scan.nextInt();

        switch (forma_pagamento){
            case 1: //PIX
                preco = preco - (20/100 * preco);
                break;
            case 2: // DINHEIRO
                preco = preco - (20/100 * preco);
                break;
            case 3: // CARTÃO
            preco = preco + (10/100 * preco);
                break;
            default:
                break;
        }

    }

}
