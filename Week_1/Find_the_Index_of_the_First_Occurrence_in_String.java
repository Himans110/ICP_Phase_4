import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(strStr(s1, s2));
  }
  public int strStr(String s1, String s2) {
        return s1.indexOf(s2);
  }
}
//TC -> O(N X M)
