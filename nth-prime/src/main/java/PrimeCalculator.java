import java.util.HashMap;
import java.util.Map;

class PrimeCalculator {

    private Map<Integer, Integer> prime = new HashMap<Integer, Integer>();
    PrimeCalculator(){
        boolean[] isPrime = new boolean[1000000];
        for(int i = 2; i * i < isPrime.length; i++)
        {
            if(!isPrime[i]) {
                for (int j = i *
                        i; j < isPrime.length; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
        int counter = 1;
        for(int i = 2; i < isPrime.length; i++) {
            if(isPrime[i] == false) {
                prime.put(counter, i);
                counter++;
            }
        }
    }
    int nth(int nth) {
        if(nth < 1) throw new IllegalArgumentException();
        return prime.get(nth);
    }

}
