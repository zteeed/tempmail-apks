package org.greenrobot.eventbus;

import android.os.Looper;

/* compiled from: MainThreadSupport */
public interface g {

    /* compiled from: MainThreadSupport */
    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private final Looper f15026a;

        public a(Looper looper) {
            this.f15026a = looper;
        }

        public k a(c cVar) {
            return new e(cVar, this.f15026a, 10);
        }

        public boolean b() {
            return this.f15026a == Looper.myLooper();
        }
    }

    k a(c cVar);

    boolean b();
}
