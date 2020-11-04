package d.a.a0.i;

import f.a.c;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BasicIntQueueSubscription */
public abstract class a<T> extends AtomicInteger implements Object<T>, c {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
