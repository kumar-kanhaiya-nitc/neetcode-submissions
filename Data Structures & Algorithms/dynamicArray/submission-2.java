class DynamicArray {
    int arr[];
    int capacity;
    int size;
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    } 

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(getSize() == getCapacity())
            resize();
        arr[getSize()] = n;
        size++;
    }

    public int popback() {
        int ele = arr[size-1];
        size--;
        return ele;
    }

    private void resize() {
        this.capacity *=2;
        int temp[] = new int[size];
        for(int i = 0; i < size; i++) temp[i] = arr[i];
        arr = new int[capacity];
        for(int i = 0; i < size; i++) arr[i] = temp[i];
        
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
