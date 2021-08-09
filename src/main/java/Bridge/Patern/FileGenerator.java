package Bridge.Patern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class FileGenerator {

    private PostProcessor postProcessor;

    public void setPostProcessor(PostProcessor postProcessor) {
        this.postProcessor = postProcessor;
    }

    public final void fileGenerate(String name, Map<String, Object> properties) throws IOException {
        String content = generateContent(properties);
        byte[] bytes = content.getBytes();
        bytes = postProcessor.process(bytes);
        FileOutputStream outputFile = new FileOutputStream(name);
        outputFile.write(bytes);
        outputFile.close();
    }

    protected abstract String generateContent(Map<String, Object> properties);
}
