import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the Array-List : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("The Array-List is : " + arr);
        System.out.println("Size of the Array-List : " + arr.size());
        System.out.println("Adding 100 at index 1...");
        arr.add(1, 100);
        System.out.println("The Array-List is : " + arr);
        System.out.println("Size of the Array-List : " + arr.size());
        System.out.println("Enter the index from which element is to be removed : ");
        int in = sc.nextInt();
        arr.remove(in);
        System.out.println("The Array-List is : " + arr);
        System.out.println("Size of the Array-List : " + arr.size());
        Collections.sort(arr);
        System.out.println("The sorted Array-List is : " + arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("The reversed Array-List is : " + arr);
    }

}
