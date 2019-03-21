
public class ArrayMistakes
{
    public static void main(String args[])
    {
        int numsArray[] = new int[] {0 , 6, 9, 14, 19, };


        System.out.print("\nForward");
        for (int i = 1; i < numsArray.length; i++) {
            System.out.print(": " + numsArray[i]);
        }

        System.out.print("\nBackward" );
        for (int i = 0; i < numsArray.length; i++) {
            int temp = numsArray[i];
            numsArray[i] = numsArray[numsArray.length - 1 -i];
            numsArray[numsArray.length - 1 - i] = temp;
            System.out.print( ": " + numsArray[i]);
        }

    }
}
