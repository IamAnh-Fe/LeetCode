package _278_First_Bad_Version;

public class Solution  {
  public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l < r){
          int m = l + (r - l) / 2;
          if(is(m)){
            return m;
          } else  {
            r = r - 1;
          }
        }
        return l;
  }
  public static void main(String[] args) {
    
  }
}
