import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\myname.txt");
            Scanner mye = new Scanner(myFile);

            while (mye.hasNextLine()){
                String da = mye.nextLine();
                System.out.println(da);
            }
        }catch (FileNotFoundException e){
            System.out.println("error.");
            e.printStackTrace();
        }
    }
}