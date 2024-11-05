//Gustavo Pinheiro Silva 31/10/24

import java.util.Scanner;

public class DocesOuTravessuras {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //Variáveis (doces)
        int chocolates = 0;
        int gomas = 0;
        int balas = 0;
        int pirulitos = 0;
        
        System.out.println("Digite o tipo de doce (chocolate, goma, bala e pirulito). Digite 'fim' para encerrar.");
        while (true) {
            System.out.print("Insira o doce: ");
            
            String doce = scanner.nextLine().trim().toLowerCase();
            //Para as entradas permanecerem minúsculas 🤏
            
            
            if (doce.equals("fim")){
                break;
            }
                switch (doce) {
                    case "chocolate":
                          chocolates++;
                          break;
                    case "goma":
                         gomas++;
                         break;
                    case "bala":
                         balas++;
                         break;
                    case "pirulito":
                         pirulitos++;
                         break;
                    default:
                    
                    System.out.println("Tipo de doce desconhecido.");
            }
        }

        // Exibe a contagem de cada tipo de doce
        System.out.println("\nContagem dos doces:");
        System.out.println("Chocolate: " + chocolates);
        System.out.println("Goma: " + gomas);
        System.out.println("Balas: " + balas);
        System.out.println("Pirulitos: " + pirulitos);

        scanner.close();
    }
}
