class Marvellous
{
    public int i , j;
    public Marvellous(int A , int B)
    {
        this.i = A;
        this.j = B;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize");
    }
}

public class DemoFinalize {
    public static void main ( String A[])
    {
        Marvellous mobj1 = new Marvellous(11, 21);
        Marvellous mobj2 = new Marvellous(11, 21);

        mobj1 = null;
        mobj2 = null;
        
        System.gc();
        System.err.println("End of main");

    }
}
