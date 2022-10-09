package HomeWork3LayerApp.Logger;

public class EmailLogger implements Logger {


    @Override
    public void log(String message) {
        System.out.println("Logged was sent via email : " + message );
    }
}
