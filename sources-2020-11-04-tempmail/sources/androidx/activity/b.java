package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f682a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f683b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f682a = z;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f683b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f682a;
    }

    public final void d() {
        Iterator<a> it = this.f683b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f683b.remove(aVar);
    }

    public final void f(boolean z) {
        this.f682a = z;
    }
}
