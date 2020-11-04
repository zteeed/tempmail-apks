package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzi;
import com.google.android.gms.internal.ads.zzdzm;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzeax;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w20 implements zzecw {

    /* renamed from: a  reason: collision with root package name */
    private final String f5174a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5175b;

    /* renamed from: c  reason: collision with root package name */
    private zzdzy f5176c;

    /* renamed from: d  reason: collision with root package name */
    private zzdzi f5177d;

    /* renamed from: e  reason: collision with root package name */
    private int f5178e;

    w20(zzebi zzebi) throws GeneralSecurityException {
        String G = zzebi.G();
        this.f5174a = G;
        if (G.equals(zzdxe.f8445b)) {
            try {
                zzeab I = zzeab.I(zzebi.H(), zzefo.b());
                this.f5176c = (zzdzy) zzdwy.p(zzebi);
                this.f5175b = I.G();
            } catch (zzegl e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.f5174a.equals(zzdxe.f8444a)) {
            try {
                zzdzl L = zzdzl.L(zzebi.H(), zzefo.b());
                this.f5177d = (zzdzi) zzdwy.p(zzebi);
                this.f5178e = L.G().G();
                this.f5175b = this.f5178e + L.H().G();
            } catch (zzegl e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.f5174a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    public final int a() {
        return this.f5175b;
    }

    public final zzdwc b(byte[] bArr) throws GeneralSecurityException {
        Class<zzdwc> cls = zzdwc.class;
        if (bArr.length != this.f5175b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f5174a.equals(zzdxe.f8445b)) {
            zzdzy.zza N = zzdzy.N();
            N.o(this.f5176c);
            zzdzy.zza zza = N;
            zza.x(zzeer.P(bArr, 0, this.f5175b));
            return (zzdwc) zzdwy.h(this.f5174a, (zzdzy) ((zzegb) zza.O()), cls);
        } else if (this.f5174a.equals(zzdxe.f8444a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f5178e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f5178e, this.f5175b);
            zzdzm.zza Q = zzdzm.Q();
            Q.o(this.f5177d.Q());
            zzdzm.zza zza2 = Q;
            zza2.y(zzeer.U(copyOfRange));
            zzeax.zza Q2 = zzeax.Q();
            Q2.o(this.f5177d.R());
            zzeax.zza zza3 = Q2;
            zza3.w(zzeer.U(copyOfRange2));
            zzdzi.zza S = zzdzi.S();
            S.y(this.f5177d.G());
            S.w((zzdzm) ((zzegb) zza2.O()));
            S.x((zzeax) ((zzegb) zza3.O()));
            return (zzdwc) zzdwy.h(this.f5174a, (zzdzi) ((zzegb) S.O()), cls);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
