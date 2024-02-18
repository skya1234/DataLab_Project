import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String[] args) throws FileNotFoundException{
    String name;
    double time;
    String nationality;
    String event;
    ArrayList<String> templist = new ArrayList<String>();
    ArrayList<Athlete> athletes = new ArrayList<Athlete>();

    File dataFile = new File("results.csv");
    Scanner input = new Scanner(dataFile);
    input.useDelimiter(",");
    while (input.hasNextLine()) {

        Scanner lineScanner = new Scanner(input.nextLine());
        lineScanner.useDelimiter(",");
        while (lineScanner.hasNext()) {
          
          templist.add(lineScanner.next());
          
        }
      
      
        if (templist.get(1).equals("100M Men") && !templist.get(7).equals("None")) {
            
            name = templist.get(5);
            nationality = templist.get(6);
            time = Double.parseDouble(templist.get(7));
            Athlete athlete = new Athlete(name, nationality, time);
            athletes.add(athlete);
        }
        templist.clear();
        
    }   
    for (Athlete obj : athletes) {
        System.out.println(obj.getName());
    }
    }
}