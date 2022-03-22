public class Task1
{
    public static void main(String[] args)  {
        int[] intArray = new int[10];

        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]=intArray.length-1-i;
        }

        System.out.println("The value of the array.");

        for(int i=0;i<intArray.length;i++)
        {
            System.out.println("Array["+i+"]="+intArray[i]);
        }
    }
}
