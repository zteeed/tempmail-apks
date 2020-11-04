package org.jsoup.e;

import java.util.ArrayList;

/* compiled from: ParseErrorList */
public class e extends ArrayList<d> {

    /* renamed from: b  reason: collision with root package name */
    private final int f14647b;

    e(int i, int i2) {
        super(i);
        this.f14647b = i2;
    }

    public static e i() {
        return new e(0, 0);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return size() < this.f14647b;
    }
}
