public class ConvertDollar {
    public static void main(String [] args) {
        double valorEmDolares = 5;
        double cambioDolar = 4.94;
        double conversaoDolarReais = valorEmDolares * cambioDolar;
        System.out.printf("O valor da conversão de Dolar para Reais é: %.2f", conversaoDolarReais);
    }
}
