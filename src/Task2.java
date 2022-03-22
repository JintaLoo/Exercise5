import java.lang.Math;
public class Task2
{
    public static void main(String[] args)
    {
        int max=0,min=0;
        int[] intArray = new int[10];

        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]= (int) (Math.random()*100);
            System.out.print(intArray[i]+" ");
            if(max<intArray[i])
            {max=intArray[i];}
            if(min==0)
            {min=intArray[i];}
            if (intArray[i]<min)
            {min = intArray[i];}
        }
        System.out.println("");
        System.out.println("Maximum Number = "+max);
        System.out.println("Minimum Number = "+min);
    }
}


