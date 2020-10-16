public class Main{
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        BinInterface bin = new Bin(100);

        bin.add(14);
        bin.add(22);
        bin.add(38);

        System.out.println(bin.size());
        System.out.println(bin.isEmpty());
        System.out.println(bin.contains(14));
        System.out.println(bin.contains(15));
        System.out.println(bin.count(22));

        bin.remove(22);

        System.out.println(bin.count(22));

        BinInterface binList = new BinArrayList();

        binList.add(14);
        binList.add(22);
        binList.add(38);

        System.out.println(binList.size());
        System.out.println(binList.isEmpty());
        System.out.println(binList.contains(14));
        System.out.println(binList.contains(15));
        System.out.println(binList.count(22));

        binList.remove(22);

        System.out.println(binList.count(22));
    }


}