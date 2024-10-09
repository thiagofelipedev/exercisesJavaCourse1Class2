public class DescontoPreco {
    public static void main(String[] args) {
        double precoOriginal = 49.99;
        double percentualDesconto = 10.0;
        double calculoDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double calculoPreco = precoOriginal - calculoDesconto;
        System.out.println("Preço sem desconto: " + precoOriginal);
        System.out.printf("Desconto em R$: %.2f%n", calculoDesconto);
        System.out.printf("Preço com desconto: %.2f ", calculoPreco);
    }
}
