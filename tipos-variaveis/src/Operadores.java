public class Operadores {
    
    public static void main(String[] args) {
        
        boolean variavel = false;

        variavel = !variavel;

        System.out.println(variavel);

        System.out.println("=================");
        //Testando incrementação 

        int numero = 5;

        System.out.println(-- numero);
        System.out.println(++ numero);

        System.out.println("==================");
        //Testando operador ternário

        int a, b;

        a = 6;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        System.out.println("==================");
        //Testando a usabilidade do .equals

        String nomeUm = "Marcos";
        String nomeDois = new String ("Marcos");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
}
