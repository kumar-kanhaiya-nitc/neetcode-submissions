class DynamicArray {
    int arr[];

    public DynamicArray(int capacity) {
        arr = new int[capacity];
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
    }

    public int popback() {
        int ele = arr[getSize()-1];
        arr[getSize()-1] = 0;
        return ele;
    }

    private void resize() {
        int currentSize = arr.length;
        int temp[] = new int[currentSize];
        for(int i = 0; i < currentSize; i++) temp[i] = arr[i];
        arr = new int[currentSize*2];
        for(int i = 0; i < currentSize; i++) arr[i] = temp[i];
    }

    public int getSize() {
        int size=0;
        for(int i = 0; i < arr.length; i++) if(arr[i] != 0) size++;
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
