

public class twoDimentionalArray {

public static void main(String[] args)
{
    int A[][]={{1,2,3},{4,5,6},{7,8,9}};
    int B[][]={{100,101,102},{103,104,105},{106,107,108}};
    int C[][]= new int[3][3];

    for(int x=0;x<A.length;x++)
    {
        for(int y=0;y<A[0].length;y++)
        {
         C[x][y]=A[x][y]+B[x][y];
            System.out.println(C[x][y]);
        }

    }

}




}
