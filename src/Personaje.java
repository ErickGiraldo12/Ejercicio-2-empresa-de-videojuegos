public class Personaje {
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    private boolean vivo;

    public Personaje() {
    }

    public Personaje(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }

    public void mostrarEstado(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Nivel: "+ this.getNivel());
        System.out.println("Experiencia: "+ this.getExperiencia());
        System.out.println("Vida: "+ this.getVida());
        System.out.println("Vivo: "+ this.isVivo());
    }

    public int ganarExperiencia(int cantidad){
       experiencia = cantidad + experiencia;
       return experiencia;
    }

    public int subirNivel (){
        nivel += 1;
        experiencia = 0;
        return nivel;
    }

    public int recibirDano(int cantidad){
        vida -= cantidad;
        if (vida <= 0){
            vivo = false;
            return vida;
        }else{
            return vida;
        }
    }

    public int curarse(int cantidad){
        vida += cantidad ;
        return vida;
    }






}






