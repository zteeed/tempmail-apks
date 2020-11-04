package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgz;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public class Analytics {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Analytics f10723a;

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public static final class Event extends zzgw {
        private Event() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public static final class Param extends zzgz {
        private Param() {
        }
    }

    private Analytics(zzfy zzfy) {
        Preconditions.k(zzfy);
    }

    @ShowFirstParty
    @Keep
    public static Analytics getInstance(Context context) {
        if (f10723a == null) {
            synchronized (Analytics.class) {
                if (f10723a == null) {
                    f10723a = new Analytics(zzfy.a(context, (zzae) null, (Long) null));
                }
            }
        }
        return f10723a;
    }
}
