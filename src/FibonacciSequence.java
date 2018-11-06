public class FibonacciSequence {
    public static void main(String args[]) {
        int n1=0;
        int n2=1;
        int n3;
        int i;
        int howmany=10; //howmany = number of elements of the sequence that are shown
        System.out.println(n1);
        System.out.println(n2);

        for(i=2;i<howmany;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
