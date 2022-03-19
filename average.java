package Lab;
public class average {
    public static double averageOfN(int n) {

        double sum = 0;


        double [] balances = new double[]{45.23, 46.85, 50.47};

        for(double balance: balances)
        sum += balance;




        double average = sum/3;

        return average;

    }
    
}
