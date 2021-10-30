/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_p2karimguifarro;

import java.util.*;

public class Lab3_P2KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random R = new Random();
    public static ArrayList<Gimnasios> listg = new ArrayList();
    public static ArrayList<Entrenadores> liste = new ArrayList();
    public static ArrayList<pkmn> listp = new ArrayList();

    public static void main(String[] args) {
        char k = 'c';
        while (k == 'c') {
            System.out.println("Menu\n"
                    + "1)Pokemon\n"
                    + "2)Entrenador\n"
                    + "3)Gimansio\n"
                    + "4)Batalla\n"
                    + "5)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    Pokemon();
                }
                break;
                case 2: {
                    Entrenador();
                }
                break;
                case 3: {
                    Gimnasio();
                }
                break;
                case 4: {
                    Batalla();
                }
                break;
                case 5:{
                    k='g';
                }
            }
        }
    }

    public static void Entrenador() {
        char k = 'c';
        while (k == 'c') {
            System.out.println("Menu\n"
                    + "1)Crear Entrenador\n"
                    + "2)Listar Entrenadores\n"
                    + "3)Eliminar Entrenadores\n"
                    + "4)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {

                    String nombre, sexo = "";
                    int edad;
                    System.out.println("Escriba el nombre:");
                    nombre = KaOz.next();
                    System.out.println("Sexo\n"
                            + "1)Masculino\n"
                            + "2)Femenino");
                    int op2 = KaOz.nextInt();
                    switch (op2) {
                        case 1: {
                            sexo = "M";
                        }
                        break;
                        case 2: {
                            sexo = "F";
                        }

                    }
                    System.out.println("Ingrese la edad:");
                    edad = KaOz.nextInt();

                    System.out.println("POKEMON"
                            + "1)Novato\n"
                            + "2)Maestro\n"
                            + "3)Coordinador\n"
                            + "4)Legendario\n");
                    int op1 = KaOz.nextInt();
                    switch (op1) {
                        case 1: {
                            int cpok;
                            pkmn pok;
                            System.out.println("Ingrese la cantidad de pokemon descubiertos:");
                            cpok = KaOz.nextInt();

                            if (listp.isEmpty()) {
                                Pokemon();
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            } else {
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            }
                            liste.add(new Novatos(nombre, sexo, edad, cpok, pok));
                        }
                        break;
                        case 2: {
                            int vic;
                            pkmn pok;
                            System.out.println("Ingrese la cantidad de victorias del entrenador:");
                            vic = KaOz.nextInt();
                            if (listp.isEmpty()) {
                                Pokemon();
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            } else {
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            }
                            liste.add(new Maestro(nombre, sexo, edad, vic, pok));
                        }
                        break;
                        case 3: {
                            ArrayList<pkmn> cpo = new ArrayList();
                            pkmn pok;
                            if (listp.isEmpty()) {
                                Pokemon();
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            } else {
                                int cont = 0;
                                char t = 'n';
                                while (t == 'n') {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    int pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                    while (pok.getTipo().equals("Legendario")) {
                                        System.out.println("Ingrese el pokemon de este entrenador:");
                                        listpo();
                                        pos = KaOz.nextInt();
                                        pok = listp.get(pos);
                                        System.out.println("Desea seguir añadiendo pkmn? [1/2]");
                                        System.out.println("1)Seguir\n"
                                                + "2)Parar");
                                        if (cont == listp.size()) {
                                            t = 's';
                                        }
                                        int de = KaOz.nextInt();
                                        while (de < 0 || de > 2) {
                                            System.out.println("Reingrese los datos:");
                                            de = KaOz.nextInt();
                                        }
                                        cont++;
                                        if (de == 1) {
                                            t = 'n';
                                        } else if (de == 2) {
                                            t = 's';
                                        }
                                    }
                                }
                            }
                        }
                        break;
                        case 4: {
                            pkmn pok;
                            if (listp.isEmpty()) {
                                Pokemon();
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            } else {
                                System.out.println("Ingrese el pokemon de este entrenador:");
                                listpo();
                                int pos = KaOz.nextInt();
                                pok = listp.get(pos);
                                while (!pok.getTipo().equals("Legendario")) {
                                    System.out.println("Ingrese el pokemon de este entrenador:");
                                    listpo();
                                    pos = KaOz.nextInt();
                                    pok = listp.get(pos);
                                }
                            }
                            liste.add(new Legendario(nombre, sexo, edad, pok));
                        }
                    }
                }
                break;
                case 2: {
                    listen();
                }
                break;
                case 3: {
                    int pos;
                    listen();
                    System.out.println("elija el entrenador que desea eliminar:");
                    pos = KaOz.nextInt();
                    while (pos < 0 || pos > liste.size()) {
                        System.out.println("Ingrese el valor de nuevo");
                        pos = KaOz.nextInt();
                    }
                    liste.remove(pos);
                }
                break;
                case 4: {
                    k = 'd';
                }
                break;
                default:
                    System.out.println("El valor ingresado no existe");
            }
        }
    }

    public static void Gimnasio() {
        char k = 'c';
        while (k == 'c') {
            System.out.println("Gimnasios\n"
                    + "1)Crear Gimnasios\n"
                    + "2) Listar Gimnasios\n"
                    + "3) Eliminar Gimnasios"
                    + "3)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    String nombre, ciudad;
                    int victorias, derrotas, dinero;
                    System.out.println("Ingrese el nombre del Gimnasio:");
                    nombre = KaOz.next();
                    System.out.println("Ingrese el nombre de la ciudad");
                    ciudad = KaOz.next();
                    System.out.println("Ingrese el Lider:");
                    System.out.println("Ingrese el nombre del lider:");
                    String n1 = KaOz.next();
                    String sexo = "";
                    System.out.println("Sexo\n"
                            + "1)Masculino\n"
                            + "2)Femenino");
                    int op2 = KaOz.nextInt();
                    switch (op2) {
                        case 1: {
                            sexo = "M";
                        }
                        break;
                        case 2: {
                            sexo = "F";
                        }

                    }
                    System.out.println("Ingrese la edad:");
                    int edad = KaOz.nextInt();
                    System.out.println("Ingrese las victorias del lider:");
                    int vic = KaOz.nextInt();
                    System.out.println("Ingrese el pokemon de este entrenador:");
                    pkmn pok;
                    listpo();
                    int pos = KaOz.nextInt();
                    pok = listp.get(pos);
                    while (!pok.getTipo().equals("Legendario")) {
                        System.out.println("Ingrese el pokemon de este entrenador:");
                        listpo();
                        pos = KaOz.nextInt();
                        pok = listp.get(pos);
                    }
                    Maestro lider = new Maestro(n1,sexo,edad,vic,pok);
                        dinero=0+R.nextInt(10);
                        System.out.println("Ingrese la cantidad de Victorias del Gimnasio:");
                        victorias=KaOz.nextInt();
                        System.out.println("Ingrese la cantidad de Derrotas:");
                        derrotas=KaOz.nextInt();
                        listg.add(new Gimnasios(nombre,ciudad,victorias,derrotas,dinero,lider));
                }
                break;
                case 2:{
                    listgi();
                }
                break;
                case 3:{
                    int pos;
                    listen();
                    System.out.println("elija el Gimnasio que desea eliminar:");
                    pos = KaOz.nextInt();
                    while (pos < 0 || pos > listg.size()) {
                        System.out.println("Ingrese el valor de nuevo");
                        pos = KaOz.nextInt();
                    }
                    listg.remove(pos);
                }
                    
            }
        }
    }
    

    public static void Batalla() {

    }

    public static void Pokemon() {
        char k = 'c';
        while (k == 'c') {
            System.out.println("POKEMON\n"
                    + "1)Crear Pokemon\n"
                    + "2) Listar Pokemon\n"
                    + "3)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    String tipo = "", nombre;
                    int atk, hp;
                    System.out.println("Ingrese el nombre:");
                    nombre = KaOz.next();
                    System.out.println("Tipos\n"
                            + "1)Agua\n"
                            + "2)Fuego\n"
                            + "3)Planta\n"
                            + "4)Legendario");
                    int p = KaOz.nextInt();
                    switch (op) {//Inicio segundo switch de el metodos pokemon
                        case 1: {
                            tipo = "Agua";
                        }//Fin case 1
                        break;
                        case 2: {
                            tipo = "Fuego";
                        }//Fin case 2
                        break;
                        case 3: {
                            tipo = "Planta";
                        }//Fin case 3
                        break;
                        case 4: {
                            tipo = "Legendario";
                        }//Fin case 4
                        break;
                        default:
                            System.out.println("Ingrese de nuevo el valor");
                    }
                    System.out.println("Ingrese el ataque:");
                    atk = KaOz.nextInt();
                    while (atk < 99 || atk > 201) {
                        System.out.println("El valor de vida es invalido");
                        System.out.println("Volver a ingresarlo");
                        atk = KaOz.nextInt();
                    }
                    System.out.println("Ingrese los puntos de vida:");
                    hp = KaOz.nextInt();
                    while (hp < 200 || hp > 500) {
                        System.out.println("El valor de vida es invalido");
                        System.out.println("Volver a ingresarlo");
                        hp = KaOz.nextInt();
                    }
                    listp.add(new pkmn(nombre, atk, hp, tipo));
                }
                break;
                case 2: {
                    listpo();
                }
                break;
                case 3: {
                    k = 'g';
                }
            }
        }
    }

    public static void listpo() {
        int cont = 0;
        for (pkmn p : listp) {
            System.out.println(cont + ")" + p);
            cont++;
        }
    }

    public static void listen() {
        int cont = 0;
        for (Entrenadores e : liste) {
            System.out.println(cont + ")" + e);
            cont++;
        }
    }
    public static void listgi(){
        int cont = 0;
        for (Gimnasios g : listg) {
             System.out.println(cont + ")" + g);
            cont++;
        }
    }

}
