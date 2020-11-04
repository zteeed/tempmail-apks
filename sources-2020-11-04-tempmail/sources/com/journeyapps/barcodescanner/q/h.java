package com.journeyapps.barcodescanner.q;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.n;
import java.util.List;

/* compiled from: DisplayConfiguration */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private n f12807a;

    /* renamed from: b  reason: collision with root package name */
    private int f12808b;

    /* renamed from: c  reason: collision with root package name */
    private l f12809c = new i();

    public h(int i, n nVar) {
        this.f12808b = i;
        this.f12807a = nVar;
    }

    public n a(List<n> list, boolean z) {
        return this.f12809c.b(list, b(z));
    }

    public n b(boolean z) {
        n nVar = this.f12807a;
        if (nVar == null) {
            return null;
        }
        return z ? nVar.g() : nVar;
    }

    public int c() {
        return this.f12808b;
    }

    public Rect d(n nVar) {
        return this.f12809c.d(nVar, this.f12807a);
    }

    public void e(l lVar) {
        this.f12809c = lVar;
    }
}
