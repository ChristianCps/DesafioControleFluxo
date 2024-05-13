import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.close();
        
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O parâmetroUm deve ser menor ou igual ao parâmetroDois");
            }
        
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: "+i);
            }
    }
}
