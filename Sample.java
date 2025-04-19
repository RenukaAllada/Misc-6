class Sample{
    /********************PROBLEM-1****************/
// TC:0(NlogN)
        //SC:0(1)
    public class Main {
        public static void main(String[] args) {
            int[] nums={2,1,5};
            System.out.println(findThreshold(nums,6));
            System.out.println(findThreshold(nums,2));
            System.out.println(findThreshold(nums,4));
            System.out.println(findThreshold(nums,1));
        }

        private static float findThreshold(int[] nums, int desiredSum){
            Arrays.sort(nums);
            float n=nums.length;
            float threshold=desiredSum/n;

            for(int i=0;i<n;i++){
                if(nums[i]<threshold){
                    threshold+=((threshold-nums[i])/(n-1-i));
                }
            }
            return threshold;
        }
    }
    /********************PROBLEM-2****************/

}