package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzans implements NativeMediationAdRequest {

    /* renamed from: a  reason: collision with root package name */
    private final Date f5998a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5999b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f6000c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6001d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f6002e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6003f;
    private final zzadj g;
    private final List<String> h = new ArrayList();
    private final boolean i;
    private final Map<String, Boolean> j = new HashMap();

    public zzans(Date date, int i2, Set<String> set, Location location, boolean z, int i3, zzadj zzadj, List<String> list, boolean z2, int i4, String str) {
        this.f5998a = date;
        this.f5999b = i2;
        this.f6000c = set;
        this.f6002e = location;
        this.f6001d = z;
        this.f6003f = i3;
        this.g = zzadj;
        this.i = z2;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.h.add(next);
                }
            }
        }
    }

    public final float getAdVolume() {
        return zzyt.s().q();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f5998a;
    }

    @Deprecated
    public final int getGender() {
        return this.f5999b;
    }

    public final Set<String> getKeywords() {
        return this.f6000c;
    }

    public final Location getLocation() {
        return this.f6002e;
    }

    public final NativeAdOptions getNativeAdOptions() {
        zzaaa zzaaa;
        if (this.g == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.g.f5818c).setImageOrientation(this.g.f5819d).setRequestMultipleImages(this.g.f5820e);
        zzadj zzadj = this.g;
        if (zzadj.f5817b >= 2) {
            requestMultipleImages.setAdChoicesPlacement(zzadj.f5821f);
        }
        zzadj zzadj2 = this.g;
        if (zzadj2.f5817b >= 3 && (zzaaa = zzadj2.g) != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(zzaaa));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return zzyt.s().r();
    }

    public final boolean isAppInstallAdRequested() {
        List<String> list = this.h;
        if (list != null) {
            return list.contains("2") || this.h.contains("6");
        }
        return false;
    }

    public final boolean isContentAdRequested() {
        List<String> list = this.h;
        if (list != null) {
            return list.contains("1") || this.h.contains("6");
        }
        return false;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.i;
    }

    public final boolean isTesting() {
        return this.f6001d;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.h;
        return list != null && list.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f6003f;
    }

    public final boolean zzua() {
        List<String> list = this.h;
        return list != null && list.contains("3");
    }

    public final Map<String, Boolean> zzub() {
        return this.j;
    }
}
