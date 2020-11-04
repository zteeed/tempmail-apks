package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebn;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdwy {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f8437a = Logger.getLogger(zzdwy.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f8438b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, a> f8439c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f8440d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<String, zzdwb<?>> f8441e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, zzdwt<?>> f8442f = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    interface a {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    interface b {
        <P> zzdwi<P> b(Class<P> cls) throws GeneralSecurityException;

        Set<Class<?>> c();

        zzdwi<?> d();

        Class<?> e();

        Class<?> f();
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static <P> zzdwi<P> b(String str, Class<P> cls) throws GeneralSecurityException {
        b q = q(str);
        if (cls == null) {
            return q.d();
        }
        if (q.c().contains(cls)) {
            return q.b(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(q.e());
        Set<Class<?>> c2 = q.c();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : c2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static <P> zzdwr<P> c(zzdwo zzdwo, zzdwi<P> zzdwi, Class<P> cls) throws GeneralSecurityException {
        a(cls);
        Class cls2 = cls;
        w10.b(zzdwo.b());
        zzdwr<P> a2 = zzdwr.a(cls2);
        for (zzebn.zzb next : zzdwo.b().H()) {
            if (next.G() == zzebg.ENABLED) {
                zzdwu<P> b2 = a2.b(g(next.L().N(), next.L().P(), cls2), next);
                if (next.M() == zzdwo.b().G()) {
                    a2.c(b2);
                }
            }
        }
        return a2;
    }

    private static <KeyProtoT extends zzehl> b d(zzdwj<KeyProtoT> zzdwj) {
        return new u10(zzdwj);
    }

    public static synchronized zzebf e(zzebi zzebi) throws GeneralSecurityException {
        zzebf d2;
        synchronized (zzdwy.class) {
            zzdwi<?> s = s(zzebi.G());
            if (((Boolean) f8440d.get(zzebi.G())).booleanValue()) {
                d2 = s.d(zzebi.H());
            } else {
                String valueOf = String.valueOf(zzebi.G());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return d2;
    }

    public static <P> P f(zzdwr<P> zzdwr) throws GeneralSecurityException {
        zzdwt zzdwt = (zzdwt) f8442f.get(zzdwr.d());
        if (zzdwt != null) {
            return zzdwt.b(zzdwr);
        }
        String valueOf = String.valueOf(zzdwr.d().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }

    private static <P> P g(String str, zzeer zzeer, Class<P> cls) throws GeneralSecurityException {
        return b(str, cls).e(zzeer);
    }

    public static <P> P h(String str, zzehl zzehl, Class<P> cls) throws GeneralSecurityException {
        a(cls);
        return b(str, cls).f(zzehl);
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        zzeer U = zzeer.U(bArr);
        a(cls);
        return g(str, U, cls);
    }

    public static synchronized <P> void j(zzdwi<P> zzdwi, boolean z) throws GeneralSecurityException {
        synchronized (zzdwy.class) {
            if (zzdwi != null) {
                String b2 = zzdwi.b();
                n(b2, zzdwi.getClass(), z);
                if (!f8438b.containsKey(b2)) {
                    f8438b.put(b2, new r10(zzdwi));
                }
                f8440d.put(b2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends zzehl> void k(zzdwj<KeyProtoT> zzdwj, boolean z) throws GeneralSecurityException {
        synchronized (zzdwy.class) {
            String a2 = zzdwj.a();
            n(a2, zzdwj.getClass(), true);
            if (!f8438b.containsKey(a2)) {
                f8438b.put(a2, d(zzdwj));
                f8439c.put(a2, o(zzdwj));
            }
            f8440d.put(a2, Boolean.TRUE);
        }
    }

    public static synchronized <P> void l(zzdwt<P> zzdwt) throws GeneralSecurityException {
        synchronized (zzdwy.class) {
            if (zzdwt != null) {
                Class<P> a2 = zzdwt.a();
                if (f8442f.containsKey(a2)) {
                    zzdwt zzdwt2 = (zzdwt) f8442f.get(a2);
                    if (!zzdwt.getClass().equals(zzdwt2.getClass())) {
                        Logger logger = f8437a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a2.toString());
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a2.getName(), zzdwt2.getClass().getName(), zzdwt.getClass().getName()}));
                    }
                }
                f8442f.put(a2, zzdwt);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized <KeyProtoT extends zzehl, PublicKeyProtoT extends zzehl> void m(zzdwv<KeyProtoT, PublicKeyProtoT> zzdwv, zzdwj<PublicKeyProtoT> zzdwj, boolean z) throws GeneralSecurityException {
        Class<?> f2;
        synchronized (zzdwy.class) {
            String a2 = zzdwv.a();
            String a3 = zzdwj.a();
            n(a2, zzdwv.getClass(), true);
            n(a3, zzdwj.getClass(), false);
            if (!a2.equals(a3)) {
                if (f8438b.containsKey(a2) && (f2 = ((b) f8438b.get(a2)).f()) != null) {
                    if (!f2.equals(zzdwj.getClass())) {
                        Logger logger = f8437a;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 96 + String.valueOf(a3).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(a2);
                        sb.append(" with inconsistent public key type ");
                        sb.append(a3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzdwv.getClass().getName(), f2.getName(), zzdwj.getClass().getName()}));
                    }
                }
                if (!f8438b.containsKey(a2) || ((b) f8438b.get(a2)).f() == null) {
                    f8438b.put(a2, new s10(zzdwv, zzdwj));
                    f8439c.put(a2, o(zzdwv));
                }
                f8440d.put(a2, Boolean.TRUE);
                if (!f8438b.containsKey(a3)) {
                    f8438b.put(a3, d(zzdwj));
                }
                f8440d.put(a3, Boolean.FALSE);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void n(java.lang.String r8, java.lang.Class<?> r9, boolean r10) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzdwy> r0 = com.google.android.gms.internal.ads.zzdwy.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.zzdwy$b> r1 = f8438b     // Catch:{ all -> 0x0093 }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.zzdwy$b> r1 = f8438b     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0093 }
            com.google.android.gms.internal.ads.zzdwy$b r1 = (com.google.android.gms.internal.ads.zzdwy.b) r1     // Catch:{ all -> 0x0093 }
            java.lang.Class r2 = r1.e()     // Catch:{ all -> 0x0093 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0065
            java.util.logging.Logger r10 = f8437a     // Catch:{ all -> 0x0093 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "com.google.crypto.tink.Registry"
            java.lang.String r4 = "ensureKeyManagerInsertable"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r7 = r6.length()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0038
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x003e
        L_0x0038:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r6.<init>(r5)     // Catch:{ all -> 0x0093 }
            r5 = r6
        L_0x003e:
            r10.logp(r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0093 }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x0093 }
            r8 = 1
            java.lang.Class r1 = r1.e()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r1     // Catch:{ all -> 0x0093 }
            r8 = 2
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r9     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0093 }
            r10.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x0065:
            if (r10 == 0) goto L_0x0091
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r9 = f8440d     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0093 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0093 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x0091
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "New keys are already disallowed for key type "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r1 = r8.length()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0088
            java.lang.String r8 = r10.concat(r8)     // Catch:{ all -> 0x0093 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r8.<init>(r10)     // Catch:{ all -> 0x0093 }
        L_0x008d:
            r9.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r0)
            return
        L_0x0093:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwy.n(java.lang.String, java.lang.Class, boolean):void");
    }

    private static <KeyProtoT extends zzehl> a o(zzdwj<KeyProtoT> zzdwj) {
        return new v10(zzdwj);
    }

    public static synchronized zzehl p(zzebi zzebi) throws GeneralSecurityException {
        zzehl c2;
        synchronized (zzdwy.class) {
            zzdwi<?> s = s(zzebi.G());
            if (((Boolean) f8440d.get(zzebi.G())).booleanValue()) {
                c2 = s.c(zzebi.H());
            } else {
                String valueOf = String.valueOf(zzebi.G());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return c2;
    }

    private static synchronized b q(String str) throws GeneralSecurityException {
        b bVar;
        synchronized (zzdwy.class) {
            if (!f8438b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            bVar = (b) f8438b.get(str);
        }
        return bVar;
    }

    @Deprecated
    public static zzdwb<?> r(String str) throws GeneralSecurityException {
        if (str != null) {
            zzdwb<?> zzdwb = (zzdwb) f8441e.get(str.toLowerCase());
            if (zzdwb != null) {
                return zzdwb;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static zzdwi<?> s(String str) throws GeneralSecurityException {
        return q(str).d();
    }
}
