import java.util.*;
public class PB281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> customers=new ArrayDeque<>();
        int ch;
        do{
            System.out.println(" Menu at shop");
            System.out.println("1. add customer at back ");
            System.out.println("2. serve next customer");
            System.out.println("3. view queue of customers ");
            System.out.println("0. exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter customer name");
                    String customerName=sc.next();
                    customers.add(customerName);
                    break;

                    case 2:if(customers.isEmpty())
                    {
                        System.out.println("no customers in queue");

                    }
                    else{
                        System.out.println("serving for customer "+ customers.poll());

                    }
                    break;

                    case 3:
                        System.out.println("viewing queue of customers");
                        if(customers.isEmpty())
                        {
                            System.out.println("no customers in queue");
                        }
                        else{
                            System.out.println("pending orders  for customer "+ customers);
                        }
                        break;
                        case 0:
                            System.exit(0);
                            break;
                            default:
                                System.out.println("invalid choice");
                                break;
            }

        }
        while(ch!=0);
    }
}
