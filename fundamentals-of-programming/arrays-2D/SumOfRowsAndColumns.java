import java.util.*;

public class SumOfRowsAndColumns {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int r= sc.nextInt();
        int c=sc.nextInt();
        // rsum - row sum, csum - column sum, br - big row, bri - big row index, bc - big column, bci - big column index
        int rsum[]=new int[r];
        int csum[]=new int[c];
        int [][]mat=new int [r][c];
        int br=0,bc=0,bri=0,bci=0;
        for(int i=0;i<r;i++){
            rsum[i]=0;
            for(int j=0;j<c;j++){
                csum[j]=0;
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rsum[i]=rsum[i]+mat[i][j];
                csum[i]=csum[i]+mat[j][i];
                if (rsum[i] > br) {
                    bri = i+1;
                    br = rsum[i];
                }
                if (csum[j] > bc) {
                    bci = j+1;
                    bc = csum[j];
                }
            }
        }
        System.out.print("The Sum of rows is");
        for(int i=0 ;i<r;i++){
            System.out.print(" "+rsum[i]);
        }
        System.out.println("\nRow "+bri+" has a maximum sum");
        System.out.print("The Sum of columns is");
        for(int i=0 ;i<r;i++){
            System.out.print(" "+csum[i]); 
        }
        System.out.println("\nColumn "+bci+" has the maximum sum");
        sc.close();
    }
}