package Challenge;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//O Grid possui linhas, colunas, direção -> x= colunas y= linhas z= norte, sul, leste, oeste;
//O Grid possui tamanhos escolhido pelo usuário -> xSize= tamanho de colunas, ySize= tamanho de linhas
//Os robôs são controlados pelos comandos:
//      'L'= Rotaciona 90º para Esquerda;
//      'R'= Rotaciona 90º para Direita;
//      'M'= Move 1 grid para frente, de acordo com o Y.
// Entradas:
//      1- Tamanho da matriz; (5 5)
//      2- Posição Inicial do robô 1; (1 2 N)
//      3- Intruções para o robô 1 andar; (LMLMLMLMM)
//      4- Posição Inicial do robô 2; (3 3 E)
//      5- Intruções para o robô 2 andar; (MMRMMRMRRM)
// Saída:
//      1- Posição final do robô 1; (1 3 N)
//      1- Posição final do robô 3; (5 1 E)

public class Program {
    public static void main(String[] args) {
        MarsUtils marsUtils = new MarsUtils();
        Scanner sc = new Scanner(System.in);
        int xSize = sc.nextInt();//Colunas
        int ySize = sc.nextInt();//Linhas

        int[][] marsGrid = new int[ySize][xSize];

        int xPosition = sc.nextInt();
        int yPosition = sc.nextInt();
        String z = sc.nextLine();



        Rovers robot1 = new Rovers(yPosition,xPosition,z.replaceAll(" ",""));

        char[] captureMovements = null;
        String movents = sc.nextLine();

        captureMovements = movents.toCharArray();

        for (int i=0; i < captureMovements.length; i++){
            if (captureMovements[i] == 'L'){
                marsUtils.rotateLeft(robot1);
            }else if (captureMovements[i] == 'R'){
                marsUtils.rotateRight(robot1);
            }else if (captureMovements[i] == 'M'){
                marsUtils.moveForward(robot1);
            }
        }

        System.out.println(robot1);

        xPosition = sc.nextInt();
        yPosition = sc.nextInt();
        z = sc.nextLine();
        Rovers robot2 = new Rovers(yPosition,xPosition,z.replaceAll(" ",""));

        movents = sc.nextLine();

        captureMovements = movents.toCharArray();

        for (int i=0; i < captureMovements.length; i++){
            if (captureMovements[i] == 'L'){
                marsUtils.rotateLeft(robot2);
            }else if (captureMovements[i] == 'R'){
                marsUtils.rotateRight(robot2);
            }else if (captureMovements[i] == 'M'){
                marsUtils.moveForward(robot2);
            }
        }

        System.out.println(robot2);

    }

}
