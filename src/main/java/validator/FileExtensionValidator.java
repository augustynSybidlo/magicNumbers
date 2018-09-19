package validator;

import java.io.File;

public interface FileExtensionValidator {

    boolean isValidExtension(File file);
    boolean isInternallyCorrectExtension(File file);
}
