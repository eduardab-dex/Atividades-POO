import java.util.Scanner;
public class MainCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);

        /* 
        5 - Acrescente o seguinte um menu:
            1 - Acelerar carro
            2 - Frear carro
            3 - Exibir dados do carro, com os dados do dono
            4 - Vender carro
            5 - Atualizar o dono do carro
        O usuário deverá  escolher o carro e a opção desejada para ser executada.
        */
        
        int opcao;
        BranchCarro carro1 = new BranchCarro();
        BranchCarro carro2 = new BranchCarro();
        
        System.out.println("\n===== CARRO 1 =====");
        carro1.cadastrar_carro();
        System.out.println("\n");
        carro1.dono.registrar();

        System.out.println("\n===== CARRO 2 =====");
        carro2.cadastrar_carro();
        System.out.println("\n");
        carro2.dono.registrar();

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Acelerar carro");
            System.out.println("2 - Frear carro");
            System.out.println("3 - Exibir dados do carro e do dono");
            System.out.println("4 - Vender carro");
            System.out.println("5 - Atualizar o dono do carro");
            System.out.println("Qual carro você deseja verificar? (1 / 2):");
            int carro = scan.nextInt();
            System.out.println("Digite a sua escolha: ");
            opcao = scan.nextInt();

            if (carro == 1){
                switch (opcao){
                    case 1:
                        carro1.acelerar();
                        break;
                    case 2:
                        carro1.frear();
                        break;
                    case 3:
                        carro1.exibir_carro();
                        carro1.dono.consultar();
                        break;
                    case 4:
                        carro1.vender();
                        break;
                    case 5:
                        carro1.dono.atualizar();
                        break;
                    default:
                        System.out.println("Número inválido. Tente novamente");
                        break;
                }

                carro1.exibir_carro();

            }

            else if (carro == 2){
                switch (opcao){
                    case 1:
                        carro2.acelerar();
                        break;
                    case 2:
                        carro2.frear();
                        break;
                    case 3:
                        carro2.exibir_carro();
                        carro2.dono.consultar();
                        break;
                    case 4:
                        carro2.vender();
                        break;
                    case 5:
                        carro2.dono.atualizar();
                        break;
                    default:
                        System.out.println("Número inválido. Tente novamente");
                        break;
                }

                carro2.exibir_carro();

            }

        }
        while (opcao != 0);

    }
}
