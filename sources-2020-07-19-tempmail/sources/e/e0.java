package e;

import java.io.IOException;

/* compiled from: Protocol */
public enum e0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: b  reason: collision with root package name */
    private final String f14017b;

    private e0(String str) {
        this.f14017b = str;
    }

    public static e0 f(String str) throws IOException {
        e0 e0Var = QUIC;
        e0 e0Var2 = SPDY_3;
        e0 e0Var3 = HTTP_2;
        e0 e0Var4 = H2_PRIOR_KNOWLEDGE;
        e0 e0Var5 = HTTP_1_1;
        e0 e0Var6 = HTTP_1_0;
        if (str.equals(e0Var6.f14017b)) {
            return e0Var6;
        }
        if (str.equals(e0Var5.f14017b)) {
            return e0Var5;
        }
        if (str.equals(e0Var4.f14017b)) {
            return e0Var4;
        }
        if (str.equals(e0Var3.f14017b)) {
            return e0Var3;
        }
        if (str.equals(e0Var2.f14017b)) {
            return e0Var2;
        }
        if (str.equals(e0Var.f14017b)) {
            return e0Var;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f14017b;
    }
}
