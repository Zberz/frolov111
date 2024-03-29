package list5;

class listing5_9 {
    private char q[];
    private int putloc;
    private int getloc;

    listing5_9(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    listing5_9(listing5_9 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        System.arraycopy(ob.q, 0, q, 0, ob.q.length);
    }

    listing5_9(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    boolean isFull() {
        return (putloc == (q.length - 1));
    }

    boolean isEmpty() {
        return (getloc == putloc);
    }

    void put(char ch) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Очередь переполнена");
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Fronta je prbzdnb");
        }

        getloc++;
        return q[getloc];
    }
}
