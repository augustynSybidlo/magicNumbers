package controller;

import factory.ExtensionType;
import factory.ExtensionValidatorFactory;
import validator.FileExtensionValidator;
import view.DisplayMessage;

import java.io.File;

public class ValidationController {

    private ExtensionValidatorFactory factory;
    private DisplayMessage displayMessage;
    private String path;

    public ValidationController(String path) {
        this.factory = new ExtensionValidatorFactory();
        this.displayMessage = new DisplayMessage();
        this.path = path;
    }

    public void validate() {
        File file = getFile();
        String extension = getExtension();
        FileExtensionValidator validator = factory.getValidator(ExtensionType.valueOf(extension));
        if (validator.isValidExtension(file)) {
            displayMessage.display(String.format("Extension %s is correct", extension));
        } else {
            displayMessage.display("Extension incorrect");
        }
    }

    private File getFile() {
        return new File(path);
    }

    private String getExtension() {
        int lastIndex = path.lastIndexOf('.');
        return path.substring(lastIndex);
    }
}
