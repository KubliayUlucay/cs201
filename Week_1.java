import java.io.*;
import java.util.Scanner;
import List.LinkedList;
import List.Node

public class Week_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File textfile = new File("input1.txt");
        Scanner Reader = new Scanner(textfile);
        String firstdata = Reader.nextLine(); //first line
        System.out.println(firstdata);
        int length = Integer.parseInt(firstdata); //first data is actually length of the file now it is 3
        File obj = new File("Output1.txt");
        PrintWriter writer = new PrintWriter("Output1.txt");
        LinkedList MyList = new LinkedList();
        Node MyNode = ?
       for (int i = 1; i<length; i++) {
           String[] nextData = Reader.nextLine().split(" ");
           int LengthOfSeperatedArray = nextData.length();
           for (int k = 1 ; k<LengthOfSeperatedArray; k++) {
               MyList.insertLast(nextData[k]);
           }
        }

    }
}
