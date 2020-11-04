package org.jsoup.e;

/* compiled from: ParseError */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f14645a;

    /* renamed from: b  reason: collision with root package name */
    private String f14646b;

    d(int i, String str) {
        this.f14645a = i;
        this.f14646b = str;
    }

    public String toString() {
        return this.f14645a + ": " + this.f14646b;
    }

    d(int i, String str, Object... objArr) {
        this.f14646b = String.format(str, objArr);
        this.f14645a = i;
    }
}
