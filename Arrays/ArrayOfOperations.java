//#2011st -- Final Value of Variable After Performing Operations
public class ArrayOfOperations {

    public static int finalValueAfterOperations(String []operations) {
        int x = 0;

        // for(int i=0;i<operations.length;i++) {  
        //     switch(operations[i].toLowerCase()) {
        //         case "--x","x--" -> --x;
        //         case "++x","x++" -> ++x;
        //     }
        // }

        //OPTIMIZED SOLUTION -- ARTISTIC APPROACH
        for(String o : operations) x  += (44 - o.charAt(1));
        return x;
    }
    public static void main(String[] args) {
        String []arr = {"++X","++X","X++"};
        int ans = finalValueAfterOperations(arr);
        System.out.println(ans);
    }
}
