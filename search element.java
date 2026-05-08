class SearchElement {
    public static void main(String args[]) {

        int a[] = {10, 20, 30, 40, 50};

        int search = 30;

        for(int i = 0; i < a.length; i++) {

            if(a[i] == search) {
                System.out.println("Element found");
            }
        }
    }
}
