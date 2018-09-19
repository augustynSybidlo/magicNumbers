package validator;

import java.io.File;

public interface FileExtensionValidator {

    boolean isValidExtention(File file);
    boolean isInternallyCorrectExtention(File file);
}
