class ArrayExample{

    //Linear Search algo
    void searchElement(){
        int[] arr = {2,5,9,3,77,8,1,6,8};
        int required_element = 8;
        int ans = -1;

        for(int i = 0 ; i < arr.length ; i++){
                 if (arr[i]==required_element) {
                    ans = i;
                    break;
                 }
        }
        if (ans==-1) {
            System.out.println("Not Found");
        }else{System.out.println(ans);}
      
    }
}
public class searchElement {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.searchElement();
    }
}
