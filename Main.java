public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        
        int stop = 100000;
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        
        BinInterface bin = new Bin(100);
        for (int i = 0; i < stop; i++) {
            bin.add(14);
            bin.add(22);
            bin.remove(22);
            bin.add(38);
        }


        endTime = System.nanoTime();

        System.out.println((endTime - startTime) / 1000000000.0);

        startTime = System.nanoTime();
        
        bin = new BinArrayList();
        for (int i = 0; i < stop; i++) {
            bin.add(14);
            bin.add(22);
            bin.remove(22);
            bin.add(38);
        }


        endTime = System.nanoTime();

        System.out.println((endTime - startTime) / 1000000000.0);

    }

}