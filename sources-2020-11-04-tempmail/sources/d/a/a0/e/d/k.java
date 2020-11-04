package d.a.a0.e.d;

import d.a.a0.b.a;
import d.a.a0.b.b;
import d.a.a0.d.o;
import d.a.a0.j.e;
import d.a.a0.j.f;
import d.a.a0.j.j;
import d.a.q;

/* compiled from: ObservableBlockingSubscribe */
public final class k {
    public static <T> void a(q<? extends T> qVar) {
        f fVar = new f();
        o oVar = new o(a.g(), fVar, fVar, a.g());
        qVar.subscribe(oVar);
        e.a(fVar, oVar);
        Throwable th = fVar.f14469b;
        if (th != null) {
            throw j.d(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void b(d.a.q<? extends T> r3, d.a.s<? super T> r4) {
        /*
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            d.a.a0.d.h r1 = new d.a.a0.d.h
            r1.<init>(r0)
            r4.onSubscribe(r1)
            r3.subscribe(r1)
        L_0x0010:
            boolean r3 = r1.a()
            if (r3 == 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.lang.Object r3 = r0.poll()
            if (r3 != 0) goto L_0x002a
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r3 = move-exception
            r1.dispose()
            r4.onError(r3)
            return
        L_0x002a:
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x003a
            java.lang.Object r2 = d.a.a0.d.h.f13224c
            if (r3 == r2) goto L_0x003a
            boolean r3 = d.a.a0.j.m.g(r3, r4)
            if (r3 == 0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.k.b(d.a.q, d.a.s):void");
    }

    public static <T> void c(q<? extends T> qVar, d.a.z.f<? super T> fVar, d.a.z.f<? super Throwable> fVar2, d.a.z.a aVar) {
        b.e(fVar, "onNext is null");
        b.e(fVar2, "onError is null");
        b.e(aVar, "onComplete is null");
        b(qVar, new o(fVar, fVar2, aVar, a.g()));
    }
}
