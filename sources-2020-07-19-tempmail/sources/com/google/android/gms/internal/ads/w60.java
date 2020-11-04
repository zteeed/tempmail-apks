package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class w60 extends v60 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f5190c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private w60() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzegt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.zzegt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.zzegt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> f(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = g(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzegw
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzegt r0 = new com.google.android.gms.internal.ads.zzegt
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.q70
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzegm
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzegm r0 = (com.google.android.gms.internal.ads.zzegm) r0
            com.google.android.gms.internal.ads.zzegm r6 = r0.r(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.ads.v80.f(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f5190c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.v80.f(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzeje
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzegt r1 = new com.google.android.gms.internal.ads.zzegt
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.zzeje r0 = (com.google.android.gms.internal.ads.zzeje) r0
            r1.addAll(r0)
            com.google.android.gms.internal.ads.v80.f(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.q70
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzegm
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.ads.zzegm r1 = (com.google.android.gms.internal.ads.zzegm) r1
            boolean r2 = r1.p()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.zzegm r0 = r1.r(r0)
            com.google.android.gms.internal.ads.v80.f(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w60.f(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> g(Object obj, long j) {
        return (List) v80.G(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> a(Object obj, long j) {
        return f(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j) {
        List g = g(obj2, j);
        List f2 = f(obj, j, g.size());
        int size = f2.size();
        int size2 = g.size();
        if (size > 0 && size2 > 0) {
            f2.addAll(g);
        }
        if (size > 0) {
            g = f2;
        }
        v80.f(obj, j, g);
    }

    /* access modifiers changed from: package-private */
    public final void c(Object obj, long j) {
        Object obj2;
        List list = (List) v80.G(obj, j);
        if (list instanceof zzegw) {
            obj2 = ((zzegw) list).H();
        } else if (!f5190c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof q70) || !(list instanceof zzegm)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzegm zzegm = (zzegm) list;
                if (zzegm.p()) {
                    zzegm.k();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        v80.f(obj, j, obj2);
    }
}
