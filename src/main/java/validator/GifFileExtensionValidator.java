package validator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GifFileExtensionValidator implements FileExtensionValidator {

    public boolean isValidExtension(File file) {
        String fileName = file.getName().toUpperCase();
        boolean extension = fileName.endsWith(".GIF");

        if(!extension) return false;

        FileInputStream in = null;
        int sizeOfArray = 6;
        byte[] magicNumbers = new byte[sizeOfArray];
        byte[] extensionSignature = {71, 73, 70, 56, 57, 97};
        byte[] secondExtSignature = {71, 73, 70, 56, 55, 97};
        try{
            in = new FileInputStream(file);
            int count = in.read(magicNumbers);
            if (count < 6) return false;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return FileExtensionValidator.validate(magicNumbers, extensionSignature)
                || FileExtensionValidator.validate(magicNumbers, secondExtSignature);
    }
}
