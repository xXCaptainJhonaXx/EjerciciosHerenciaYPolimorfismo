package Ejercicio5_Informatica;

class DispositivoInformatico {
    String marca = "Acer";

    public DispositivoInformatico() {
        System.out.println("Marca: " + marca);
    }

    
}

class Tableta extends DispositivoInformatico {
    Tableta(String marca){
        System.out.println("Marca: " + marca);
    }
}

public class Main {

    public static void main(String[] args) {
        Tableta tableta = new Tableta("Dell");
    }

}
