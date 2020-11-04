package com.google.firebase.installations.q;

import com.google.firebase.installations.q.b;

/* compiled from: TokenResult */
public abstract class e {

    /* compiled from: TokenResult */
    public static abstract class a {
        public abstract e a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    /* compiled from: TokenResult */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0105b bVar = new b.C0105b();
        bVar.d(0);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
