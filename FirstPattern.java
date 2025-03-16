public class FirstPattern{
    public static void main(String[] args){
        first(3,3);
        second(4,4);
        third(4,5);
        fourth(3,3);
        fivth(3, 3);
        sixth(3,3);
        seventh(3,3);
        eight(3, 3);
        nine(3,3);
        ten(4,4);
        elven(4,4);
        twelve(4,4);
        thirteen(5, 5);
        fourteen(4, 4);
        twentyOne(4, 4);
        twentyTwo(4,4);
        thirty(4, 4);
        thirtyTwo(4, 4);
        thirtyFive(4, 4);
    }

    public static void first(int row, int col){
        /* *
         * **
         * ***
         */
       for(int i = 0;i<row;i++){
        for(int j= 0;j<=i;j++){
            System.out.print("*");
        }
       System.out.println("");
       }
    }
    public static void second(int row, int col){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print("*");
            }
            System.out.println("");
            col = col -1;
        }
    }
    public static void third(int row,int col){
      for(int i = 0;i<row;i++){
        for(int j = 0;j<col;j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void fourth(int row,int col){
        for(int i = 1;i<=row;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void fivth(int row,int col){
        for(int i = 0;i<row;i++){
            for(int j= 0;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();//forward
    }
   // System.out.println(row);
   // System.out.println(col);
    //reverse
    for(int i = 0;i<row;i++){
        for(int j= 0;j<col-1;j++){
            System.out.print("*");
        }
    System.out.println();
    col =col-1;
}
//System.out.print(col);
    }
    public static void sixth(int row,int col){
    for(int i = 1;i<=row;i++){
        //space
        for(int space=0;space<row-i;space++){
            System.out.print(" ");
        }
        //print
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void seventh(int row,int col){
        for(int i = 1;i<=row;i++){
            //space
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
            col=col-1;
        }
    }
    public static void eight(int row,int col){
        for(int i = 1;i<=row;i++){
            //space
            for(int space=0;space<row-i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void nine(int row,int col){
        for(int i = 1;i<=row;i++){
            //space
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<col*2;j++){
                System.out.print("*");
            }
            System.out.println();
            col = col-1;
        }
    }
    public static void ten(int row,int col){
        for(int i = 1;i<=row;i++){
            //space
            for(int space=0;space<row-i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void elven(int row,int col){
        for(int i = 1;i<=row;i++){
            //space
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<=col;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            col = col-1;
        }
    }
    public static void twelve(int row,int col){
        
        elven(row,col);
        ten(row,col);
    }
    public static void thirteen(int row,int col){
        for(int i = 1;i<=row;i++){
            //space
            for(int space=0;space<row-i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<i*2;j++){
                if(i == row){
                    while (j<i*2){
                    System.out.print("*");
                    j=j+1;             
                }
                }
                if(j==1 || j==(i*2)-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fourteen(int row,int col){
        for(int i = row;i>=0;i--){
            //space
            for(int space=0;space<row-i;space++){
                System.out.print(" ");
            }
            //print
            for(int j = 1;j<i*2;j++){
                if(i == row){
                    while (j<i*2){
                    System.out.print("*");
                    j=j+1;             
                }
                }
                if(j==1 || j==(i*2)-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void twentyOne(int row,int col){
      int count = 1;
      for(int i = 0;i<row;i++){
        for(int j=0;j<=i;j++){
            System.out.print(count);
            System.out.print(" ");
            count = count +1;
        }
        System.out.println();
      }
    }
    public static void twentyTwo(int row,int col){
        int num= 1;
       for(int i =0;i<row;i++){
        for(int j=0;j<=i;j++){
           System.out.print(num);
           num = num ^1;
        }
        System.out.println();
       }
    }
    public static void thirty(int row,int col){
      for(int i =1;i<=row;i++){
        for(int space = 0;space<=row-i;space++){
            System.out.print(" ");
        }
        for(int j=i;j>0;j--){
            System.out.print(j);
            System.out.print(" ");
        }
        for(int reverse = 2;reverse<=i;reverse++){
            System.out.print(reverse);
            System.out.print(" ");
        }
           System.out.println();
      }
    }
    public static void thirtyTwo(int row,int col){
           for(int i =0;i<row;i++){
            int num = 65+col;
            for(int j=0;j<=i;j++){
                System.out.print((char)num);
                num = num-1;
                System.out.print(" ");
            }
            System.out.println();
           }
    }
    public static void thirtyFive(int row,int col){
   for(int i = 1;i<=row;i++){
    int count = 1;
    for(int j =1;j<=i;j++){
        System.out.print(j);
    }
    for(int space =0;space<(col*2)-(i*2);space++){
        System.out.print(" ");
    }
    for(int rev = i;rev>0;rev--){
        System.out.print(rev);
    }
    System.out.println();
   }
    }
}