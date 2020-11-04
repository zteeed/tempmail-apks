package com.google.zxing.w.c0.g.e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: AbstractExpandedDecoder */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private final a f12454a;

    /* renamed from: b  reason: collision with root package name */
    private final s f12455b;

    j(a aVar) {
        this.f12454a = aVar;
        this.f12455b = new s(aVar);
    }

    public static j a(a aVar) {
        if (aVar.i(1)) {
            return new g(aVar);
        }
        if (!aVar.i(2)) {
            return new k(aVar);
        }
        int g = s.g(aVar, 1, 4);
        if (g == 4) {
            return new a(aVar);
        }
        if (g == 5) {
            return new b(aVar);
        }
        int g2 = s.g(aVar, 1, 5);
        if (g2 == 12) {
            return new c(aVar);
        }
        if (g2 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", "11");
            case 57:
                return new e(aVar, "320", "11");
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", "15");
            case 61:
                return new e(aVar, "320", "15");
            case 62:
                return new e(aVar, "310", "17");
            case 63:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    /* access modifiers changed from: protected */
    public final s b() {
        return this.f12455b;
    }

    /* access modifiers changed from: protected */
    public final a c() {
        return this.f12454a;
    }

    public abstract String d() throws NotFoundException, FormatException;
}
