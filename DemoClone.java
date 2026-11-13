class Marvellous implements Cloneable
{
    public int i , j;
    public Marvellous(int A , int B)
    {
        this.i = A;
        this.j = B;
    }

    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

}

public class DemoClone {
    public static void main ( String A[]) throws CloneNotSupportedException
    {
        Marvellous mobj1 = new Marvellous(11, 21);
        Marvellous mobj2 = (Marvellous)mobj1.clone();
        System.out.println(mobj1.i  + " : " + mobj1.j);
        System.out.println(mobj2.i  + " : " + mobj2.j);
    }
}
