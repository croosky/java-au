+ [Top K Frequent Words](#top-k-frequent-words/submissions)

[comment]: <> (Stop)

## Top K Frequent Words

https://leetcode.com/problems/top-k-frequent-words/submissions/

``` java
public List<String> topKFrequent(String[] words, int k) {
    HashMap<String, Integer> freq = new HashMap<String, Integer>();
    for(int i = 0; i < words.length; i++){
        if (freq.containsKey(words[i])) {
            freq.put(words[i], freq.get(words[i])+1);
        } else {
            freq.put(words[i], 0);
        }
    }
    return freq.entrySet().stream()
        .sorted((k1, k2) -> {
            return k1.getValue().equals(k2.getValue()) ?
                k1.getKey().compareTo(k2.getKey()) : k2.getValue() - k1.getValue();
        })
        .map((e) -> e.getKey()).limit(k).collect(Collectors.toList());
    
}

```