public class Patient
{
    public int IDnum;
    public double caffeineLevel;

    public Patient(int idnum, double caffeine)
    {
        this.IDnum = idnum;
        this.caffeineLevel = caffeine;
    }

    // getters
    public double getCaffeineLevel()
    {
        return caffeineLevel;
    }

    public int getIdNumber()
    {
        return IDnum;
    }

    // setters
    public void setCaffineLevel(double caffeineLevel)
    {
        this.caffeineLevel = caffeineLevel;
    }

    public void setIdNumber(int idNumber)
    {
        this.IDnum = idNumber;
    }

}