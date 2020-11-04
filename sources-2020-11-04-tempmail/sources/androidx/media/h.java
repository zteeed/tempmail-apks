package androidx.media;

import a.h.j.c;
import android.text.TextUtils;

/* compiled from: MediaSessionManagerImplBase */
class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private String f1723a;

    /* renamed from: b  reason: collision with root package name */
    private int f1724b;

    /* renamed from: c  reason: collision with root package name */
    private int f1725c;

    h(String str, int i, int i2) {
        this.f1723a = str;
        this.f1724b = i;
        this.f1725c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (TextUtils.equals(this.f1723a, hVar.f1723a) && this.f1724b == hVar.f1724b && this.f1725c == hVar.f1725c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(this.f1723a, Integer.valueOf(this.f1724b), Integer.valueOf(this.f1725c));
    }
}
