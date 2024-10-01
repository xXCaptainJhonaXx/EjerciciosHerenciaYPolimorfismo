package Ejercicio8_JerarquiaAnimales;

public class Gato extends Felino {

    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimentos() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis Silvestris catus";
    }
}
