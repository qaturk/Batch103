package day16multidimensionalarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {


        //bir mul dim ar deki enbuyuk ve enkucuk elemanin top veren
        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int maxelement = arr[0][0];
        int minelement =arr[0][0];
        for (int[]w:arr){
            for (int k:w){
                maxelement=Math.max(maxelement,k);
                minelement=Math.min(minelement,k);
            }
        }
        System.out.println(maxelement+minelement);

    }
}