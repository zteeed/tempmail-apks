package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzash extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzash> CREATOR = new zzasj();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private ParcelFileDescriptor f6089b;

    /* renamed from: c  reason: collision with root package name */
    private Parcelable f6090c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6091d = true;

    @SafeParcelable.Constructor
    public zzash(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f6089b = parcelFileDescriptor;
    }

    private static <T> ParcelFileDescriptor A(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                zzbbf.f6320a.execute(new t3(autoCloseOutputStream, bArr));
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
                zzbba.c("Error transporting the ad response", e);
                zzq.zzla().e(e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            zzbba.c("Error transporting the ad response", e);
            zzq.zzla().e(e, "LargeParcelTeleporter.pipeData.2");
            IOUtils.a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor B() {
        if (this.f6089b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f6090c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f6089b = A(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f6089b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void v(java.io.OutputStream r3, byte[] r4) {
        /*
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0019 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0019 }
            int r0 = r4.length     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.writeInt(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.write(r4)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            com.google.android.gms.common.util.IOUtils.a(r1)
            return
        L_0x0011:
            r4 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x0014:
            r4 = move-exception
            r0 = r1
            goto L_0x001a
        L_0x0017:
            r4 = move-exception
            goto L_0x0032
        L_0x0019:
            r4 = move-exception
        L_0x001a:
            java.lang.String r1 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.zzbba.c(r1, r4)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.ads.zzaxh r1 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "LargeParcelTeleporter.pipeData.1"
            r1.e(r4, r2)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x002e
            com.google.android.gms.common.util.IOUtils.a(r3)
            return
        L_0x002e:
            com.google.android.gms.common.util.IOUtils.a(r0)
            return
        L_0x0032:
            if (r0 != 0) goto L_0x0038
            com.google.android.gms.common.util.IOUtils.a(r3)
            goto L_0x003b
        L_0x0038:
            com.google.android.gms.common.util.IOUtils.a(r0)
        L_0x003b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzash.v(java.io.OutputStream, byte[]):void");
    }

    /* JADX INFO: finally extract failed */
    public final <T extends SafeParcelable> T u(Parcelable.Creator<T> creator) {
        if (this.f6091d) {
            if (this.f6089b == null) {
                zzbba.g("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f6089b));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                IOUtils.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f6090c = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f6091d = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e2) {
                zzbba.c("Could not read from parcel file descriptor", e2);
                IOUtils.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                IOUtils.a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f6090c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        B();
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, this.f6089b, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
