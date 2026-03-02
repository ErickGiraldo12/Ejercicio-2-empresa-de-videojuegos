import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Personaje> lstLista = new ArrayList<>();
        int opcion, opcion2;
        Personaje P1 = null;

        do{
            System.out.println("==========================");
            System.out.println("     Menu ");
            System.out.println("1. Crea el personaje");
            System.out.println("2. Mostrar Personaje");
            System.out.println("3. Buscar Personaje");
            System.out.println("4. ¡A jugar!");
            System.out.println("5. Salir");
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

                    System.out.println("Ingrese si esta vivo o no (true/false)");
                    boolean vivo = teclado.nextBoolean();

                    P1 = new Personaje(nombre, nivel, experiencia, vida, vivo);
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

                    for (Personaje p: lstLista){
                        if(p.getNombre().equalsIgnoreCase(nombre1)){
                            P1 = p;
                            System.out.println(P1.toString());
                        }
                    }
                    break;

                case 4:
                    String nombreJugador;
                    System.out.println("INGRESE EL NOMBRE DEL PERSONAJE");
                    nombreJugador = teclado.next();

                    if (lstLista.isEmpty()){
                        System.out.println("La lista no tiene elementos");
                        break;
                    }

                    Personaje personajeSeleccionado = null;

                    for (Personaje p: lstLista){
                        if(p.getNombre().equalsIgnoreCase(nombreJugador)){
                            personajeSeleccionado = p;
                            System.out.println(personajeSeleccionado.toString());
                        }
                    }

                    if (personajeSeleccionado != null) {
                        do{
                            System.out.println("==========================");
                            personajeSeleccionado.mostrarEstado();
                            System.out.println("==========================");
                            System.out.println("     Menu ");
                            System.out.println("1. Gana experiencia");
                            System.out.println("2. Sube de nivel");
                            System.out.println("3. Aplica dano");
                            System.out.println("4. Curate");
                            System.out.println("5. Salir");
                            opcion2 = teclado.nextInt();

                            switch (opcion2) {
                                case 1:
                                    System.out.println("Cuanta experiencia quieres ganar?");
                                    int cantidadExp = teclado.nextInt();
                                    personajeSeleccionado.ganarExperiencia(cantidadExp);
                                    personajeSeleccionado.mostrarEstado();
                                    break;
                                case 2:
                                    System.out.println("Tu nuevo nivel es " + personajeSeleccionado.subirNivel());
                                    personajeSeleccionado.mostrarEstado();
                                    break;
                                case 3:
                                    System.out.println("Cuanto dano quieres aplicar?");
                                    int cantidadDano = teclado.nextInt();
                                    System.out.println("Dano aplicado: "+ personajeSeleccionado.recibirDano(cantidadDano));
                                    personajeSeleccionado.mostrarEstado();
                                    break;
                                case 4:
                                    System.out.println("Cuantos puntos de vida quieres recuperar?");
                                    int cantidadCura = teclado.nextInt();
                                    System.out.println("Puntos de vida: "+ personajeSeleccionado.curarse(cantidadCura));
                                    personajeSeleccionado.mostrarEstado();
                                    break;
                                default:
                                    System.out.println("ACCION NO VALIDA");
                                    break;
                            }

                        }while(opcion2 != 5);
                    } else {
                        System.out.println("Personaje no encontrado");
                    }
                    break;

                default:
                    System.out.println("ACCION NO VALIDA");
                    break;
            }
        }
        while(opcion != 5);
    }
}