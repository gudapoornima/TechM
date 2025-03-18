package assign1;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                mergedList.add(a.get(i));
                i++;
            } else {
                mergedList.add(b.get(j));
                j++;
            }
        }
        
        while (i < a.size()) {
            mergedList.add(a.get(i));
            i++;
        }
        
        while (j < b.size()) {
            mergedList.add(b.get(j));
            j++;
        }
        
        return mergedList;
    }
}

public class Solutions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int aCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a = IntStream.range(0, aCount)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().trim();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        int bCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> b = IntStream.range(0, bCount)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().trim();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        List<Integer> result = Result.mergeArrays(a, b);
        
        for (int num : result) {
            bufferedWriter.write(num + "\n");
        }
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}
