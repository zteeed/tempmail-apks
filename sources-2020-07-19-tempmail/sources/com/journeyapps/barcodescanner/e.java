package com.journeyapps.barcodescanner;

import com.google.zxing.c;
import com.google.zxing.h;
import com.google.zxing.i;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.t.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Decoder */
public class e implements p {

    /* renamed from: a  reason: collision with root package name */
    private l f12177a;

    /* renamed from: b  reason: collision with root package name */
    private List<o> f12178b = new ArrayList();

    public e(l lVar) {
        this.f12177a = lVar;
    }

    public void a(o oVar) {
        this.f12178b.add(oVar);
    }

    /* access modifiers changed from: protected */
    public m b(c cVar) {
        m mVar;
        this.f12178b.clear();
        try {
            if (this.f12177a instanceof i) {
                mVar = ((i) this.f12177a).e(cVar);
            } else {
                mVar = this.f12177a.c(cVar);
            }
        } catch (Exception unused) {
            mVar = null;
        } catch (Throwable th) {
            this.f12177a.a();
            throw th;
        }
        this.f12177a.a();
        return mVar;
    }

    public m c(h hVar) {
        return b(e(hVar));
    }

    public List<o> d() {
        return new ArrayList(this.f12178b);
    }

    /* access modifiers changed from: protected */
    public c e(h hVar) {
        return new c(new j(hVar));
    }
}
