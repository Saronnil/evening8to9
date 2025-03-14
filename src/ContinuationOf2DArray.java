import java.util.Arrays;

public class ContinuationOf2DArray {

        public static void main(String[] args){
            int []a1[] = new int[3][3];
            for(int i = 0 ; i < a1.length;i++){
                for (int j = 0 ; j<a1[i].length;j++)
                {
                    a1[i][j] = (i+j)- (i*j) ;
                }
            }
            System.out.println(Arrays.deepToString(a1));

            for (int i = 0 ; i< a1.length;i++)
            { for (int j = 0 ; j<a1[i].length;j++){
                System.out.print(a1[i][j]+" ");
            }
                System.out.println();

            }

        }


}
