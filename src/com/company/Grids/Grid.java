package com.company.Grids;

public class Grid {
protected int Array[][] = new int[10][10];
  public Grid(){

   for (int x = 0;x<Array.length;x++){
       for (int y = 0;y<Array[x].length;y++){
     Array[x][y] = 0;
    }
   }
  }
  public Grid(int i){

        for (int x = 0;x<Array.length;x++){
            for (int y = 0;y<Array[x].length;y++){
                Array[x][y] = i;
            }
        }
    }
  public Grid(String a){

      if (a.equals("ascending")){
          int num = 1;
          for (int x = 0; x < Array.length; x++) {
              for (int y = 0; y < Array[x].length; y++) {
                  Array[x][y] = num;
                  num++;
              }
          }

      }else if(a.equals("descending")){
          int num = 100;
          for (int x = 0; x < Array.length; x++) {
              for (int y = 0; y < Array[x].length; y++) {
                  Array[x][y] = num;
                  num--;
              }
          }

      }


      }

  public void Display(){

   for (int x = 0;x<Array.length;x++){
    for (int y = 0;y<Array[x].length;y++){
     System.out.print(Array[x][y] +", ");
    }
    System.out.println();
   }

  }

  public void setXY(int x,int y,int num){
      Array[x][y] = num;
  }

  public int get(int x,int y) {

        return Array[x][y];
    }

}
