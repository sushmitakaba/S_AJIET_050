class LowestArray {
    public static void main(String args[]) {

        int a[] = {10, 20, 5, 40, 50};

        int min = a[0];

        for(int i = 1; i < a.length; i++) {

            if(a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Lowest number = " + min);
    }
}
