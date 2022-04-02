package ExemploComRetorno;

public class ExemploExercicio01 {
    
    public static void main(String[] args) {//main
        String MetodoUm = verificarAprovacaoUm();
        System.out.println(MetodoUm);
        String MetodoDois = verificarAprovacaoDois();
        System.out.println(MetodoDois);
        String MetodoTres = verificarAprovacaoTres();
        System.out.println(MetodoTres);
        String MetodoQuatro = verificarAprovacaoQuatro();
        System.out.println(MetodoQuatro);
        String MetodoCinco = verificarAprovacaoCinco();
        System.out.println(MetodoCinco);
        }//main

    public static String verificarAprovacaoCinco() { // public(modificado), string(tipo do metodo), verificacaocinco (nome do metodo)
        int nota = 10;
        if (nota >4){
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        } 
    }
    public static String verificarAprovacaoQuatro() {
        int nota = 5;
        if (nota >8){
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }
    public static String verificarAprovacaoTres() {
        int nota = 8;
        if (nota >7){
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }
    public static String verificarAprovacaoDois() {
        int nota = 10;
        if (nota >2){
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }
    public static String status; static String verificarAprovacaoUm(){
        int nota = 4;
        if (nota >9){
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }
    }

