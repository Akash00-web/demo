import java.util.*;
public class PB279 {
    public static void main(String[] args)
    {
 Scanner sc = new Scanner(System.in);
 PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("enter number of elements ");

        int n=sc.nextInt();
        if(n<3)
        {
            System.out.println("minimum 3 elements required");
            return;

        }

        System.out.println("enter elements ");
        for(int i=1;i<=n;i++)
        {
            pq.add(sc.nextInt());
        }
        System.out.println("top 3 elements");
        for(int i=1;i<=3;i++)
        {
            System.out.println(pq.poll());

        }

    }
}
