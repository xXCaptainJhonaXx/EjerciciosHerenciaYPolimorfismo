package Ejercicio8_JerarquiaAnimales;

import java.awt.*;

public class Leon extends Felino {

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Pradera";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
