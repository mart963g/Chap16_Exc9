package Exc_9;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(13);
        list.add(15);
        System.out.println(list);
        list.stutter();
        System.out.println(list);
    }
}
