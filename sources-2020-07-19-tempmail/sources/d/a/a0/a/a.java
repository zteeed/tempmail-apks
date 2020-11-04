package d.a.a0.a;

import d.a.y.b;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ArrayCompositeDisposable */
public final class a extends AtomicReferenceArray<b> implements b {
    private static final long serialVersionUID = 2746389416410565408L;

    public a(int i) {
        super(i);
    }

    public boolean a(int i, b bVar) {
        b bVar2;
        do {
            bVar2 = (b) get(i);
            if (bVar2 == c.DISPOSED) {
                bVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public void dispose() {
        b bVar;
        if (get(0) != c.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                b bVar2 = (b) get(i);
                c cVar = c.DISPOSED;
                if (!(bVar2 == cVar || (bVar = (b) getAndSet(i, cVar)) == c.DISPOSED || bVar == null)) {
                    bVar.dispose();
                }
            }
        }
    }
}
