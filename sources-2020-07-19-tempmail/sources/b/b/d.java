package b.b;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1990a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private KeyStore f1991b;

    /* renamed from: c  reason: collision with root package name */
    private Context f1992c;

    /* renamed from: d  reason: collision with root package name */
    private String f1993d;

    /* renamed from: e  reason: collision with root package name */
    private int f1994e;

    public d(Context context) {
        this.f1992c = context;
        this.f1993d = "";
        this.f1994e = 0;
        e.c("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f1991b = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            e.b("Couldn't load keystore instance of type: AndroidKeyStore", e2);
        }
    }

    private void c(String str) {
        e.c("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f1990a) {
                if (!this.f1991b.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (Build.VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f1992c).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                } else {
                    e.c("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            e.b(sb.toString(), th);
        }
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f1990a) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.f1993d);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.f1994e);
        }
        return sb.toString();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    final void a() {
        /*
            r4 = this;
            java.lang.String r0 = r4.e()
            java.lang.Object r1 = r4.f1990a
            monitor-enter(r1)
            int r2 = r4.f1994e     // Catch:{ all -> 0x004b }
            int r2 = r2 + 1
            r4.f1994e = r2     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x004b }
            b.b.e.c(r2)     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r4.f1990a     // Catch:{ KeyStoreException -> 0x0027 }
            monitor-enter(r2)     // Catch:{ KeyStoreException -> 0x0027 }
            java.security.KeyStore r3 = r4.f1991b     // Catch:{ all -> 0x0024 }
            r3.deleteEntry(r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            goto L_0x0042
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ KeyStoreException -> 0x0027 }
            throw r0     // Catch:{ KeyStoreException -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "Exception "
            r2.<init>(r3)     // Catch:{ all -> 0x004b }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x004b }
            r2.append(r3)     // Catch:{ all -> 0x004b }
            java.lang.String r3 = " occurred"
            r2.append(r3)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004b }
            b.b.e.b(r2, r0)     // Catch:{ all -> 0x004b }
        L_0x0042:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r4.e()
            r4.c(r0)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.d.a():void");
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        int i;
        synchronized (this.f1990a) {
            i = this.f1994e;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r1 = r4.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1.length != 3) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        b.b.e.c("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r3.length != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r1.length != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r7.f1993d = r3[1].trim();
        r7.f1994e = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r1 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1990a
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.f1991b     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x008e
            java.security.KeyStore r1 = r7.f1991b     // Catch:{ all -> 0x0072 }
            java.util.Enumeration r1 = r1.aliases()     // Catch:{ all -> 0x0072 }
        L_0x000f:
            boolean r4 = r1.hasMoreElements()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r1.nextElement()     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x000f
            java.lang.String r5 = "com.appsflyer"
            boolean r5 = r4.startsWith(r5)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x000f
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch:{ all -> 0x0072 }
            int r5 = r1.length     // Catch:{ all -> 0x0072 }
            r6 = 3
            if (r5 != r6) goto L_0x008e
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x0072 }
            b.b.e.c(r4)     // Catch:{ all -> 0x0072 }
            r3 = r1[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ all -> 0x0070 }
            r4 = 2
            r1 = r1[r4]     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x0070 }
            int r5 = r3.length     // Catch:{ all -> 0x0070 }
            if (r5 != r4) goto L_0x008f
            int r5 = r1.length     // Catch:{ all -> 0x0070 }
            if (r5 != r4) goto L_0x008f
            r3 = r3[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0070 }
            r7.f1993d = r3     // Catch:{ all -> 0x0070 }
            r1 = r1[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0070 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0070 }
            r7.f1994e = r1     // Catch:{ all -> 0x0070 }
            goto L_0x008f
        L_0x0070:
            r1 = move-exception
            goto L_0x0074
        L_0x0072:
            r1 = move-exception
            r2 = 0
        L_0x0074:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch:{ all -> 0x0091 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0091 }
            r3.append(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0091 }
            b.b.e.b(r3, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.d.d():boolean");
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        String str;
        synchronized (this.f1990a) {
            str = this.f1993d;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final void g(String str) {
        this.f1993d = str;
        this.f1994e = 0;
        c(e());
    }
}
