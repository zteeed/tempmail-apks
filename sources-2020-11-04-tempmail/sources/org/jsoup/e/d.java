package org.jsoup.e;

/* compiled from: ParseError */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f15214a;

    /* renamed from: b  reason: collision with root package name */
    private String f15215b;

    d(int i, String str) {
        this.f15214a = i;
        this.f15215b = str;
    }

    public String toString() {
        return this.f15214a + ": " + this.f15215b;
    }

    d(int i, String str, Object... objArr) {
        this.f15215b = String.format(str, objArr);
        this.f15214a = i;
    }
}
