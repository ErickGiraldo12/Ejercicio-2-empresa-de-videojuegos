//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, experiencia;

        Personaje P1 = new Personaje("Florez", 1, 0, 100, true);

        do{
            System.out.println("==========================");
            P1.mostrarEstado();
            System.out.println("==========================");
            System.out.println("     Menu ");
            System.out.println("1. Gana experiencia");
            System.out.println("2. Sube de nivel");
            System.out.println("3. Aplica dano");
            System.out.println("4. Curate");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuanta experiencia quieres gaanar?");
                    P1.ganarExperiencia(10);
                    P1.mostrarEstado();
                    break;
                case 2:
                    System.out.println("Tu nuevo nivel es " + P1.subirNivel());
                    P1.mostrarEstado();
                    break;
                case 3:
                    System.out.println("Dano aplicado"+ P1.recibirDano(15));
                    P1.mostrarEstado();
                    break;
                case 4:
                    System.out.println("Puntos de vida"+ P1.curarse(5));
                    P1.mostrarEstado();
                    break;
                default:
                    System.out.println("ACCION NO VALIDA");
                    break;
            }

        }while(opcion != 5);

        }

    }
