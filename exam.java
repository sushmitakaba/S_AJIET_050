import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        String[] arr = br.readLine().trim().split(" ");

        int prev = -1;
        int cuts = 0;

        for (int i = 0; i < n; i++) {
            int rank = Integer.parseInt(arr[i]);

            if (i > 0 && rank < prev) {
                cuts++;
            }

            prev = rank;
        }

        System.out.println(cuts);
    }
}

