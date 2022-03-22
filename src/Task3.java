public class Task3
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[10][10];
        int sum=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==j)
                {
                    sum+=i;
                    matrix[i][j] = j;
                }
                else
                {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println("the sum of the elements on the diagonal = "+sum);
    }
}
