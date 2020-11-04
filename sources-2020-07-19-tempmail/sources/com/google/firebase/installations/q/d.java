package com.google.firebase.installations.q;

import com.google.firebase.installations.q.a;

/* compiled from: InstallationResponse */
public abstract class d {

    /* compiled from: InstallationResponse */
    public static abstract class a {
        public abstract d a();

        public abstract a b(e eVar);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* compiled from: InstallationResponse */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new a.b();
    }

    public abstract e b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
