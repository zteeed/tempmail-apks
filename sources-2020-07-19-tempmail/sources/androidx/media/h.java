package androidx.media;

import a.h.j.c;
import android.text.TextUtils;

/* compiled from: MediaSessionManagerImplBase */
class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private String f1640a;

    /* renamed from: b  reason: collision with root package name */
    private int f1641b;

    /* renamed from: c  reason: collision with root package name */
    private int f1642c;

    h(String str, int i, int i2) {
        this.f1640a = str;
        this.f1641b = i;
        this.f1642c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (TextUtils.equals(this.f1640a, hVar.f1640a) && this.f1641b == hVar.f1641b && this.f1642c == hVar.f1642c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(this.f1640a, Integer.valueOf(this.f1641b), Integer.valueOf(this.f1642c));
    }
}
