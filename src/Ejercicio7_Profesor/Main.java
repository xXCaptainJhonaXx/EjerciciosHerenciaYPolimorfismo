package Ejercicio7_Profesor;

import java.util.*;

class Profesor {

    protected void imprimir(){
        System.out.println("Es un profesor");
    }
}

class ProfesorTitular extends Profesor {

    int años = 0;
    protected void imprimir() {
        System.out.println("Es un profesor titular");
    }

    protected void imprimirAños() {
        System.out.println("Años: " + años);
    }
}

public class Main {
    Vector profesor;

    public static void main(String[] args) {
        Main test = new Main();
        test.profesor = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        test.profesor.add(profesor1);
        test.profesor.add(profesor2);

        for (int i = 0; i < test.profesor.size(); i++){
            Profesor p = (Profesor) test.profesor.elementAt(i);
            p.imprimir();
        }
    }
}
