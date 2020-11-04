package com.google.android.datatransport.runtime.backends;

import b.c.a.b.i.h;
import com.google.android.datatransport.runtime.backends.a;

/* compiled from: BackendRequest */
public abstract class f {

    /* compiled from: BackendRequest */
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<h> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<h> b();

    public abstract byte[] c();
}
