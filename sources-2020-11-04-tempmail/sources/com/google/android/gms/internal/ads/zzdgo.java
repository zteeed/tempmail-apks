package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgo implements zzela<zzdeb<JSONObject>> {
    public static zzdeb<JSONObject> a(zzawz zzawz, Object obj, zzdew zzdew, zzdft zzdft, zzeku<zzdeq> zzeku, zzeku<zzdfa> zzeku2, zzeku<zzdfe> zzeku3, zzeku<zzdfk> zzeku4, zzeku<zzdfp> zzeku5, zzeku<zzdfy> zzeku6, zzeku<zzdgc> zzeku7, zzeku<zzdgq> zzeku8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((vt) obj);
        hashSet.add(zzdew);
        hashSet.add(zzdft);
        if (((Boolean) zzwg.e().c(zzaav.G2)).booleanValue()) {
            hashSet.add(zzeku.get());
        }
        if (((Boolean) zzwg.e().c(zzaav.H2)).booleanValue()) {
            hashSet.add(zzeku2.get());
        }
        if (((Boolean) zzwg.e().c(zzaav.I2)).booleanValue()) {
            hashSet.add(zzeku3.get());
        }
        if (((Boolean) zzwg.e().c(zzaav.J2)).booleanValue()) {
            hashSet.add(zzeku4.get());
        }
        if (((Boolean) zzwg.e().c(zzaav.L2)).booleanValue()) {
            hashSet.add(new zzdcn(zzeku6.get(), ((Long) zzwg.e().c(zzaav.E1)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) zzwg.e().c(zzaav.M2)).booleanValue()) {
            hashSet.add(zzeku7.get());
        }
        if (((Boolean) zzwg.e().c(zzaav.N2)).booleanValue()) {
            hashSet.add(zzeku8.get());
        }
        zzdeb<JSONObject> zzdeb = new zzdeb<>(executor, hashSet);
        zzelg.b(zzdeb, "Cannot return null from a non-@Nullable @Provides method");
        return zzdeb;
    }

    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
