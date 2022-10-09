package HomeWork3LayerApp.Logger;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logged into the file : " + message);
    }
}
