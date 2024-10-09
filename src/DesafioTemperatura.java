public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        int temperaturaFahrenheitInteiro = (int) (temperaturaFahrenheit);
        System.out.println(String.format("A temperatura de %.1f Celsius é equivalente a %.1f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit));
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteiro);
    }
}
//celsius and fahrenheit variables, with a formula on fahrenheit variable that gives the fahrenheit temperature value based on the value on celsius variable. Afterwards, the printed message.