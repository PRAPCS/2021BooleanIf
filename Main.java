class Main {
  public static void main(String[] args) {

    boolean b1 = true;
    String letter = "F";
    int grade = 89;

    int num = 15;

    // < less, >greater, <= less or equal, >= greater or equal, == equal, != not
    // equal

    if (num <= 10)
      System.out.println("Your number is less than 10");
    System.out.println("End of Program");

    if (num == 15) {
      System.out.println("number is 15");
      System.out.println("All code between brackets will execute");
    }
    if (grade >= 60)
      letter = "D";
    if (grade >= 70)
      letter = "C";
    if (grade >= 80)
      letter = "B";
    if (grade >= 90)
      letter = "A";

    System.out.println("Your grade is a " + letter);

    if(letter.equals("B")){
       if(grade == 89)
       System.out.println("You are so close to an A extra credit?");

    }

  }
}