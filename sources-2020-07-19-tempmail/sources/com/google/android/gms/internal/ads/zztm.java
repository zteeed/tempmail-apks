package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzty;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zztm {

    /* renamed from: a  reason: collision with root package name */
    private final zztr f9109a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final zzty.zzi.zza f9110b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9111c;

    public zztm(zztr zztr) {
        this.f9110b = zzty.zzi.c0();
        this.f9109a = zztr;
        this.f9111c = ((Boolean) zzwg.e().c(zzaav.i2)).booleanValue();
    }

    private final synchronized void c(zzto.zza.C0085zza zza) {
        zzty.zzi.zza zza2 = this.f9110b;
        zza2.L();
        zza2.D(g());
        zztv a2 = this.f9109a.a(((zzty.zzi) ((zzegb) this.f9110b.O())).g());
        a2.b(zza.i());
        a2.c();
        String valueOf = String.valueOf(Integer.toString(zza.i(), 10));
        zzaxv.m(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void d(zzto.zza.C0085zza zza) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(e(zza).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzaxv.m("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzaxv.m("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzaxv.m("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zzaxv.m("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zzaxv.m("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized String e(zzto.zza.C0085zza zza) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f9110b.F(), Long.valueOf(zzq.zzld().b()), Integer.valueOf(zza.i()), Base64.encodeToString(((zzty.zzi) ((zzegb) this.f9110b.O())).g(), 3)});
    }

    public static zztm f() {
        return new zztm();
    }

    private static List<Long> g() {
        List<String> e2 = zzaav.e();
        ArrayList arrayList = new ArrayList();
        for (String split : e2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zzaxv.m("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(zzto.zza.C0085zza zza) {
        if (this.f9111c) {
            if (((Boolean) zzwg.e().c(zzaav.j2)).booleanValue()) {
                d(zza);
            } else {
                c(zza);
            }
        }
    }

    public final synchronized void b(zztp zztp) {
        if (this.f9111c) {
            try {
                zztp.a(this.f9110b);
            } catch (NullPointerException e2) {
                zzq.zzla().e(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    private zztm() {
        this.f9110b = zzty.zzi.c0();
        this.f9111c = false;
        this.f9109a = new zztr();
    }
}
