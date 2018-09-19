package validator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JpgFileExtensionValidator implements FileExtensionValidator {

    /*
     * Method checks if extension signature is same as
     * in file first 3 bytes
     */
    public boolean isValidExtension(File file) {
        String fileName = file.getName().toUpperCase();
        boolean extension = fileName.endsWith(".JPEG") || fileName.endsWith(".JPG");

        if(!extension) return false;

        FileInputStream in = null;
        int sizeOfArray = 3;
        byte[] magicNumbers = new byte[sizeOfArray];
        byte[] extensionSignature = {-1, -40, -1};

        try{
            in = new FileInputStream(file);
            int count = in.read(magicNumbers);
            if (count < 3) return false;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return FileExtensionValidator.validate(magicNumbers, extensionSignature);
    }
}
