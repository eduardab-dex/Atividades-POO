import java.util.Scanner;
public class MainCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);
        
        BranchCarro carro1 = new BranchCarro();
        BranchCarro carro2 = new BranchCarro();

        System.out.println("===== CARRO 1 =====");
        carro1.cadastrar_carro();
        System.out.println("==========");
        carro1.exibir_carro();

        System.out.println("===== CARRO 2 =====");
        carro2.cadastrar_carro();
        System.out.println("==========");
        carro2.exibir_carro();


    }
}
