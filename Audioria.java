import java.util.Scanner;

public class Audioria {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        double taxaCdb;
        double tetoRegulatorio = 13.0;
        boolean risco = false;
        
        System.out.println("Digite o nome: ");
        nome = leia.nextLine();

        System.out.println("Digite a taxa do CDB: ");
        taxaCdb = leia.nextDouble();

        if (taxaCdb > tetoRegulatorio) {
            System.out.println("Alerta Critico! ");
            risco = true;

        } else {
        System.out.println("Regular");
        
        }
        if (risco == true) {
            System.out.println("Parecer do Auditor: Ativo bloqueado para novas emissoes. ");
        } else {
            System.out.println("Parecer do Auditor: Ativo liberado para novas emissoes ");
        }     
    }
}
