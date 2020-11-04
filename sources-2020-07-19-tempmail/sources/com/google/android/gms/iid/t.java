package com.google.android.gms.iid;

final /* synthetic */ class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final p f3290b;

    t(p pVar) {
        this.f3290b = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r3 = com.google.android.gms.iid.zzr.a(r0.f3287f);
        r4 = r0.f3283b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f3297c;
        r5.arg1 = r1.f3295a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.c());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f3298d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.f3284c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        if (r1.f3293a == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        r1.f3293a.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        if (r1.f3294b == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        r1.f3294b.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bc, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.iid.p r0 = r8.f3290b
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f3282a     // Catch:{ all -> 0x00c7 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x000a:
            java.util.Queue<com.google.android.gms.iid.w<?>> r1 = r0.f3285d     // Catch:{ all -> 0x00c7 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0017
            r0.f()     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x0017:
            java.util.Queue<com.google.android.gms.iid.w<?>> r1 = r0.f3285d     // Catch:{ all -> 0x00c7 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.iid.w r1 = (com.google.android.gms.iid.w) r1     // Catch:{ all -> 0x00c7 }
            android.util.SparseArray<com.google.android.gms.iid.w<?>> r3 = r0.f3286e     // Catch:{ all -> 0x00c7 }
            int r4 = r1.f3295a     // Catch:{ all -> 0x00c7 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.iid.zzr r3 = r0.f3287f     // Catch:{ all -> 0x00c7 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f3324b     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.iid.u r4 = new com.google.android.gms.iid.u     // Catch:{ all -> 0x00c7 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00c7 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00c7 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
        L_0x0066:
            com.google.android.gms.iid.zzr r3 = r0.f3287f
            android.content.Context r3 = r3.f3323a
            android.os.Messenger r4 = r0.f3283b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f3297c
            r5.what = r6
            int r6 = r1.f3295a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.c()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f3298d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.android.gms.iid.v r1 = r0.f3284c     // Catch:{ RemoteException -> 0x00bd }
            android.os.Messenger r3 = r1.f3293a     // Catch:{ RemoteException -> 0x00bd }
            if (r3 == 0) goto L_0x00aa
            android.os.Messenger r1 = r1.f3293a     // Catch:{ RemoteException -> 0x00bd }
            r1.send(r5)     // Catch:{ RemoteException -> 0x00bd }
            goto L_0x0002
        L_0x00aa:
            com.google.android.gms.iid.MessengerCompat r3 = r1.f3294b     // Catch:{ RemoteException -> 0x00bd }
            if (r3 == 0) goto L_0x00b5
            com.google.android.gms.iid.MessengerCompat r1 = r1.f3294b     // Catch:{ RemoteException -> 0x00bd }
            r1.b(r5)     // Catch:{ RemoteException -> 0x00bd }
            goto L_0x0002
        L_0x00b5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00bd }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00bd }
            throw r1     // Catch:{ RemoteException -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x00c7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.t.run():void");
    }
}
