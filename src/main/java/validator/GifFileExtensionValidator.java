package validator;

import java.io.File;

public class GifFileExtensionValidator implements FileExtensionValidator {

    public boolean isValidExtension(File file) {
        return false;
    }
}
