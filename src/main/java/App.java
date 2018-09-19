import controller.ValidationController;

public class App {

    public static void main(String[] args) {
        int pathParamIndex = 0;
        String path = args[pathParamIndex];

        ValidationController controller = new ValidationController(path);
        controller.validate();
    }
}
