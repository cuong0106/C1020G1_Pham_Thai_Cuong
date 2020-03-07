package Controllers;

import java.io.FileWriter;

public class readAndWriteCSV {
    final String COMMA_DELIMITER = ",";
    final String NEW_LINE_SEPARATOR = "\n";
    final String fileNameVilla = "D:/Codegym/file git/module_2_Java_Core/FuramaResort/src/Data/villa.csv";

    public  void writeCSV() {
    //CSV file header
      final String FILE_HEADER_VILLA = "id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,areaPool,numberOfFloor";

     FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla);
            fileWriter.append("fdsfds");
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
        }
        catch (Exception e) {
            System.out.println("Error in CSV Villa file Writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close ");
            }
        }
    }

    public static void main(String[] args) {
        readAndWriteCSV readAndWriteCSV1 =new readAndWriteCSV();
        readAndWriteCSV1.writeCSV();
    }
}
