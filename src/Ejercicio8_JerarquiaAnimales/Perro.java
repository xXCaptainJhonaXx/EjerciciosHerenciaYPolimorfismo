package Ejercicio8_JerarquiaAnimales;

public class Perro extends Canido {
    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carinivoro";

    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "canis lupus familiaris";
    }
}
