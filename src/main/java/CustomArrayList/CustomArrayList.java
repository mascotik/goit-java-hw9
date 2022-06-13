package CustomArrayList;

public class CustomArrayList {
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;

    public void add(Object value) {
        if(size == array.length-1)
            resize(array.length*2);
        array[size++] = value;
    }

    public void remove(int index) {
        if (size - index >= 0)
            System.arraycopy(array, index + 1, array, index, size - index);
        array[size--] = null;
    }

    public void clear() {
        array = new Object[INIT_SIZE];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return array[index];
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
