package poo;

/**
 *
 *
 * @author andre
 */
public class Robo {
    /**
     * Norte = 0 ; Leste = 1; Sul = 2 ; Oeste = 3;
     */

    private int posicaoX = 0;
    private int posicaoY = 0;
    private int frente = 0;

    //----------------------------------------------------
    //Métodos
    public void movimentar(String plano) {
        for (int i = 0; i < plano.length(); i++) {
            char p = plano.charAt(i);
//            switch (p){
//                case "D": frente = (frente + 1 < 4) ? frente + 1 : 0;
//
//                case "E": frente = (frente - 1 >= 0) ? frente - 1 : 3;
//
//                case "M":
//                    switch (frente){
//
//                        case 0 : posicaoY++;
//                                 break;
//
//                        case 1: posicaoX++;
//                                break;
//
//                        case 2: posicaoY--;
//                                break;
//
//                        case 3: posicaoX--;
//                    }
//                default:
//                    System.out.println(p[i] + " é um comando nao identificado");
  //      }
    }//teste

    }
}
