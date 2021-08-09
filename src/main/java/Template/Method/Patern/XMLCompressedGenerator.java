package Template.Method.Patern;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class XMLCompressedGenerator extends FileGenerator {

    protected byte[] process(byte[] bytes) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        zipOutputStream.putNextEntry(new ZipEntry("internal"));
        zipOutputStream.write(bytes);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    protected String generateContent(Map<String, Object> properties) {
        StringBuilder contentBuilder = new StringBuilder();
        contentBuilder.append("<properties>");
        for (String property : properties.keySet()){
            contentBuilder.append("<" + property + ">" + properties.get(property) + "</" + property + ">");
        }
        contentBuilder.append("</properties>");
        return contentBuilder.toString();
    }
}
