//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.sound.midi.Soundbank;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Personaje> lstLista = new ArrayList<>();
        int opcion;

        do{

            System.out.println("==========================");
            System.out.println("     Menu ");
            System.out.println("1. Crea el personaje");
            System.out.println("2. Mostrar Personaje");
            System.out.println("3. Buscar Persoanje");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre de tu personaje");
                    String nombre = teclado.next();

                    System.out.println("Ingresa la experiencia de tu personaje");
                    int experiencia = teclado.nextInt();

                    System.out.println("Ingrese la vida");
                    int vida = teclado.nextInt();

                    System.out.println("Ingrese el nivel");
                    int nivel = teclado.nextInt();

                    System.out.println("Ingrese si esta vivio o no");
                    boolean vivo = teclado.nextBoolean();


                    Personaje P1 = new Personaje(nombre, nivel, experiencia, vida, vivo);
                    lstLista.add(P1);
                    break;

                case 2:
                    for (Personaje p : lstLista){
                        System.out.println(p);
                    }

                    break;
                case 3:
                    String nombre1;
                    System.out.println("INGRESE EL NOMBRE DEL PERSONAJE");
                    nombre1 = teclado.next();

                    if (lstLista.isEmpty()){
                        System.out.println("La lista no tiene elementos");
                    }

                    Personaje P1 = null;

                    for (Personaje p: lstLista){
                        if(p.getNombre().equalsIgnoreCase(nombre1)){
                            P1 = p;
                            System.out.println(P1.toString());
                        }
                    }


                    break;
                default:
                    System.out.println("ACCION NO VALIDA");
                    break;
            }

        }while(opcion != 4);

        }

    }
