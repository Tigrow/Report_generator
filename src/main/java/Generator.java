public class Generator {
  private static final int ARGS_COUNT = 3;

  public static void main(String[] args) {
    if (args.length != ARGS_COUNT) {
      System.out.println("you have bad parameters");
    }
  }
}
