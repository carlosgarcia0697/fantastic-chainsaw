import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){
        String str = "";

        try(BufferedReader reader = new BufferedReader(new FileReader("Puntos.txt"))){
            String linea = reader.readLine();
            String[] puntos = linea.substring(1, linea.length() - 1).split(", ");
            int i = 0;
        while(i < puntos.length){
            String punto = puntos[i] + ", " + puntos[i+1];
            str += "glVertex2f" + punto + ";\n";
            i += 2;
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Salida.txt"))){
            writer.write(str, 0, str.length() - 1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("¡Listo, funciones creadas!");
    }
}