import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CopyFileText {
    public static String readFile(String filePath){
        FileInputStream file = null;
        FilterInputStream filter = null;
        String str = "";
        try {
            file = new FileInputStream(new File(filePath));
            filter = new BufferedInputStream(file);
            int  k =0;
            while ((k = filter.read())!=-1){
                str += (char) k;
            }
        }catch (IOException e){
            System.out.println("File khong ton tai hoac co noi dung loi");
        }
        return str;
    }
    public static void writeFile(String filePath,String filePath2){
        FileOutputStream file = null;
        FilterOutputStream filter = null;
        try {
            file = new FileOutputStream(new File(filePath2));
            filter = new FilterOutputStream(file);
            byte show[] = readFile(filePath).getBytes();
            file.write(show);
            filter.flush();
            System.out.println("success==========");
        }catch (IOException e){
            System.out.println("Tap tin dich da ton tai hoac loi");
        }
    }
public static void main(String[] args) {
    readFile("fromText.txt");
    writeFile("fromText.txt","toText.txt");
}
}
