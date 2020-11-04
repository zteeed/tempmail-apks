package com.journeyapps.barcodescanner.q;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.n;
import java.util.List;

/* compiled from: DisplayConfiguration */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private n f12258a;

    /* renamed from: b  reason: collision with root package name */
    private int f12259b;

    /* renamed from: c  reason: collision with root package name */
    private l f12260c = new i();

    public h(int i, n nVar) {
        this.f12259b = i;
        this.f12258a = nVar;
    }

    public n a(List<n> list, boolean z) {
        return this.f12260c.b(list, b(z));
    }

    public n b(boolean z) {
        n nVar = this.f12258a;
        if (nVar == null) {
            return null;
        }
        return z ? nVar.g() : nVar;
    }

    public int c() {
        return this.f12259b;
    }

    public Rect d(n nVar) {
        return this.f12260c.d(nVar, this.f12258a);
    }

    public void e(l lVar) {
        this.f12260c = lVar;
    }
}
