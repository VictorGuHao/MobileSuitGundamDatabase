import java.util.ArrayList;
import java.util.List;
public class MobileUnits
{
    private List<Unit> mobileUnits;

    public MobileUnits(){ mobileUnits = new ArrayList<>(); }

    public Unit getByModelNumber(String ID)
    {
        for (Unit u : mobileUnits)
        {
            if (u.getModelNumber().equals(ID))
                return u;
        }
        return null;
    }

    public void addUnit(Unit u)
    {
        mobileUnits.add(u);
    }

    public List<Unit> getByUnitType(String unitType)
    {
        List<Unit> units= new ArrayList<>();
        for (Unit u : mobileUnits)
        {
            if (u.getUnitType().equals(unitType))
                units.add(u);
        }
        return units;
    }

    public String toString()
    {
        String theUnits = "";
        for (Unit u : mobileUnits)
            theUnits += u + "\n";
        return theUnits;
    }
}
