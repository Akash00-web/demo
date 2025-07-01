import java.io.PrintWriter;
import java.util.*;
public class PB280 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
PriorityQueue<Team> teams=new PriorityQueue<>(Comparator.comparing(Team::getWins).reversed());

System.out.println("enter the number of teams");
int n=sc.nextInt();
if(n<2)
{
    System.out.println("not enough teams");
    return;
}
for(int i=1;i<=n;i++)
{
    System.out.println("enter team "+i +" name");
    String teamName=sc.next();
    System.out.println("enter wins");
    int wins=sc.nextInt();
    System.out.println("enter losses");
    int losses=sc.nextInt();
    teams.add(new Team(teamName,wins,losses));
}
        System.out.println("next match will be "+ teams.poll() + "and " + teams.poll());
    }
}

class Team
{
    String name;
    int wins;
    int losses;

    public Team(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", wins=" + wins +
                        ", losses=" + losses ;
    }
    public int getWins() {return wins-losses;}
}
