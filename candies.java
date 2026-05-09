import java.util.Scanner;

class CandyJar {
    public static void main(String[] args) {

        int N = 10; 
        int K = 5;  
        int candies = N; 
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of candies to buy: ");
        int order = sc.nextInt();
        if (order > candies || order <= 0) {
            System.out.println("INVALID INPUT");
        } 
        else {
            candies = candies - order;
          System.out.println("Number of Candies Sold: " + order);
            if (candies <= K) {
                candies = N;
            }
            System.out.println("Number of Candies available: " + candies);
        }
        sc.close();
    }
}
