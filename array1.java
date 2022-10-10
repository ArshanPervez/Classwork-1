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

  //End of First Testing

  public static int[] concatArray(int[]ary1,int[]ary2){
    int lol = ary1.length;
    int len = ary1.length + ary2.length;
    int[] ary3 = new int[len];
    for (int x = 0; x < ary1.length; x++){
        ary3[x] = ary1[x];
      }
    for (int y = 0; y < ary2.length; y++){
      ary3[lol + y] = ary2[y];
    }
    return ary3;
  }

}
