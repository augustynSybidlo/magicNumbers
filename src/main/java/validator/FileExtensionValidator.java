package validator;

import java.io.File;

public interface FileExtensionValidator {

    boolean isValidExtension(File file);
    static boolean validate(byte[] firstArray, byte[] secondArray) {
        for (int x = 0; x < firstArray.length; x++) {
            if (firstArray[x] != secondArray[x]) return false;
        }
        return true;
    }
}
