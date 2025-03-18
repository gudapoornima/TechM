package Generic;

import java.util.Arrays;

public class Generic1<T> {
    private T[] obj1;
    private T[] obj2;

    public Generic1(T[] a, T[] b) {
        this.obj1 = Arrays.copyOf(a, a.length);
        this.obj2 = Arrays.copyOf(b, b.length);
    }

    public boolean check() {
        return Arrays.equals(obj1, obj2);
    }
}
