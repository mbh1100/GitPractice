package app;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("Woah there Java");
      help();
      shameOnYou();
    }

    public void shameOnYou() {
        System.out.println("Shame x3");

    }

    public void uselessFunction1(void what) {
      return;
    }

    public void help() {
      System.out.println("This is a help message.\n");
      for (int i = 0; i < 22; i++) {
        System.out.println("Help " + i + " message.\n");
      }
    }
}
