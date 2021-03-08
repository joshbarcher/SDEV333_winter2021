package classes;

public class Puppy
{
    private String name;
    private String nickName;
    private int monthsOld;
    private double weightLbs;

    public Puppy(String name, String nickName,
                 int monthsOld, double weightLbs)
    {
        this.name = name;
        this.nickName = nickName;
        this.monthsOld = monthsOld;
        this.weightLbs = weightLbs;
    }

    @Override
    public boolean equals(Object someObject)
    {
        //make sure we have a puppy
        if (someObject == null || !(someObject.getClass().equals(getClass())))
        {
            return false;
        }

        //now I know I have a puppy here!
        Puppy other = (Puppy)someObject;

        return other.name.equals(name);
    }

    public String getName()
    {
        return name;
    }

    public String getNickName()
    {
        return nickName;
    }

    public int getMonthsOld()
    {
        return monthsOld;
    }

    public double getWeightLbs()
    {
        return weightLbs;
    }

    @Override
    public String toString()
    {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", monthsOld=" + monthsOld +
                ", weightLbs=" + weightLbs +
                '}';
    }
}
