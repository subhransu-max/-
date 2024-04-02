public class pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            if(i== (n-1)){
                for (int j=0;j< 2*n-1;j++){
                    System.out.print("*");
                }
            }
            else {
                for (int space = 0; space < n - i - 1; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < 1; star++) {
                    System.out.print("*");
                }
                for (int space2 = 0; space2 < 2 * i - 1; space2++) {
                    System.out.print(" ");
                }
                if(i != 0){
                for (int star = 0; star < 1; star++) {
                    System.out.print("*");
                }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
