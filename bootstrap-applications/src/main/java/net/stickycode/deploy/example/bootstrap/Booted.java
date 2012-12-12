package net.stickycode.deploy.example.bootstrap;

public class Booted {

  public static void main(String[] args)
      throws InterruptedException {

    for (int i = 0; i < args.length; i++)
      processArgument(args, i);

    System.out.println("Booted!");
  }

  private static void processArgument(String[] args, int i)
      throws InterruptedException {

    try {
      bootingSequence(i, Integer.parseInt(args[i]));
    }
    catch (NumberFormatException e) {
      bootingCharacterSequence(args, i);
    }
  }

  private static void bootingSequence(int i, int limit)
      throws InterruptedException {

    System.out.print("Running booting sequence " + i + ": ");
    for (int j = 1; j <= limit; j++) {
      System.out.print(j + " ");
      Thread.sleep(i * 1000);
    }
    System.out.println("OK");
  }

  private static void bootingCharacterSequence(String[] args, int i)
      throws InterruptedException {

    System.out.print("Running booting sequence " + i + ": ");
    for (int j = 0; j < args[i].length(); j++) {
      System.out.print(args[i].charAt(j) + " ");
      Thread.sleep(i * 1000);
    }
    System.out.println("OK");
  }
}
