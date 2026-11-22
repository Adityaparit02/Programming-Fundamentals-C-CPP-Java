class Marvellous
{
    public int i , j;
    public Marvellous(int A , int B)
    {
        this.i = A;
        this.j = B;
    }

    public String toString()
    {
        return "value of i : " +  this.i + "      Value of j : "+  this.j;
    }
}

public class DemoToStringXX {
    public static void main ( String A[])
    {
        Marvellous mobj1 = new Marvellous(11, 21);
        Marvellous mobj2 = new Marvellous(51, 101);

        System.out.println(mobj1);  //mobj1.toString
        System.out.println(mobj2);  //mobj1.toString
    }
}
