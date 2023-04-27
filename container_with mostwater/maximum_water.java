public class maximum_water {

    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int max=water_level(arr);
        System.out.println("maximum water is = " + max);
    }

    static int water_level(int[] arr){
        int max_water=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int dis=(j-i);
                int hight=Math.min(arr[i],arr[j]);
                int water=hight*dis;
                if (max_water<water){
                    max_water=water;
                }

            }

        }
        return max_water;

    }
}
