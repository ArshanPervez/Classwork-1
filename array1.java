public class array1{
  public static int[] returnCopy(int[]ary){
    int len = ary.length;
    int[] aryTwo = new int[len];
    for (int i = 0; i < len; i++){
      int x = ary[i];
      aryTwo[i] = x;
    }
    return aryTwo;
  }
  public static String returnCopyString(int[] a){
    String oof = "";
    a = returnCopy(a);
    for (int i = 0; i < a.length; i++){
      oof+=a[i];
    }
    return oof;
  }
  public static String returnCopyStringAgain(int[] a){
    String oof = "";
    for (int i = 0; i < a.length; i++){
      oof+=a[i];
    }
    return oof;
  }
}
