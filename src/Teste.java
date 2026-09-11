import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean isRunning;

        while(isRunning){
          System.out.println("************************");
          System.out.println("Gestor de Eventos");
          System.out.println("************************");
          System.out.println("Novos eventos clique 1:");
          System.out.println("Editar eventos clique 2:");
          System.out.println("Novos Participantes clique 3:");
          System.out.println("Editar Participantes clique 4:");
          System.out.println("Sair clique 5:");
          System.out.println("************************");

         int opcao = scanner.nestInt();

        switch (opcao){

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                isRunning = false;
                break;                

        }



              //A TRABALHAR NUMA BRENCH


        }


      


  
