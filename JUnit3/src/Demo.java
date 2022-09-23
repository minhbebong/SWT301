/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Demo {

    public boolean isPrimeNumber(int input) {
        if (input < 2) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean ktraSoHH(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) //tổng các ước số của a
            {
                sum += i;
            }
        }
        if (sum == a) {
            return true;
        }
        return false;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public boolean min(int a, int b) {
        if (a <= b) {
            return true;
        } else {
            return false;
        }
    }
}
