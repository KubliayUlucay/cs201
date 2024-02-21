import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Read_prime_or_not {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dir = System.getProperty("user.dir");
        System.out.println(dir); //desktop shortcut
        File textfile = new File("text.txt");
        Scanner Reader = new Scanner(textfile);
        String firstdata = Reader.nextLine();
        System.out.println(firstdata);
        int length = Integer.parseInt(firstdata); //first data is actually length of the file
        File obj = new File("Output.txt");
        PrintWriter writer = new PrintWriter("Output.txt");

        for(int i = 1; i<=length; i++){
            boolean isPrime = true;
            String data = Reader.nextLine();
            int newdata = Integer.parseInt(data); // for example 7 got here

            if(newdata <3){
                isPrime = false;
            }else{
                for(int j = 3; j<newdata; j++){
                    if(newdata%j==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                //System.out.println("Prime");
                writer.println("Prime");
            }else {
                //System.out.println("Not Prime");
                writer.println("Not Prime");
            }
        }
        writer.close();

    }
}
