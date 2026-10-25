import java.util.ArrayList;
import java.util.List;

public class find_the_union_part2 {

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        // Calling method directly
        int[] result = findUnion(nums1, nums2);

        // Printing result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] findUnion(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                if (result.isEmpty() ||
                        result.get(result.size() - 1) != nums1[i]) {

                    result.add(nums1[i]);
                }

                i++;
            }

            else if (nums1[i] > nums2[j]) {

                if (result.isEmpty() ||
                        result.get(result.size() - 1) != nums2[j]) {

                    result.add(nums2[j]);
                }

                j++;
            }

            else {

                if (result.isEmpty() ||
                        result.get(result.size() - 1) != nums1[i]) {

                    result.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        // Remaining elements of nums1
        while (i < nums1.length) {

            if (result.isEmpty() ||
                    result.get(result.size() - 1) != nums1[i]) {

                result.add(nums1[i]);
            }

            i++;
        }

        // Remaining elements of nums2
        while (j < nums2.length) {

            if (result.isEmpty() ||
                    result.get(result.size() - 1) != nums2[j]) {

                result.add(nums2[j]);
            }

            j++;
        }

        // ArrayList -> Array
        int[] answer = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            answer[k] = result.get(k);
        }

        return answer;
    }
}
