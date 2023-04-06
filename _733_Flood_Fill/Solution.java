package _733_Flood_Fill;

import java.util.Arrays;

class Solution {
  public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      int color = image[sr][sc];
      dfs(image, sr, sc, color, newColor);
      return image;
  }
  public static void dfs(int[][] image, int sr, int sc, int color, int newColor) {
     if(sr < 0|| sc < 0 || sr >= image.length || sc >= image[0].length || color == newColor || image[sr][sc] != color){
         return;
     }
     image[sr][sc] = newColor;
     dfs( image,  sr + 1,  sc,  color,  newColor) ;
     dfs( image,  sr - 1,  sc,  color,  newColor) ;
     dfs( image,  sr,  sc + 1,  color,  newColor) ;
     dfs( image,  sr,  sc - 1,  color,  newColor) ;

  }
  public static void main(String[] args) {
   int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
   int sr = 1; 
   int sc = 1;
   int color = 2;
   System.out.println(Arrays.toString(floodFill(image, sr, sc, color)));
}
}
