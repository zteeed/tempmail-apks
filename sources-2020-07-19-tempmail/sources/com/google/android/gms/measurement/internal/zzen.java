package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzen<V> {
    private static final Object h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f10387a;

    /* renamed from: b  reason: collision with root package name */
    private final g3<V> f10388b;

    /* renamed from: c  reason: collision with root package name */
    private final V f10389c;

    /* renamed from: d  reason: collision with root package name */
    private final V f10390d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f10391e;

    /* renamed from: f  reason: collision with root package name */
    private volatile V f10392f;
    private volatile V g;

    private zzen(String str, V v, V v2, g3<V> g3Var) {
        this.f10391e = new Object();
        this.f10392f = null;
        this.g = null;
        this.f10387a = str;
        this.f10389c = v;
        this.f10390d = v2;
        this.f10388b = g3Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0048 */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10391e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.zzx r4 = com.google.android.gms.measurement.internal.f3.f9992a
            if (r4 != 0) goto L_0x000e
            V r4 = r3.f10389c
            return r4
        L_0x000e:
            java.lang.Object r4 = h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzx.a()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0022
            V r0 = r3.g     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x001e
            V r0 = r3.f10389c     // Catch:{ all -> 0x006d }
            goto L_0x0020
        L_0x001e:
            V r0 = r3.g     // Catch:{ all -> 0x006d }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            java.util.List r4 = com.google.android.gms.measurement.internal.zzaq.f10381a     // Catch:{ SecurityException -> 0x005a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005a }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005a }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005a }
            com.google.android.gms.measurement.internal.zzen r0 = (com.google.android.gms.measurement.internal.zzen) r0     // Catch:{ SecurityException -> 0x005a }
            boolean r1 = com.google.android.gms.measurement.internal.zzx.a()     // Catch:{ SecurityException -> 0x005a }
            if (r1 != 0) goto L_0x0052
            r1 = 0
            com.google.android.gms.measurement.internal.g3<V> r2 = r0.f10388b     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.g3<V> r2 = r0.f10388b     // Catch:{ IllegalStateException -> 0x0048 }
            java.lang.Object r1 = r2.a()     // Catch:{ IllegalStateException -> 0x0048 }
        L_0x0048:
            java.lang.Object r2 = h     // Catch:{ SecurityException -> 0x005a }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005a }
            r0.g = r1     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002b
        L_0x004f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005a }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005a }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x005a:
        L_0x005b:
            com.google.android.gms.measurement.internal.g3<V> r4 = r3.f10388b
            if (r4 != 0) goto L_0x0062
            V r4 = r3.f10389c
            return r4
        L_0x0062:
            java.lang.Object r4 = r4.a()     // Catch:{ SecurityException -> 0x006a, IllegalStateException -> 0x0067 }
            return r4
        L_0x0067:
            V r4 = r3.f10389c
            return r4
        L_0x006a:
            V r4 = r3.f10389c
            return r4
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r4
        L_0x0072:
            r4 = move-exception
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzen.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f10387a;
    }
}
