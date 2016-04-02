package com.company;

import java.util.Arrays;
import static com.company.massive.*;

public class Main {

    public static void main(String[] args) {
	/*int sum=0;
        int nums[][]=new int[3][5];// поезд, 3 вагона 5 мест(3 массива 5 элиментов)


        for (int i=0; i<3; i++)  //идем в певый вагон, дальше по местам от 0 до 5
        for  (int j=0; j<5; j++)
        nums [i][j]=(i+1)*(j+1);


        for (int x[]:nums){
            int sum1=0;
            for(int y:x){
                System.out.println("Value is: " +y);//пробегаем по каждому из вагонов
                sum+=y;
                sum1+=y;
                System.out.println("Сумма строк: "+sum1);
            }
        }
        System.out.println("Summaration: " + sum);




        for (int i=0; i<10; i++){
            if (i%2==0) continue;    //он забивает на целые и продолжает выполянть следующую итерацию
            System.out.print(i+"");
        }




        int i=0;

        while(i<100){
            if(i==10) break; //terminate loop if i is 10
            System.out.println("i: " +i);
            i++;
            System.out.println("Loop complete");
        }




        String s1="Hi";
        String s2="Hi";

        System.out.println("сравнение ссылок"+(s1==s2));
        s1+='2';
        s2=new String(s1);
        System.out.println("сравнение ссылок"+(s1==s2));
        System.out.println("сравнение ссылок"+s1.equals(s2));


        String strInt="123"; String strDouble="123.456";
        int x; double y;
        x=Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x="+x);
        System.out.println("y="+y);
        strInt=String.valueOf(x+1);
        strDouble=String.valueOf(y+1);
        System.out.println("strInt="+strInt);
        System.out.println("strDouble"+strDouble);
        String str;
        str="num="+345;
        System.out.println(str);


        System.out.println(Integer.MAX_VALUE+100);



        System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(262));
        System.out.println(Integer.toOctalString(262));




        int[] array1D={0,1,2,3};
        int[][] array2D={{0,1},{2,3}};

        System.out.println(array1D);
        System.out.println(Arrays.toString(array1D));

        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));*/


        /*int[]arr;

        arr=new int[]{};
        System.out.println(Arrays.toString(arr)+"->");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr=new int[]{1,6,107,45};
        System.out.println(Arrays.toString(arr)+"->");
        sort(arr);
        System.out.println(Arrays.toString(arr));*/


        int twoD[][]=new int[4][];
        twoD[0]=new int [1];
        twoD[1]=new int[2];
        twoD[1]=new int[3];
        twoD[1]=new int[4];

        int i,j,k=0;

        for(i=0; i<4; i++)
            for(j=0; j<4; j++){
                twoD[i][j]=k;
                k++;
            }


        for(i=0; i<4; i++){
            for(j=0; j<4; j++)
                System.out.print(twoD[i][j]+" ");
            System.out.println();

        }


    }
}
