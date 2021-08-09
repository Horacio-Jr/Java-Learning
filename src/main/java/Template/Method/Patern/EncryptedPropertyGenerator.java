package Template.Method.Patern;

import java.io.IOException;
import java.util.Map;

public class EncryptedPropertyGenerator extends FileGenerator {

    private final int delay;

    public EncryptedPropertyGenerator(int delay) {
        this.delay = delay;
    }

    protected byte[] process(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }

    @Override
    protected String generateContent(Map<String, Object> properties) {
        StringBuilder contentBuilder = new StringBuilder();
        for (String property : properties.keySet()) {
            contentBuilder.append(property + "=" + properties.get(property) + "\n");
        }
        return contentBuilder.toString();
    }
}
