package numberProps;

public class Number {
    private double number;

    public Number(int num) {
        this.number = num;
    }

    boolean isZero() {
        return this.number == 0;
    }

    boolean isPositive() {
        return this.number > 0;
    }

    boolean isNegative() {
        return this.number < 0;
    }

    boolean isOdd() {
        return this.number % 2 != 0;
    }

    boolean isEven() {
        return this.number % 2 == 0;
    }

    boolean isPrime() {
        double num = this.number;
        int i, flag = 0;
        for (i = 0; i < num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
            }
        }
        return flag == 0;
    }

    boolean isArmStrong() {
        double num = this.number;
        double rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        return num == sum;
    }

    double getFactorial() {
        double num = this.number;
        int i, fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    double getSqrt() {
        return Math.sqrt(this.number);
    }

    double sumDigits() {
        double num = this.number, sum = 0;
        int rem;
        while (num > 0) {
            rem = (int) num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    double getReverse() {
        int number = (int) this.number, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Number num = new Number(4);
        System.out.println(num.getFactorial());
        System.out.println(num.getSqrt());
        System.out.println(num.sumDigits());
        System.out.println(num.getReverse());
    }
}
