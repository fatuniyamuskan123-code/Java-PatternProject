import javax.swing.*;
import java.util.*;
class project1 {

    void SquarePattern() {
        System.out.println("---------- Square Pattern ---------\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    void hologram() {
        System.out.println("---------- HOLOGRAM PATTERN ---------\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i == 0 || j == 0 || i == 4 || j == 4) ? "x " : "  ");
            }
            System.out.println();
        }
    }

    void reversepattern() {
        System.out.println("---------- REVERSE NUMBER PATTERN ---------\n");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int x = i - 1;
            for (int j = 1; j <= n; j++) {
                System.out.print((j <= (n - i + 1)) ? (++x) + "  " : (--x) + "  ");
            }
            System.out.println();
        }
    }

    void numberpattern() {
        System.out.println("---------- NUMBER PATTERN ---------\n");
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }

    void butterflypattern() {
        System.out.println("---------- BUTTERFLY PATTERN ---------\n");
        int n = 5;
        for (int i = 1; i <= n + n - 1; i++) {
            for (int j = 1; j <= n + n - 1; j++) {
                if (i <= n) {
                    System.out.print((j <= i || j >= (n + n - i)) ? "x  " : "   ");
                } else {
                    System.out.print((j <= (n - (i - n)) || j >= (n + (i - n))) ? "x  " : "   ");
                }
            }
            System.out.println();
        }
    }

    void halfpyramid() {
        System.out.println("---------- HALF PYRAMID PATTERN ---------\n");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    void rhombus() {
        System.out.println("---------- RHOMBUS PATTERN ---------\n");
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void hollowpyramid() {
        System.out.println("---------- HOLLOW PYRAMID PATTERN ---------\n");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void swastik()
    {
        System.out.println("---------- SWASTIK PATTERN ---------\n");
        int i,j;
        for(i = 1 ; i <= 7 ; i++)
        {
            for (j = 1 ; j <= 7 ; j++)
            {
                System.out.print(((i == 1 && j >= 4) || (j == 1 && i <= 4) || (i == 7 && j <= 4)|| (j == 7 && i >= 4) || (j == 4 && i >= 1) || (i == 4 && j >= 1))?"x ":"  ");
            }
            System.out.println();
        }
    }
    void heart()
    {
        System.out.println("---------- HEART PATTERN ---------\n");
        int i,j;
        for(i=0;i<6;i++) {
            for(j=0 ; j<7; j++){
                if(j%3!=0 && i==0 ||  j%3==0 && i==1 || i-j==2 || i+j==8){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    void arrow()
    {
        System.out.println("---------- ARRow PATTERN ---------\n");
        int i,j,N=6;
        for(i=1; i<=N; i++){
            for(j=1; j<=N; j++){
                if( j==1 || i==N || i==j || i+j==N+1 && j>N/2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    void righttriangle()
    {
         System.out.println("---------- RIGHT TRIANGLE PATTERN ---------\n");
        int i,j,k;
        for (i = 1,k = 4 ; i <= 5 ; i++,k--){
            for(j = 1 ; j <= 5 ; j++)
            {
                System.out.print((j <= k)?"  ":"x ");
            }
            System.out.println();
        }
    }
    void lefttriangle()
    {
        System.out.println("---------- LEFT TRIANGLE PATTERN ---------\n");
        int i,j;
        for(i = 1 ; i <= 5 ; i++)
        {
            for (j = 1 ; j <= i ; j++)
            {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    void inverseright()
    {
        System.out.println("---------- INVERSE RIGHT TRIANGLE PATTERN ---------\n");
        int i,j,k;
        for (i = 1,k = 0 ; i <= 5 ; i++,k++){
            for(j = 1 ; j <= 5 ; j++)
            {
                System.out.print((j <= k)?"  ":"x ");
            }
            System.out.println();
        }
    }
    void inverseleft()
    {
        System.out.println("---------- INVERSE LEFT TRIANGLE PATTERN ---------\n");
        int i,j;
        for(i = 1 ; i <= 5 ; i++)
        {
            for (j = i ; j <= 5 ; j++)
            {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    void fancyhourglass()
    {
        System.out.println("---------- FANCY HOUR GLASS PATTERN ---------\n");
        int i,j,k,p;
        for (i = 0 , k = 9 , p = 1 ; i < 9 ; i++ , k-- , p++)
        {
            for (j = 1 ; j <= 9 ; j++)
            {
                System.out.print((i <= 3)?(j <= k)?(j<=i)?"  ":"x ":"  ":(j <=(k-1))?"  ":(j<=p)?"x ":"  " );
            }
            System.out.println();
        }
    }
    static void MainModule()
    {
        System.out.println(" ----------- Pattern Generator ----------- ");
        System.out.println("1. Square Pattern\t\t\t2. HoloGram Pattern");
        System.out.println("3.Reverse Number \t\t\t4.Number Pattern");
        System.out.println("5.ButterFly Pattern \t\t\t6.Half Pyramid Pattern");
        System.out.println("7.Rhombus Pattern \t\t\t8.Hollow Pyramid Pattern");
        System.out.println("9.Swastik Pattern \t\t\t10.Heart Pattern"); 
        System.out.println("11.Arrow Pattern \t\t\t12.Right Triangle Pattern");
        System.out.println("13.Left Triangle Pattern \t\t14. Inverse Right Triangle Pattern");  
        System.out.println("15.Inverse Left Triangle Pattern \t16.Fancy HoverGlass Pattern");  
        String c;
        System.out.println("Choose any one of them....");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        project1 p = new project1();
        if (c.equals("1")){
            p.SquarePattern();
        }
        else if (c.equals("2")){
            p.hologram();
        }
        else if (c.equals("3")){
            p.reversepattern();
        }
        else if (c.equals("4")){
            p.numberpattern();
        }
        else if (c.equals("5")){
            p.butterflypattern();
        }
        else if (c.equals("6")){
            p.halfpyramid();
        }
        else if (c.equals("7")){
            p.rhombus();
        }
        else if (c.equals("8")){
            p.hollowpyramid();
        }
        else if (c.equals("9")){
            p.swastik();
        }
        else if (c.equals("10")){
            p.heart();     
        }
        else if (c.equals("11")){
            p.arrow();  
        }
        else if (c.equals("12")){
            p.righttriangle();  
        }
        else if (c.equals("13")){
            p.lefttriangle();    
        }
        else if (c.equals("14")){
            p.inverseright();   
        }
        else if (c.equals("15")){
            p.inverseleft();   
        }
        else if (c.equals("16")){
            p.fancyhourglass(); 
        }
        System.out.println("\nDo you want to continue.. Press 1 else any key");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        if (c.equals("1")){
            MainModule();
        }
    }
    public static void main(String args[]){
        MainModule();
    }
}

