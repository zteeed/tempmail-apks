package org.greenrobot.eventbus;

import android.os.Looper;

/* compiled from: MainThreadSupport */
public interface g {

    /* compiled from: MainThreadSupport */
    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private final Looper f14468a;

        public a(Looper looper) {
            this.f14468a = looper;
        }

        public k a(c cVar) {
            return new e(cVar, this.f14468a, 10);
        }

        public boolean b() {
            return this.f14468a == Looper.myLooper();
        }
    }

    k a(c cVar);

    boolean b();
}
