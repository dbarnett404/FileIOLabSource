import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> allStrings = new ArrayList<>();
        //READ FILE GOES HERE FileIO.fileName assign return to allStrings

        Welcome welcome = new Welcome("Welcome Form", allStrings);
        welcome.setVisible(true);

    }
}
