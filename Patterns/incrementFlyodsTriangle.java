// Most frequently asked ZOHO question
package Patterns;
public class incrementFlyodsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++) {
            int temp = i;
            for(int j=1;j<=i;j++) {
                System.out.print(temp+" ");
                temp += n-j; 
            }
            System.out.println();
        }
    }
}
