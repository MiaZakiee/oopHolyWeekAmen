package Map;

import java.util.ArrayList;
import java.util.List;

public class Map <A,B> {
    private final List<A> key;
    private final List<B> value;

    public Map (A key, B value) {
        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
        this.key.add(key);
        this.value.add(value);
    }

    public Map () {
        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
    }

    public void put (A key, B value) {
        if (this.key.contains(key)) {
            this.value.set(this.key.indexOf(key), value);
        } else {
            this.key.add(key);
            this.value.add(value);
        }
    }

    public B get (A key) {
        if (this.key.contains(key)) {
            return this.value.get(this.key.indexOf(key));
        } else {
            return null;
        }
    }

    public B remove (A key) {
        if (this.key.contains(key)) {
            B retVal = this.value.get(this.key.indexOf(key));
            this.value.remove(this.key.indexOf(key));
            this.key.remove(key);
            return retVal;
        } else {
            return null;
        }
    }

    public void display () {
        for (A e : this.key) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (B e : this.value) {
            System.out.print(e + " ");
        }
    }
}
