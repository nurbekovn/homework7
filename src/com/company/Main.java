package com.company;
//Массив тузуп аны толтурунуз.
//        Жуп сан болгон элементтерин консольго чыгарыныз.
//        Массивдин элементтери:
//        1 2 3 4 5 6 7 8 9 10
//        Жооп:
//        2 4 6 8 10
public class Main {

    public static void main(String[] args) {
	// write your code here
       int[]arays=new int[10];
        System.out.println("jup sandar:");
        for (int i = 1; i <= arays.length; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }



    }
}
