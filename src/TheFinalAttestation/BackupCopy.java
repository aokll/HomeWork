package TheFinalAttestation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
во вновь созданную папку ./backup*/

public class BackupCopy {


    public void toCreateAFileAndCopyFiles(String fileName) throws IOException {
       String fileCreationPath = "src//TheFinalAttestation//directory//"+ fileName +".txt";
        String fileCopyCreationPath = "src//TheFinalAttestation//backupDir//BACKUP"+ fileName +".txt";

        File dir = new File("src//TheFinalAttestation//directory");
        File copy = new File("src//TheFinalAttestation//backupDir");
        copy.mkdir();
        dir.mkdir();

        try (
                FileWriter fileWriter = new FileWriter(fileCreationPath);
                FileWriter fileWriter1 = new FileWriter(fileCopyCreationPath);
        ){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст");
            String txt = scanner.next();


            fileWriter.write(txt);
            fileWriter1.write(txt);

        }
    }
}
