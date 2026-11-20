class Marvellous
{
    public int i , j;
    public Marvellous(int A , int B)
    {
        this.i = A;
        this.j = B;
    }

}

public class DemoToString {
    public static void main ( String A[])
    {
        Marvellous mobj1 = new Marvellous(11, 21);
        Marvellous mobj2 = new Marvellous(11, 21);

        System.out.println(mobj1);
        System.out.println(mobj2);
    }
}
