class DynamicArray {
    ArrayList<Integer> arr;
    int capacity;
    public DynamicArray(int capacity) {
        arr = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr.get(i);
    }

    public void set(int i, int n) {
        arr.set(i,n);
    }

    public void pushback(int n) {
        if(getSize() == getCapacity())
            resize();
        arr.add(n);
    }

    public int popback() {
        int ele = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return ele;
    }

    private void resize() {
        this.capacity *=2;
        arr.ensureCapacity(this.capacity);
    }

    public int getSize() {
        return arr.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
