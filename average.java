package Lab;
public class average {
    public static double averageOfN(int n) {

        int sum = 0;

        for(int i = 0; i< n; i++){
            
            sum = sum + i;
        }

        double average = sum/n;

        return average;

    }
    
}
