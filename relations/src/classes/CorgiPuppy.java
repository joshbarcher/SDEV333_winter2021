package classes;

public class CorgiPuppy extends Puppy
{
    public CorgiPuppy(String name, String nickName,
                      int monthsOld, double weightLbs)
    {
        super(name, nickName, monthsOld, weightLbs);
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
        CorgiPuppy other = (CorgiPuppy)someObject;

        return other.getName().equals(getName());
    }
}
