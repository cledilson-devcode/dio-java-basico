package edu.cledilson.anatomiaDasClasses;

public class Main {
    public static void main(String[] args){

        String primeiroNome = "Cledilson";
        String segundoNome = "Filho";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}