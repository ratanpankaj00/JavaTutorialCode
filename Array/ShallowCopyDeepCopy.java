import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40}; // 16 byte memory Allocation.
        // How to deep copy this arr 
        int [] deep = Arrays.copyOf(arr, 2);
        deep[0] = 100;
        System.out.println(deep[2]);
        System.out.println(arr[0]);

    }
}
