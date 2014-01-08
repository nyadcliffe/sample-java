package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFile {

    public List<String> getInputFileList(String pathName) throws FileNotFoundException, IOException {
        List<String> list = new ArrayList<String>();
        BufferedReader bufferedReader = null;
        try {
            FileReader file = new FileReader(pathName);
            bufferedReader = new BufferedReader(file);
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                list.add(string);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            throw fileNotFoundException;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw ioException;
        } finally {
        	bufferedReader.close();
        }
        return list;
    }
}
