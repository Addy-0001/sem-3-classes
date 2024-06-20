import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class CompleteableFutureExample {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        CompletableFuture<Integer> sumfuture = CompletableFuture.supplyAsync(() -> sum(numlist));
        CompletableFuture<Integer> squareFuture = sumfuture.thenApplyAsync(result -> result * result);
        CompletableFuture<Void> future = squareFuture.thenAcceptAsync(result -> System.out.println(result));

        System.out.println("ABC");

    }

    static int sum(List<Integer> numlist) {
        int sum = 0;
        for (int num : numlist) {
            sum += num;
        }
        try{
            Thread.sleep(8000);
        } catch (Exception e){
            e.printStackTrace();
        }
        return sum;
    }

}
