package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.k;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11455a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11456b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11457c;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f11458a = false;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f11459b = 60;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f11460c = k.j;

        public g d() {
            return new g(this);
        }

        public b e(long j) {
            if (j >= 0) {
                this.f11460c = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long a() {
        return this.f11456b;
    }

    public long b() {
        return this.f11457c;
    }

    @Deprecated
    public boolean c() {
        return this.f11455a;
    }

    private g(b bVar) {
        this.f11455a = bVar.f11458a;
        this.f11456b = bVar.f11459b;
        this.f11457c = bVar.f11460c;
    }
}
