public class Main {
    public static void main(String[] args) {
        // var
        //pdtcpd quantidade de produtos comprados
        String nome = "Ryan";
        int idade = 28;
        double salario = 1340.92;
        int mes = 2;
        int prodcompr = 15;
        double gastos = 200;


        //Operações
        double salbruto = salario * mes;
        double salliquido = salbruto - 300.00;

        // valor gasto em produtos
        double medproduto = gastos / prodcompr;

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " como voçe tem que pagar impostos seu sálario anual liquido é " + salliquido + " caso não ache o Ryan o mais lindo da classe precisara pagar 200zentão de impostos");

        System.out.println("A média dos valores dos produtos que você não aguentou e acabou comprando foi de " +medproduto );
    }
}