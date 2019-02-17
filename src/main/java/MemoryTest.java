/**
 * @author Jarek Czaplicki
 */
public class MemoryTest {
    public static void main(String[] args) throws Exception {
        MemoryTest memoryTest = new MemoryTest();
        memoryTest.generateOOM();
    }

    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("\nSTART\n");
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            System.out.println("Iteration " + outerIterator);
            System.out.println("Runtime.getRuntime().freeMemory() " + Runtime.getRuntime().freeMemory());
            System.out.println("Runtime.getRuntime().maxMemory() " + Runtime.getRuntime().maxMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 2;
            System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }
}
