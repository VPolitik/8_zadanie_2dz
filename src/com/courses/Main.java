package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	double a;
        System.out.println("Введите трёхзначное число");
        a = in.nextInt();
        if( a>999 | a<100){
            System.out.println("Вы ввели не трёхзачное число! Вы допустили ошибку! Запустите заново и попробуйте ещё раз!");
        }
        else {
            double kvadrat, sum, kub1, kub2, kub3;
            kvadrat = Math.pow(a, 2);
            kub1 = (a/100) % 10;
            kub1 = Math.pow(kub1, 3);
            kub2 = (a/10)%10;
            kub2 = Math.pow(kub2, 3);
            kub3 = a % 10;
            kub3 = Math.pow(kub3, 3);
            sum = kub1 + kub2 + kub3;
            if ( kvadrat == sum){
                System.out.println("Квадрат этого числа равен сумме кубов его цифр! " + kvadrat +" = "+ sum);
            }
            else if ( kvadrat > sum) {
                System.out.println("Квадрат этого числа больше суммы кубов его цифр! " + kvadrat + " > " + sum);
            }
                else{
                    System.out.println("Квадрат этого числа меньше суммы кубов его цифр! " + kvadrat +" < "+ sum);
                }
            }
        }
    }

