public class Entrega {

        public static void main(String args []) {
            Cliente neide = new Cliente(12, 24/12, "Walter", "rua carapicuiba", 18);
            Funcionario manha = new Funcionario("Júlio", "Pablo", 13);
            System.out.println("Detalhes da entrega a seguir:");
            System.out.println(neide);
            System.out.println("Detalhes dos funcionarios:");
            System.out.println(manha);


            Cliente jorge = new Cliente(19,16/12,"Roger", "rua guarulhos", 388);
            Funcionario noite = new Funcionario("Maurilio", "Bob", 19);
            System.out.println("Detalhes da entrega a seguir:");
            System.out.println(jorge);
            System.out.println("Detalhes dos funcionarios:");
            System.out.println(noite);
        }


}
