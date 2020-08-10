import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by KPS on 8/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path  = new File("d:\\employee.txt");
        try(FileWriter writer = new FileWriter(path,true);
        BufferedWriter writer2 = new BufferedWriter(writer)){
            writer2.write("\t\nomid");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
