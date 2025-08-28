import java.util.*;
public class problem1 {

    
    public static void main(String[] args) {
        
        int arr[] = {1,5,2,9,8,9,4,4,4,2,4,5,7,3,2,1,4,1};

        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for(int el : arr){
            if (!freqMap.containsKey(el)) {
                freqMap.put(el,1);
            }else{
                freqMap.put(el,freqMap.get(el)+1);
            }
        }
        System.out.println("Frequesncy Map");
        System.out.println(freqMap.entrySet());

        int maxFreq = 0 , ansKey = -1 ;
        for(var e : freqMap.entrySet()){
          if (e.getValue()>maxFreq) {
            maxFreq = e.getValue();
            ansKey = e.getKey();
          }  
        }

        System.out.printf("%d has max Frequncy and it occurs  %d times",ansKey,maxFreq);

 
        System.out.println(); 

        for(var key : freqMap.keySet()){
            if (freqMap.get(key)>maxFreq ) {
                maxFreq = freqMap.get(key);
                ansKey = key;
            }
        }
        
        System.out.printf("%d has max Frequncy and it occurs  %d times",ansKey,maxFreq);



    }
}
