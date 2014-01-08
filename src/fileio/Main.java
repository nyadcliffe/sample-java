package fileio;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InputFile inputFile = new InputFile();
        try {
            List<String> result = inputFile.getInputFileList("C:\\work\\javaToolTest\\input_data.txt");
            for (Object record : result) {
                System.out.println(record.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
