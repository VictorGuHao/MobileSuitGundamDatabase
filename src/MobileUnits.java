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

    public void sortByModelNumber()
    {
        for (int i = 1; i < mobileUnits.size(); i++)
        {
            int index = i;
            Unit temp = mobileUnits.get(i);
            while (index > 0 && temp.getModelNumber().compareTo(mobileUnits.get(index - 1).getModelNumber()) < 0)
            {

                mobileUnits.set(index, mobileUnits.get(index - 1));
                index--;
            }
            mobileUnits.set(index, temp);
        }
    }

    public void sortByCodename()
    {
        for (int i = 1; i < mobileUnits.size(); i++)
        {
            int index = i;
            Unit temp = mobileUnits.get(i);
            while (index > 0 && temp.getCodename().compareTo(mobileUnits.get(index - 1).getCodename()) < 0)
            {

                mobileUnits.set(index, mobileUnits.get(index - 1));
                index--;
            }
        mobileUnits.set(index, temp);
        }
    }

    public Unit getByCodename(String codename)
    {
        for (Unit u : mobileUnits)
        {
            if (u.getCodename().equals(codename))
                return u;
        }
        return null;
    }

    public MobileUnits getByUnitType(String unitType)
    {
        MobileUnits units= new MobileUnits();
        for (Unit u : mobileUnits)
        {
            if (u.getUnitType().equals(unitType))
                units.addUnit(u);
        }
        return units;
    }

    public MobileUnits getByTVOnly()
    {
        MobileUnits units= new MobileUnits();
        for (Unit u : mobileUnits)
        {
            if (u.getTvOrNot() == true)
                units.addUnit(u);
        }
        return units;
    }

    public double getAverageHeightForAllUnit()
    {
        double sum = 0.0;
        for (Unit u : mobileUnits)
        {
            sum += u.getHeight();
        }
        return sum/mobileUnits.size();
    }

    public double getAverageWeightByUnitType(String unitType)
    {
        List<Unit> units = new ArrayList<>();
        for (Unit u : mobileUnits)
        {
            if (u.getUnitType().equals(unitType))
                units.add(u);
        }
        double sum = 0.0;
        for (Unit u : units)
            sum += u.getWeight();
        return sum/units.size();
    }

    public String toString()
    {
        String theUnits = "";
        for (Unit u : mobileUnits)
            theUnits += u + "\n";
        return theUnits;
    }
}
