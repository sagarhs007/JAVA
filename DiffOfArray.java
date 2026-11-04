import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DiffOfArray {
    List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(set1);
        list1.removeAll(set2);
        list2.addAll(set2);
        list2.removeAll(set1);
        return List.of(list1, list2);
    }
}
