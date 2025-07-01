import java.util.*;
public class PB288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Double> stock=new HashMap<>();
        System.out.println("enter the number of stock ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("enter date  "+i);
            String d=sc.next();
            System.out.println("enter stock price ");
            Double p=sc.nextDouble();
            stock.put(d,p);
        }
        double total=0;
        for(double t : stock.values()){
            total+=t;
        }
        double average=(total/n);
        System.out.println("average price of the stock is : "+ average);

}}