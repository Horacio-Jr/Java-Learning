package Template.Method.Patern;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) throws IOException {
        XMLCompressedGenerator fileGenerator = new XMLCompressedGenerator();

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("nome","Horacio Vicente");
        data.put("apelido", "Comate Junior");
        data.put("idade", 25);

        fileGenerator.fileGenerate("Arquivo", data);

    }
}
