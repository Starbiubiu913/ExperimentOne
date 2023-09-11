public class Sum {
    public static void main(String[] args) {
        int[] a={1, -2, 3, 10, -4, 7, 2, -5};
        int max=findMaxSum(a);
        System.out.println(max);
    }

    public static int findMaxSum(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        int sum = 0;
        int len = arr.length;
        if (len <= 0) {
          return  0;
        }
        for (int i = 0; i<len; i++){
            if(sum<=0){
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
            if(sum>max){
                max=sum;
            }
        }

        return max;
    }
}

