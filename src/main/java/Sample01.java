public class Sample01 {
    private int[] arr;
    public static void main(String[] args) {
        App app = new App();
    }
    public App(int[] arr) {

        this.arr=arr;
    }
    public App(int size) {
    }

        public void swap(int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    //  2 задание
    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}

