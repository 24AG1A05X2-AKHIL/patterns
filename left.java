public class left{
  public static void main (String[] args){
  int n = 5;

  for(int i = n; i <= 1; i--){
    for(int j = 1; j <= i; j++){
      for(j = 1; j <= n-i; j++){
      System.out.print("*");
    }
    }
    System.out.println();
  }
}
}