import java.io.*;
import java.util.ArrayList;

public class InsertarCoches {
    String fileName = "coches.dat";
    ObjectOutputStream objectOutputStream = null;

    /**
     *
     * @param coches
     */
    public void insertarCocheEnFile(Coches coches){
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName, true));
            objectOutputStream.writeObject(coches);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
