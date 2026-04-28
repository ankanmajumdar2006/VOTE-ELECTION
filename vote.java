import java.util.Scanner;
public class vote {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = 0, b = 0, c = 0, d = 0, e = 0, v = 0;
    System.out.println("Total 5 party. AREA: NETAJI COLONY.");
    System.out.println("TOTAL PEOPLE: 10. ALL PARTY WITH CODE:");
    System.out.println("11 FOR ~AM");
    System.out.println("21 FOR +RT");
    System.out.println("31 FOR #LK");
    System.out.println("41 FOR $EP");
    System.out.println("51 FOR @FW");
    // now vote system.
    System.out.println("GIVE VOTES CAREFULLY-->");
    for (int i = 1; i <= 10; i++) {
      System.out.print("ENTER DIGIT SIR/MA'AM: ");
      int x = in.nextInt();
      switch (x) {
      case 11:
        a++;
        break;
      case 21:
        b++;
        break;
      case 31:
        c++;
        break;
      case 41:
        d++;
        break;
      case 51:
        e++;
        break;
      default:
        System.out.print("ERROR");
        v = 1;
      }
      if (v == 1) {
        break;
      }
    }
    System.out.println("TOTAL VOTE OF ~AM:" + a);
    System.out.println("TOTAL VOTE OF +RT:" + b);
    System.out.println("TOTAL VOTE OF #LK:" + c);
    System.out.println("TOTAL VOTE OF $EP:" + d);
    System.out.println("TOTAL VOTE OF @FW:" + e);
  }
}