package Array;
class maximum{
    void max_of_array(){
        int [] arr = {1,3,2,4,10,6,5,3,4,7,};
        int ans = 0;

        for(int i=0; i<arr.length; i++ ){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
public class maximum_array {
    public static void main(String[] args) {
        maximum obj = new maximum();
        obj.max_of_array();

    }
}
