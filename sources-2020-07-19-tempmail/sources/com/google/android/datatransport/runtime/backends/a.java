package com.google.android.datatransport.runtime.backends;

import b.c.a.b.i.h;
import com.google.android.datatransport.runtime.backends.f;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<h> f2537a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2538b;

    /* compiled from: AutoValue_BackendRequest */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<h> f2539a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f2540b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f2539a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f2539a, this.f2540b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<h> iterable) {
            if (iterable != null) {
                this.f2539a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.f2540b = bArr;
            return this;
        }
    }

    public Iterable<h> b() {
        return this.f2537a;
    }

    public byte[] c() {
        return this.f2538b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2537a.equals(fVar.b())) {
            if (Arrays.equals(this.f2538b, fVar instanceof a ? ((a) fVar).f2538b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2537a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2538b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f2537a + ", extras=" + Arrays.toString(this.f2538b) + "}";
    }

    private a(Iterable<h> iterable, byte[] bArr) {
        this.f2537a = iterable;
        this.f2538b = bArr;
    }
}
