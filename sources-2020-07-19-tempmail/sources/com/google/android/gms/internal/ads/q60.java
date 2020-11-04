package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class q60 implements i70 {

    /* renamed from: a  reason: collision with root package name */
    private static final q60 f4694a = new q60();

    private q60() {
    }

    public static q60 c() {
        return f4694a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.g70 a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzegb> r0 = com.google.android.gms.internal.ads.zzegb.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001f
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0024
        L_0x001f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0024:
            r0.<init>(r5)
            throw r0
        L_0x0028:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.ads.zzegb r0 = com.google.android.gms.internal.ads.zzegb.F(r0)     // Catch:{ Exception -> 0x003a }
            int r1 = com.google.android.gms.internal.ads.zzegb.zze.f8571c     // Catch:{ Exception -> 0x003a }
            r2 = 0
            java.lang.Object r0 = r0.t(r1, r2, r2)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.ads.g70 r0 = (com.google.android.gms.internal.ads.g70) r0     // Catch:{ Exception -> 0x003a }
            return r0
        L_0x003a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0052
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0057
        L_0x0052:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0057:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q60.a(java.lang.Class):com.google.android.gms.internal.ads.g70");
    }

    public final boolean b(Class<?> cls) {
        return zzegb.class.isAssignableFrom(cls);
    }
}
