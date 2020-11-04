package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f674a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f675b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements i, a {

        /* renamed from: a  reason: collision with root package name */
        private final g f676a;

        /* renamed from: b  reason: collision with root package name */
        private final b f677b;

        /* renamed from: c  reason: collision with root package name */
        private a f678c;

        LifecycleOnBackPressedCancellable(g gVar, b bVar) {
            this.f676a = gVar;
            this.f677b = bVar;
            gVar.a(this);
        }

        public void c(k kVar, g.a aVar) {
            if (aVar == g.a.ON_START) {
                this.f678c = OnBackPressedDispatcher.this.b(this.f677b);
            } else if (aVar == g.a.ON_STOP) {
                a aVar2 = this.f678c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == g.a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f676a.c(this);
            this.f677b.e(this);
            a aVar = this.f678c;
            if (aVar != null) {
                aVar.cancel();
                this.f678c = null;
            }
        }
    }

    private class a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final b f680a;

        a(b bVar) {
            this.f680a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f675b.remove(this.f680a);
            this.f680a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f674a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(k kVar, b bVar) {
        g c2 = kVar.c();
        if (c2.b() != g.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(c2, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a b(b bVar) {
        this.f675b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f675b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f674a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
