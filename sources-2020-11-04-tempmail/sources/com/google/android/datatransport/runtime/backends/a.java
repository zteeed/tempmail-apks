package com.google.android.datatransport.runtime.backends;

import b.c.a.b.i.h;
import com.google.android.datatransport.runtime.backends.f;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<h> f2725a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2726b;

    /* compiled from: AutoValue_BackendRequest */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<h> f2727a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f2728b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f2727a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f2727a, this.f2728b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<h> iterable) {
            if (iterable != null) {
                this.f2727a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.f2728b = bArr;
            return this;
        }
    }

    public Iterable<h> b() {
        return this.f2725a;
    }

    public byte[] c() {
        return this.f2726b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2725a.equals(fVar.b())) {
            if (Arrays.equals(this.f2726b, fVar instanceof a ? ((a) fVar).f2726b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2725a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2726b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f2725a + ", extras=" + Arrays.toString(this.f2726b) + "}";
    }

    private a(Iterable<h> iterable, byte[] bArr) {
        this.f2725a = iterable;
        this.f2726b = bArr;
    }
}
