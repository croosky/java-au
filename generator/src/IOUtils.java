import java.util.*;
import java.io.*;

public class IOUtils {
    public static List<String> read(String txtSource) throws IOException {
        List<String> data = new ArrayList<>();
        File file = new File(txtSource);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            data.add(line);
            line = reader.readLine();
        }
        return data;
    }

    public static void write(String source, String generated) throws IOException{
        File file = new File(source);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(generated);
        fileWriter.close();
    }
}
