import java.util.Scanner;
public class MainLampada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BranchLampada lamp1 = new BranchLampada();
        BranchLampada lamp2 = new BranchLampada();
        BranchLampada lamp3 = new BranchLampada();
        
        System.out.println("\n===== LÂMPADA 1 =====");
        lamp1.cadastrar();
        System.out.println("==========");
        lamp1.mostrar();

        System.out.println("\n===== LÂMPADA 2 =====");
        lamp2.cadastrar();
        System.out.println("==========");
        lamp2.mostrar();

        System.out.println("\n===== LÂMPADA 3 =====");
        lamp3.cadastrar();
        System.out.println("==========");
        lamp3.mostrar();

        System.out.println("\nDeseja modificar alguma lâmpada? (1 / 2 / 3)");
        int opcao = scan.nextInt();
        switch (opcao){
            case 1:
                lamp1.cadastrar();
                break;
            case 2:
                lamp2.cadastrar();
                break;
            case 3:
                lamp3.cadastrar();
                break;
            default:
                System.out.println("Nenhuma lâmpada a ser modificada");
                break;
        }

    }
}
