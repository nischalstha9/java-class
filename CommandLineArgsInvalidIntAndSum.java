public class CommandLineArgsInvalidIntAndSum {
    public static void main(String[] args) {
        int invalidInt = 0, sum = 0, parNum;
        for (int i = 0; i < args.length; i++) {
            try {
                parNum = Integer.parseInt(args[i]);
                sum += parNum;
            } catch (Exception e) {
                invalidInt++;
            }
        }
        System.out.println("The sum is " + sum + " and the no of invalid integer is " + invalidInt);
    }
}
