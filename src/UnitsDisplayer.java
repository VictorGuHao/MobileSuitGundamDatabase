import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class UnitsDisplayer
{
    public static void main(String[] args) throws Exception
    {
        String filename = "Mobile Suit Gundam.csv";
        File inputFile = new File(filename);
        if (!inputFile.exists())
            System.out.println(filename + " cannot be found,");
        else
        {
            Scanner input =  new Scanner(inputFile);
            MobileUnits mu = new MobileUnits();
            input = new Scanner(inputFile);

            String currentLine;
            String[] unitData;
            Unit u;
            input.nextLine();
            while (input.hasNextLine())
            {
                currentLine = input.nextLine();
                unitData = currentLine.split(",");
                u = new Unit(unitData[0], unitData[1], Double.parseDouble(unitData[2]), Double.parseDouble(unitData[3]), Double.parseDouble(unitData[4]), unitData[5], Boolean.parseBoolean(unitData[6]));
                mu.addUnit(u);
            }
            input.close();

            System.out.println(mu);
            System.out.println();

            mu.sortByCodename();
            System.out.print(mu);

            System.out.println();

            mu.sortByModelNumber();
            System.out.print(mu);

            System.out.println();

            mu.sortByCodename();
            System.out.println(mu);

            System.out.println();

            System.out.println(mu.getByCodename("Gundam"));
            System.out.println();
            System.out.println(mu.getByUnitType("Mobile Suit"));
            System.out.println();
            System.out.println(mu.getByTVOnly());
            System.out.println();
            System.out.println("The average height for all unit is: " + mu.getAverageHeightForAllUnit() + " meters.");
            System.out.println("The average weight for all Mobile Suit is: " + mu.getAverageWeightByUnitType("Mobile Suit") + " metric tons.");
        }
    }
}
