class LRUCache {

    private final HashMap<Integer, Integer> cache;
    private final int cap;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new LinkedHashMap<>(cap, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer>
            eldest) {
                return size() > LRUCache.this.cap;
            }
        };
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
    }
}
