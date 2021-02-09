import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randNum = r.nextInt(51) + 1;
    System.out.println("The random number is: " + randNum);

    System.out.println("Counting down!");
      if(randNum >= 0)
        for (int i = randNum; i >= 0; i--)
        System.out.println(i);

    if(randNum <= 5)
      System.out.println("Ahoy Mateys!");
    else if(randNum > 25 && randNum < 42)
      System.out.println("Cannonball!");
    else
      System.out.println("Blast Off!");
  }
}