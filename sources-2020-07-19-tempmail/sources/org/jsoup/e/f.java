package org.jsoup.e;

import org.jsoup.c.a;
import org.jsoup.d.b;

/* compiled from: ParseSettings */
public class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f14648c = new f(false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final f f14649d = new f(true, true);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14650a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14651b;

    public f(boolean z, boolean z2) {
        this.f14650a = z;
        this.f14651b = z2;
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f14651b) {
            bVar.X();
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        String trim = str.trim();
        return !this.f14650a ? a.a(trim) : trim;
    }
}
