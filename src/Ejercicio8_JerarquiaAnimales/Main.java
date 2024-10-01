package Ejercicio8_JerarquiaAnimales;

public class Main {
    public static void main(String[] args) {

        Animales[] animales = new Animales[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Leon();
        animales[3] = new Lobo();

        for (int i = 0; i < animales.length; i++){
            System.out.println("nombre cientifico: " + animales[i].getNombreCientifico());
            System.out.println("sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Habitat: " + animales[i].getHabitat());
            System.out.println();
        }
    }

}
