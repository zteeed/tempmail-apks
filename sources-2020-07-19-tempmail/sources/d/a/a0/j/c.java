package d.a.a0.j;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AtomicThrowable */
public final class c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean a(Throwable th) {
        return j.a(this, th);
    }

    public Throwable b() {
        return j.b(this);
    }
}
