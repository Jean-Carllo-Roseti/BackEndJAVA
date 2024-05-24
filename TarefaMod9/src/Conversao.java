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
        
        

    }
}
