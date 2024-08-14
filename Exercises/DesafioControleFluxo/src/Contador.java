public class Contador {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, forneça dois parâmetros inteiros.");
            return;
        }

        try {
            int primeiroNumero = Integer.parseInt(args[0]);
            int segundoNumero = Integer.parseInt(args[1]);

            if (primeiroNumero >= segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int quantidadeInteracoes = segundoNumero - primeiroNumero;

            for (int i = 1; i <= quantidadeInteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}