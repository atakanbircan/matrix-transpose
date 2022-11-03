import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int row,column;
        Scanner input=new Scanner(System.in);
        System.out.println("iki boyutlu matrisde satır sayısını giriniz : ");
        row=input.nextInt();
        System.out.println("iki boyutlu matrisin sütun sayısını giriniz : ");
        column=input.nextInt();
        int[][]list=new int[row][column];
        for (int a=0;a<list.length;a++){
            for (int b=0;b<list[a].length;b++){
                System.out.println(a+". satırdaki, "+b+".sütundaki elmanı girin : ");
                list[a][b]=input.nextInt();
            }
        }
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list[i].length;j++){
                //System.out.println(i+". satırdaki, "+j+".sütundaki elman : "+list[i][j]);
                System.out.print(list[i][j]+"  ");
            }
            System.out.println();

        }
        System.out.println("********");
        int[][]transpoz=new int[column][row];
        for (int c=0;c<column;c++){
            for (int d=0;d<row;d++){
               // transpoz[d][c]=list[c][d];
                System.out.print(list[d][c]+"  ");
            }
            System.out.println();
        }

    }
}