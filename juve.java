import java.util.Scanner;

class juveclass
{
  public static void main(String args[])
  {
    float ratio;
    float games,goals;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Goal ratio : ");
    ratio = sc.nextFloat();
    System.out.println("Enter Goals to score : ");
    goals = sc.nextFloat();
    games=goals/ratio;
    System.out.printf("Number of Games need to Reach %f%n Goals is : %f%n",goals,games);

  }
}