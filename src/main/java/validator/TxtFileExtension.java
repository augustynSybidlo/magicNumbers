package validator;

import java.io.File;

public class TxtFileExtension implements FileExtensionValidator {



    public boolean isValidExtension(File file) {
        return false;
    }

    public boolean isInternallyCorrectExtension(File file) {
        return false;
    }
}
