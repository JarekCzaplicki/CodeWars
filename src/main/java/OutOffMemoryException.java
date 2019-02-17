public class OutOffMemoryException {
    public static void errorExample() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            Integer[] array = new Integer[i * i * i];
        }
//        Integer[] array = new Integer[1000 * 1000 * 1000];
    }
}
