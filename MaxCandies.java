import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        for(int i =0; i<candies.length;i++){
            if(candies[i]>=maxCandies)
              maxCandies = candies[i];
        }
        List<Boolean> results = new ArrayList<>();
        for(int i = 0;i<=candies.length-1;i++){
            results.add(candies[i] + extraCandies >= maxCandies );
        }
        return results;
    }
}
