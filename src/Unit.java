import com.sun.xml.internal.ws.api.server.SDDocument;

public class Unit
{
    private String modelNumber;
    private String codename;
    private double height;
    private double weight;
    private double maxGross;
    private String unitType;
    private boolean tvOrNot;

    public Unit(String modelNumber, String codename, double height, double weight, double maxGross, String unitType, boolean tv)
    {
        this.modelNumber = modelNumber;
        this.codename = codename;
        this.height = height;
        this.weight = weight;
        this.maxGross = maxGross;
        this.unitType = unitType;
        tvOrNot = tv;
    }

    public String getModelNumber() { return modelNumber; }

    public String getCodename() { return codename; }

    public double getHeight() { return height; }

    public double getWeight() { return weight; }

    private double getMaxGross() { return maxGross; }

    public String getUnitType() { return unitType; }

    private boolean getTvOrNot() { return tvOrNot; }

    public String toString()
    {
        String data = "";
        data += getSpaces(7 - modelNumber.length()) + modelNumber;
        data += getSpaces(1);
        data += getSpaces(10 - codename.length()) + codename;
        data += " Height: " + height + " meters";
        data += " Weight: " + weight + " metric tons";
        data += " Max Gross: " + maxGross + " metric tons";
        data += " Unit Type: " + unitType;
        data += " TV Only: " + tvOrNot;
        return data;
    }

    public static String getSpaces(int numOfSpaces)
    {
        String spaces = "";
        for (int i = 0; i < numOfSpaces; i++)
            spaces += " ";

        return spaces;
    }
}
