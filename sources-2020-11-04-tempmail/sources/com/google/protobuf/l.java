package com.google.protobuf;

/* compiled from: LazyFieldLite */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private d f12149a;

    /* renamed from: b  reason: collision with root package name */
    private g f12150b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile m f12151c;

    static {
        g.a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f12151c = r4;
        r4 = com.google.protobuf.d.f12105c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.protobuf.m r4) {
        /*
            r3 = this;
            com.google.protobuf.m r0 = r3.f12151c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.m r0 = r3.f12151c     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return
        L_0x000c:
            com.google.protobuf.d r0 = r3.f12149a     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.p r0 = r4.d()     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            com.google.protobuf.d r1 = r3.f12149a     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            com.google.protobuf.g r2 = r3.f12150b     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            com.google.protobuf.m r0 = (com.google.protobuf.m) r0     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            r3.f12151c = r0     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            goto L_0x002a
        L_0x0021:
            r3.f12151c = r4     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            com.google.protobuf.d r4 = com.google.protobuf.d.f12105c     // Catch:{ InvalidProtocolBufferException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r3.f12151c = r4     // Catch:{ all -> 0x002c }
            com.google.protobuf.d r4 = com.google.protobuf.d.f12105c     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l.a(com.google.protobuf.m):void");
    }

    public m b(m mVar) {
        a(mVar);
        return this.f12151c;
    }

    public m c(m mVar) {
        m mVar2 = this.f12151c;
        this.f12149a = null;
        this.f12151c = mVar;
        return mVar2;
    }
}
