
class Main {
    public static void main(String[] args) {
      
      char c[][] = new char[3][2];
      c[0][0] = 'D';
      c[0][1] = 'A';
      c[1][0] = 'R';
      c[1][1] = 'S';
      c[2][0] = 'H';
      c[2][1] = 'U';
      
      for (int i = 0;i<c.length;i++){
          for (int j=0;j<c[i].length;j++){
              System.out.print(c[i][j]+" ");
          }
          System.out.println();
      }
      
    }}
     
