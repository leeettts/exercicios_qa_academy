package ExemploComRetorno.ExercicioMetodos;

public class ExercicioMetodosComParametros02 {
    public static void main(String[] args) {
        String Dados = exibePalavraParametroComRetorno("Nome" , " Sobrenome");
        System.out.println(Dados);

        String DataNascimento = exibeNumeParametroComRetorno("07" , " Novembro", " 1996"); 
        System.out.println(DataNascimento);


        }

    public static String exibeNumeParametroComRetorno(String Dia, String Mes, String Ano) {
        String DataNascimento = Dia + Mes + Ano;
        return DataNascimento;
    }

    public static String exibePalavraParametroComRetorno(String Nome, String Sobrenome) {
        String Dados = Nome + Sobrenome;
        return Dados;
    }
}

//Sem Retorno
// public static String exibePalavraParametro (String palavra){
//     System.out.println(palavra);
// }

// public static void exibeNumeParametro (int numero){
//     System.out.println(numero);
// }

// public static void exibeBooleanParametro (Boolean estado){
//     System.out.println(estado);
// }

// public static void exibeDoubleParametro (double numero){
//     System.out.println(numero);
// }

// public static void exibeFloatParametro (Float numero){
//     System.out.println(numero);
// }