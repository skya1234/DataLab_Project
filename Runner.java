
import java.util.*;
import java.io.*;
public class Runner  {
    public static void main(String[] args) throws FileNotFoundException{
    String name;
    double time;
    String nationality;
    String event;
    String[] tempLine = new String[10];
    
    File dataFile = new File("results.csv");
    Scanner input = new Scanner(dataFile);
    input.useDelimiter(",");
    int i = 0;
    while (input.hasNextLine()) {
        String line = input.nextLine();
        System.out.println("Line: " + line);
        System.out.println("Line Length: " + line.length());
        i++;
    }
    System.out.println(i);
    }
}