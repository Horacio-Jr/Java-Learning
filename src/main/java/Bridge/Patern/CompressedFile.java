package Bridge.Patern;

public class CompressedFile implements PostProcessor {
    @Override
    public byte[] process(byte[] bytes) {
        return bytes;
    }
}
