public class Conversao {
    public static void main (String args []) {
        int num1 =  214;
        Short num2 = (short) num1;
        System.out.println("num1 = " + num1);
        System.out.println("conversão int para short " + num2 + " quando respeita a quantidade de algarismo, a conversão ocorre bem.");
        
        int num7 = 1254621;
        Short num8 = (short) num7;
        System.out.println("testando o  " + num8);
        System.out.println("o numero que esta contido na variavel deve respeitar o limite, independente de ser primito ou Wrapper");
        
        int num3 = 58589999; // 
        Integer num4 =  num3;
        System.out.println("conversão int para Integer " + num4 + " o numero se mantem ,a conversão acontece de maneira correta também");

        Long num5l = 159161164861461l;
        long num6l = num5l;
        System.out.println("testando long " + num5l);
        System.out.println("testando conersão long para short " + num6l);
        System.out.println("a conversão ocorreu de maneira adequada, de primitivo para wrapper, desde que respeite o limite de characters.");
        
      /*  Long num10l = 1355194161961998l; 
        System.out.println("testando " + num10l);
        short num11 = (short) num10l;
        System.out.println("testando " + num11);
        a conversão a cima n funciona
        */
        
        long num10l = 1355194161961998l; 
        System.out.println("antes de converter para short  " + num10l);
        short num11 = (short) num10l;
        System.out.println("apos a conversão " + num11);
        System.out.println("de primitivo para primitivo a conversão ocorre, o casting faz com que aconteça,"
        		+ " mas quando se trata de wrapper para primitivo, o casting não funciona e o código trava. Necessário respeitar os limites de cada tipo.");
    }
}
