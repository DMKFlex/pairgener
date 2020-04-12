public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        System.out.println(i);
        String s = pair.getSecond();
        System.out.println(s);
        Pair<Integer,String> pair1=Pair.of(1,"hello");
        boolean mstbtrue = pair.equals(pair1);
        System.out.println(mstbtrue);
        boolean mstbtrue2=pair.hashCode()==pair1.hashCode();
        System.out.println(mstbtrue2);
    }
}
