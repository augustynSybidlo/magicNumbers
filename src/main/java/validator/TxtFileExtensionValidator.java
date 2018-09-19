package validator;

import java.io.*;

public class TxtFileExtensionValidator implements FileExtensionValidator {

    public boolean isValidExtension(File file) {
        String fileName = file.getName().toUpperCase();
        boolean extension = fileName.endsWith(".TXT");

        if(!extension) return false;
        BufferedReader in;
        int sizeOfArray = 1024;
        char[] chars = new char[sizeOfArray];

        try{
            in = new BufferedReader(new FileReader(file));
            in.read(chars);
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return validate(chars);
    }

    private boolean validate(char[] chars) {
        for (char ch : chars) {
            if (!(ch > 0 && ch < 127)) return false;
        }
        return true;
    }
}
