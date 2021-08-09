package Bridge.Patern;

public class EncryptedFile implements PostProcessor {
    @Override
    public byte[] process(byte[] bytes) {
        return new byte[0];
    }
}
