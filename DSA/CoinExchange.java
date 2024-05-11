public class CoinExchange {
    public void coinExchange(int available[], int target){
        int temp = 0; 
        for(int i = available.length-1; i>=0; i--){
            while((target - available[i])>=0){
                temp++; 
                target = target - available[i];
            }
            if (target == 0){
                break; 
            }
        }
        System.out.println(temp);
    }
}
