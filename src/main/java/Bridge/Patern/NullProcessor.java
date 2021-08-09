package Bridge.Patern;

public class NullProcessor implements PostProcessor {
    @Override
    public byte[] process(byte[] bytes) {
        return bytes;
    }
}
