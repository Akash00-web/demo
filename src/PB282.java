import java.util.*;

public class PB282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> p=new ArrayDeque<>();
        int ch;
        do {

                System.out.println("---playlist---");
                System.out.println("1 . add songs");
                System.out.println("2 . play next song");
                System.out.println("3 . play previus song");
                System.out.println("4 . shuffle  songs ");
                System.out.println("5 . view playist");
                System.out.println("0. exit");
                ch=sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("enter song name to add");
                        String s=sc.next();
                        p.add(s);
                        break;

                    case 2:
                        if(p.isEmpty())
                        {
                            System.out.println("playlist is empty");
                            return;
                        }
                        else {
                            String next=p.remove();
                            p.addLast(next);
                            System.out.println("playing next song :-->  " + next);

                        }
                        break;

                    case 3:
                        if(p.isEmpty())
                        {
                            System.out.println("playlist is empty");
                            return;
                        }
                        String prev=p.removeLast();
                        p.addLast(prev);
                        System.out.println("playing prev  song :-->  " + prev);

                        break;
                    case 4 : if(p.isEmpty())
                    {
                        System.out.println("playlist is empty");
                        return;
                    }
                    ArrayList<String > a=new ArrayList<>(p);
                    Collections.shuffle(a);
                    p.clear();
                    p.addAll(a);
                        System.out.println("playlist shuffled successfully");
                        break;
                        case 5:
                            System.out.println("---- playlist ----");
                            System.out.println(p);
                            break;
                            case 0:
                                System.exit(0);
                                break;
                                default:
                                    System.out.println("invalid choice");
                                    break;
                }
            }while(ch!=0);
        }
    }

