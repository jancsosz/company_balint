import exceptions.HeightException;

public class Main {
    public static void main(String[] args) throws HeightException {
        throw new HeightException("So high");
    }
}