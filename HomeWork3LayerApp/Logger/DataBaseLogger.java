package HomeWork3LayerApp.Logger;

public class DataBaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("The Logged into the database :  " + message);
    }
}
