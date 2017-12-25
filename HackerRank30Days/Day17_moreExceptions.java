 class Calculator {


     int power(int n, int p) throws Negative {
        if (n >= 0 && p >= 0) {
            return(int)Math.pow(n,p);
        }
        throw new Negative();
    }
}


class Negative extends Exception {

    public String getMessage(){
        return "n and p should be non-negative";
    }

}

class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
