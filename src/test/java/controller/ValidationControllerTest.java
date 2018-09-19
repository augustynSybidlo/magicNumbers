package controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidationControllerTest {

    private String pathGif;
    private String pathJpg;
    private String pathTxt;

    @BeforeAll
    void setup() {
        File home = new File(System.getProperty("user.dir"));
        String homeDir = home.getPath();
        pathGif = homeDir + "/src/main/resources/test.gif";
        pathJpg = homeDir + "/src/main/resources/test.jpg";
        pathTxt = homeDir + "/src/main/resources/test.txt";
    }

    @Test
    void validateJpg() {
        ValidationController controller = new ValidationController(pathJpg);
        assertTrue(controller::validate);
    }

    @Test
    void validateGif() {
        ValidationController controller = new ValidationController(pathGif);
        assertTrue(controller::validate);
    }

    @Test
    void validateTxt() {
        ValidationController controller = new ValidationController(pathTxt);
        assertTrue(controller::validate);
    }
}