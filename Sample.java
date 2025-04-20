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

    class Solution {
        public int[][] multiply(int[][] mat1, int[][] mat2) {
            if(mat1==null || mat2==null ||mat1.length==0 ||mat2.length==0){
                return new int[][]{};
            }

            int m=mat1.length;
            int n=mat1[0].length;
            int p=mat2[0].length;

            int[][] result=new int[m][p];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat1[i][j]==0){
                        continue;
                    }
                    for(int k=0;k<p;k++){
                        if(mat2[j][k]==0){
                            continue;
                        }
                        result[i][k]+=mat1[i][j] * mat2[j][k];
                    }
                }
            }

            return result;
        }
    }
}