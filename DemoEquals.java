class Marvellous
{
    public int i , j;
    public Marvellous(int A , int B)
    {
        this.i = A;
        this.j = B;
    }

}

public class DemoEquals {
    public static void main ( String A[])
    {
        Marvellous mobj1 = new Marvellous(11, 21);
        Marvellous mobj2 = new Marvellous(11, 21);

        if (mobj1.equals(mobj2))
        {
            System.out.println("Objects are Equal");
        }

        else
        {
            System.out.println("Objects are Not Equal");
        }
    }
}
