package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.e;

/* compiled from: BillingClient */
public abstract class b {

    /* renamed from: com.android.billingclient.api.b$b  reason: collision with other inner class name */
    /* compiled from: BillingClient */
    public static final class C0066b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2385a;

        /* renamed from: b  reason: collision with root package name */
        private int f2386b;

        /* renamed from: c  reason: collision with root package name */
        private int f2387c;

        /* renamed from: d  reason: collision with root package name */
        private f f2388d;

        public b a() {
            Context context = this.f2385a;
            if (context != null) {
                f fVar = this.f2388d;
                if (fVar != null) {
                    return new BillingClientImpl(context, this.f2386b, this.f2387c, fVar);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public C0066b b(f fVar) {
            this.f2388d = fVar;
            return this;
        }

        private C0066b(Context context) {
            this.f2386b = 0;
            this.f2387c = 0;
            this.f2385a = context;
        }
    }

    public static C0066b c(Context context) {
        return new C0066b(context);
    }

    public abstract int a(String str);

    public abstract int b(Activity activity, d dVar);

    public abstract e.a d(String str);

    public abstract void e(h hVar, i iVar);

    public abstract void f(c cVar);
}
