package factory;

import validator.FileExtensionValidator;
import validator.GifFileExtensionValidator;
import validator.JpgFileExtensionValidator;
import validator.TxtFileExtensionValidator;

public class ExtensionValidatorFactory {

    public FileExtensionValidator getValidator(ExtensionType type) {
        FileExtensionValidator validator = null;
        switch(type) {
            case TXT:
                validator = new TxtFileExtensionValidator();
            case GIF:
                validator = new GifFileExtensionValidator();
            case JPG:
                validator = new JpgFileExtensionValidator();
        }
        return validator;
    }
}
