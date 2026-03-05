package br.maua;

import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        Random gerador=new Random();
        Personagem p1= new Personagem();
        p1.nome="celta";
        var p2= new Personagem();
        p2.nome="corsa";
        //1:caçar
        //2:comer
        //3:dormir
        while(true){
            int oQueFazer= gerador.nextInt(1,4);
            switch(oQueFazer){
                case 1:
                    p1.cacar();
                    break;
                case 2:
                    p1.comer();
                    break;
                case 3:
                    p1.dormir();
                    break;
            }
            int oQueFazer2=gerador.nextInt(1, 11);
            switch (oQueFazer2) {
                case 1, 2, 3, 4, 5, 6:
                    p2.cacar();
                    break;
                case 7, 8:
                    p2.comer();
                    break;
                case 9, 10:
                    p2.dormir();
                    break;
            
                
            }
            System.out.println("====================");
            Thread.sleep(8000);
            
        }
    }
}
