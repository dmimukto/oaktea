// Gambler's ruin simulation
public class Gambler
{
  public static void main(String[] args)
  { //runs trial experiments that start with $stake and terminate on $0 or $goal.
    int stake = Integer.parseInt(args[0]);
    int goal = Integer.parseInt(args[1]);
    int trials = Integer.parseInt(args[2]);
    int bets = 0;
    int wins = 0;
    for (int t = 0; t < trials; t++)
    {//running one experiment.
     int cash = stake;
     while (cash > 0 && cash < goal)
     { //simulating bets
      bets++;
      if (Math.random() < 0.5) cash++;
      else                     cash--;
    } //cash is either 0 (ruin) or $goal(win)
    if (cash==goal) wins++;
  }
    System.out.println("\nGambling Simulator");
    System.out.println(100*wins/trials + "% wins");
    System.out.println("Avg # bets: "+ bets/trials);
  }
}
