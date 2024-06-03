import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coches> cochesArrayList = new ArrayList<>();
        Coches coches;
        InsertarCoches insertarCoches = new InsertarCoches();
        LeerCoches leerCoches = new LeerCoches();
        Scanner scanner = new Scanner(System.in);

        int aux = 0;

        System.out.println("Concesionario Trassierra\n " +
                "1- Insertar Coches\n" +
                "2- Leer coches por eleccion\n" +
                "3- Eliminar coches matriculados < 2000\n" +
                "4- Salir");
        aux = scanner.nextInt();
        while(aux != 4){
            switch (aux){
                case 1:
                    String matricula, modelo, marca;
                    int ageMatricula;

                    System.out.println("Dime la matricula del coche");
                    matricula = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Dime el modelo del coche");
                    modelo = scanner.nextLine();
                    System.out.println("Dime la marca del coche");
                    marca = scanner.nextLine();
                    System.out.println("Dime el año de matriculacion del coche");
                    ageMatricula = scanner.nextInt();

                    coches = new Coches(matricula, modelo, marca, ageMatricula);

                    insertarCoches.insertarCocheEnFile(coches);

                    System.out.println(coches.toString());
                    break;
                case 2:
                    System.out.println("1) < 2000");
                    System.out.println("2) > 2000");
                    System.out.println("3) Salir");
                    aux = scanner.nextInt();
                    while (aux != 3){
                        switch (aux) {
                            case 1 -> leerCoches.leerCochesMayores2000();
                            case 2 -> leerCoches.leerCochesMenores2000();
                            default -> System.out.println("Rango invalido");
                        }

                        System.out.println("1) < 2000");
                        System.out.println("2) > 2000");
                        System.out.println("3) Salir");
                        aux = scanner.nextInt();
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Rango numerico invalido");
                    break;
            }

            System.out.println("Concesionario Trassierra\n " +
                    "1- Insertar Coches\n" +
                    "2- Leer coches por eleccion\n" +
                    "3- Eliminar coches matriculados < 2000\n" +
                    "4- Salir");
            aux = scanner.nextInt();
        }
    }


    public static void cargarArray(ArrayList<Coches> cochesArrayList) {
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("coches.dat"));


            Coches coche = (Coches) objectInputStream.readObject();
            while (coche != null){
                if (!cochesArrayList.contains(coche)){
                    cochesArrayList.add(coche);
                }
                coche = (Coches) objectInputStream.readObject();
            }

        } catch (EOFException ex){
            System.out.println("e");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}