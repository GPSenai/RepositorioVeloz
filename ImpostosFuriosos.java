
//Gustavo Pinheiro Silva 05/11/24

import java.util.Scanner;

public class ImpostosFuriosos {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Digite o valor de fábrica do veículo: ");
        int valor = scanner.nextInt();
        double imposto = (valor * 0.73);
        double custo = (valor + imposto);
        
        System.out.println(" O custo total é de " + custo);

	}

}
