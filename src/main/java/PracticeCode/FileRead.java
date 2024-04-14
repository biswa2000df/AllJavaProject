package PracticeCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileRead {

    public static void main(String[] args) {
//        File file = new File("\u202AC:\\Users\\biswa\\Desktop\\csvReadForJmeter.txt");

        String filePath = "C:\\Users\\biswa\\Desktop\\csvReadForJmeter.txt";
        String line;

        ArrayList<String> txtFileRead = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while((line = reader.readLine()) != null){
//                System.out.println(line);
                txtFileRead.add(line);
            }

            System.out.println(txtFileRead);


        }catch (Exception e){
            System.out.println(e);
        }


    }
}
