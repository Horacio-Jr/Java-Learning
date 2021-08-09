package Template.Method.Patern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class FileGenerator {

    public final void fileGenerate(String name, Map<String, Object> properties) throws IOException {
        String content = generateContent(properties);
        byte[] bytes = content.getBytes();
        bytes = process(bytes);
        FileOutputStream outputFile = new FileOutputStream(name);
        outputFile.write(bytes);
        outputFile.close();
    }

    protected byte[] process(byte[] bytes) throws IOException {
        return bytes;
    }

    protected abstract String generateContent(Map<String, Object> properties);
}
