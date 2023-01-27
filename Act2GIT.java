public class Act2GIT {
    public int[] generaArray() {
        int[] array = new int[20];
        for (int i = 0; i < (20); i += 1) {
            array[i] = (int)(Math.random() * (10) + 1);
        }
        return array;
    }
}
