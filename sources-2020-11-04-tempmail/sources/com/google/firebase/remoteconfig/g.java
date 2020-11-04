package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.k;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12004a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12005b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12006c;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f12007a = false;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f12008b = 60;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f12009c = k.j;

        public g d() {
            return new g(this);
        }

        public b e(long j) {
            if (j >= 0) {
                this.f12009c = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long a() {
        return this.f12005b;
    }

    public long b() {
        return this.f12006c;
    }

    @Deprecated
    public boolean c() {
        return this.f12004a;
    }

    private g(b bVar) {
        this.f12004a = bVar.f12007a;
        this.f12005b = bVar.f12008b;
        this.f12006c = bVar.f12009c;
    }
}
