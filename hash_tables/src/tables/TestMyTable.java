package tables;

public class TestMyTable
{
    public static void main(String[] args)
    {
        HashTable<String> names = new HashTable<>();

        names.add("Ruslan");
        names.add("Joseph");
        names.add("Dana");
        names.add("Ellie");
        names.add("Ryan");
        names.add("Ryan");
        names.add("Jo");
        names.add("Josh");
        names.add("Jessica");

        System.out.println(names);
    }
}
