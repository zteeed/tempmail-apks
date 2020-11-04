package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbaz {
    public static <T> T a(Context context, String str, zzbbc<IBinder, T> zzbbc) throws zzbbb {
        try {
            return zzbbc.apply(c(context).d(str));
        } catch (Exception e2) {
            throw new zzbbb(e2);
        }
    }

    public static Context b(Context context) throws zzbbb {
        return c(context).b();
    }

    private static DynamiteModule c(Context context) throws zzbbb {
        try {
            return DynamiteModule.e(context, DynamiteModule.i, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new zzbbb(e2);
        }
    }
}
