package org.jsoup.e;

import org.jsoup.c.a;
import org.jsoup.d.b;

/* compiled from: ParseSettings */
public class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f15217c = new f(false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final f f15218d = new f(true, true);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15219a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15220b;

    public f(boolean z, boolean z2) {
        this.f15219a = z;
        this.f15220b = z2;
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f15220b) {
            bVar.X();
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        String trim = str.trim();
        return !this.f15219a ? a.a(trim) : trim;
    }
}
