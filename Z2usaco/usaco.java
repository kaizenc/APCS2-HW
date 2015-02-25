public class usaco{
    private int[][] land = new int[3][3];
    private int depth = 0;
    public usaco(int[][] l, int d){
        land = l;
        depth = d;
    }
    public void instruction(int r, int c, int d){
        if (r + 2 > land.length || c + 2 > land[0].length){
            System.out.println("Out of Bounds");
        }
        int biggest = 0;
        for (int q = -1;q < 2;q++){
            for (int p = -1;p < 2;p++){
                if (land[r+q][c+p] > biggest){
                    biggest = land[r+q][c+p];
                }
            }
        }
        int checker = biggest - depth;
        for (int q = -1;q < 2;q++){
            for (int p = -1;p < 2;p++){
                if (land[r+q][c+p] >= checker){
                    land[r+q][c+p] = checker;
                }
            }
        }
    }
 
    public int calculate(){
        int totald = 0;
        for (int i = 0;i < land.length;i++){
            for (int j = 0;j < land[0].length;j++){
                if (land[i][j] < depth){
                    totald += (depth - land[i][j]);
                }
            }
        }
        System.out.println(totald);
        return totald * 72 * 72;
    }
 
}