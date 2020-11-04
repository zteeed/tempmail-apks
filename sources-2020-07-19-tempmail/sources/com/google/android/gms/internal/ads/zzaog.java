package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaog {
    public static int a(AdRequest.ErrorCode errorCode) {
        int i = w2.f5173b[errorCode.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static MediationAdRequest b(zzve zzve, boolean z) {
        AdRequest.Gender gender;
        HashSet hashSet = zzve.f9187f != null ? new HashSet(zzve.f9187f) : null;
        Date date = new Date(zzve.f9184c);
        int i = zzve.f9186e;
        if (i == 1) {
            gender = AdRequest.Gender.MALE;
        } else if (i != 2) {
            gender = AdRequest.Gender.UNKNOWN;
        } else {
            gender = AdRequest.Gender.FEMALE;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzve.l);
    }
}
