public class Pair<R, T> {
    private R first;
    private T second;
    Pair pair;

    private Pair(R first, T second) {
        this.first = first;
        this.second = second;
    }

    public R getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + first.hashCode();
        result = prime * result + second.hashCode();

        return result;
    }
    public static <T, R> Pair of(T first, R second){
        return  new Pair(first, second);
    }
}

