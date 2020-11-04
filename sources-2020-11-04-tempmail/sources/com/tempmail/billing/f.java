package com.tempmail.billing;

import android.util.Log;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SingleLiveEvent */
public class f<T> extends p<T> {
    /* access modifiers changed from: private */
    public final AtomicBoolean k = new AtomicBoolean(false);

    /* compiled from: SingleLiveEvent */
    class a implements q<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f12834a;

        a(q qVar) {
            this.f12834a = qVar;
        }

        public void a(T t) {
            if (f.this.k.compareAndSet(true, false)) {
                this.f12834a.a(t);
            }
        }
    }

    public void f(k kVar, q<? super T> qVar) {
        if (e()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.f(kVar, new a(qVar));
    }

    public void l(T t) {
        this.k.set(true);
        super.l(t);
    }
}
