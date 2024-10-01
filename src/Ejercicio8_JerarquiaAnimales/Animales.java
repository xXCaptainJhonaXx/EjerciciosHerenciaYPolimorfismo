package Ejercicio8_JerarquiaAnimales;

public abstract class Animales {

    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
    public abstract String getNombreCientifico();

}

abstract class Canido extends Animales {

}

abstract class Felino extends Animales {

}
