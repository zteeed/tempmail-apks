package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzedi;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzedf<T_WRAPPER extends zzedi<T_ENGINE>, T_ENGINE> {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f8515d = Logger.getLogger(zzedf.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List<Provider> f8516e;

    /* renamed from: f  reason: collision with root package name */
    public static final zzedf<zzedh, Cipher> f8517f = new zzedf<>(new zzedh());
    public static final zzedf<zzedl, Mac> g = new zzedf<>(new zzedl());
    public static final zzedf<zzedk, KeyAgreement> h = new zzedf<>(new zzedk());
    public static final zzedf<zzedm, KeyPairGenerator> i = new zzedf<>(new zzedm());
    public static final zzedf<zzedj, KeyFactory> j = new zzedf<>(new zzedj());

    /* renamed from: a  reason: collision with root package name */
    private T_WRAPPER f8518a;

    /* renamed from: b  reason: collision with root package name */
    private List<Provider> f8519b = f8516e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8520c = true;

    static {
        if (zzedw.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f8515d.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f8516e = arrayList;
        } else {
            f8516e = new ArrayList();
        }
        new zzedn();
        new zzedo();
    }

    private zzedf(T_WRAPPER t_wrapper) {
        this.f8518a = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a2 : this.f8519b) {
            try {
                return this.f8518a.a(str, a2);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.f8520c) {
            return this.f8518a.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
