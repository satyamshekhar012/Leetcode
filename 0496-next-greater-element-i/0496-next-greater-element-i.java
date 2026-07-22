class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

    
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

     
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        
        int i = 0;
        while (i < nums1.length) {
            nums1[i] = map.get(nums1[i]);
            i++;
        }

        return nums1;
    }
}