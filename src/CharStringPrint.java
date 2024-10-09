public class CharStringPrint {
    public static void main(String[] args) {
        char letra = 'o';
        String texto = " i";
        System.out.println(letra + texto);
        //String.format, String.buffer , String.
        StringBuilder teste = new StringBuilder();
        teste.append(letra).append(texto);
        System.out.println(teste);
    }
}
