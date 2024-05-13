public class Conversao {
    public static void main (String args []) {
        int num1 =  214;
        short num2 = (short) num1;
        System.out.println("num1 " + num1);
        System.out.println("conversão int para short " + num2 + " quando respeita a quantidade de algarismo, a conversão ocorre bem."); //respeitando a capacidade maxima de conversão

        int num3 = 58589999; // o numero quebra, conversão acontece de maneira inadequada
        short num4 = (short) num3;
        System.out.println("conversão int para short " + num4 + "o numero quebra, conversão acontece de maneira inadequada");

        long num5 = 159161164861461l;
        short num6 = (short) num5;
        System.out.println("testando long " + num5);
        System.out.println("testando conersão long para short " + num6);

    }
}
