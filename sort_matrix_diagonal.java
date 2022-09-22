import java.util.*;

public class sort_matrix_diagonal {
    public int[][] diagonalSort(int[][] mat) {
        int rows=mat.length, col=mat[0].length;
        List<Integer> diagonal;
        for(int r=0;r<rows;r++){
            int i=r;
            int j=0;
            diagonal = new ArrayList<>();
            while(i<rows&&j<col) diagonal.add(mat[i++][j++]);
            Collections.sort(diagonal);
            i=r;
            j=0;
            int k=0;
            while(i<rows&&j<col) mat[i++][j++]= diagonal.get(k++);
        }
         for(int c=0;c<col;c++){
            int i=0;
            int j=c;
            diagonal = new ArrayList<>();
            while(i<rows&&j<col) diagonal.add(mat[i++][j++]);
            Collections.sort(diagonal);
            i=0;
            j=c;
            int k=0;
            while(i<rows&&j<col) mat[i++][j++]= diagonal.get(k++);
       
}
        return mat;
    }
    public static void main(String[] args){
        int[][] mat= {{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}};
        sort_matrix_diagonal obj= new sort_matrix_diagonal();
        int[][] mat1= obj.diagonalSort(mat);
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat[i].length;j++){

                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();

        }
    }    
}
