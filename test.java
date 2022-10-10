public class test{
  public static void main(String[] args){
    int[] lol = {1, 2, 3};
    System.out.println("The original string address is " + lol);
    System.out.println("The cloned string address is" + array1.returnCopy(lol));
    System.out.println("The original string is " + array1.returnCopyStringAgain(lol));
    System.out.println("The cloned string is " + array1.returnCopyString(lol));
    //End of First Testing
    int[] oof = {5, 6, 7, 8, 9};

    System.out.println("The concatenated string of {1,2,3} and {5,6,7,8,9} is:" + array1.returnCopyStringAgain(array1.concatArray(lol,oof)) );
  }
}
