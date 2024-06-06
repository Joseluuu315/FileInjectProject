import java.util.ArrayList;

public class LeerCoches {
    ArrayList<Coches> cochesArrayList = new ArrayList<>();
    ArrayList<Coches> cochesLecturaArray = new ArrayList<>();
    Coches coches;

    public void leerCochesMayores2000(){
        cochesLecturaArray = new ArrayList<>();
        Main.cargarArray(cochesArrayList);

        for (Coches coche: cochesArrayList
             ) {
            if (coche.getAgeMatricula() > 2000){
                cochesLecturaArray.add(coche);
            }
        }

        System.out.println("Mayores de 2000");

        for (Coches coche1 : cochesLecturaArray){
            System.out.println(coche1.toString());
        }
    }

    public void leerCochesMenores2000(){
        cochesLecturaArray = new ArrayList<>();
        Main.cargarArray(cochesArrayList);


        for (Coches coche: cochesArrayList
        ) {
            if (coche.getAgeMatricula() < 2000){
                cochesLecturaArray.add(coche);
            }
        }

        System.out.println("Menores de 2000");

        for (Coches coche1 : cochesLecturaArray){
            System.out.println(coche1.toString());
        }

    }
}
