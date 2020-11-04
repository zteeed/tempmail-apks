package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzjl implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzjl> CREATOR = new ob0();

    /* renamed from: b  reason: collision with root package name */
    private final zza[] f8787b;

    /* renamed from: c  reason: collision with root package name */
    private int f8788c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8789d;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new pb0();

        /* renamed from: b  reason: collision with root package name */
        private int f8790b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final UUID f8791c;

        /* renamed from: d  reason: collision with root package name */
        private final String f8792d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f8793e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f8794f;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.f8792d.equals(zza.f8792d) && zzpo.g(this.f8791c, zza.f8791c) && Arrays.equals(this.f8793e, zza.f8793e);
        }

        public final int hashCode() {
            if (this.f8790b == 0) {
                this.f8790b = (((this.f8791c.hashCode() * 31) + this.f8792d.hashCode()) * 31) + Arrays.hashCode(this.f8793e);
            }
            return this.f8790b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8791c.getMostSignificantBits());
            parcel.writeLong(this.f8791c.getLeastSignificantBits());
            parcel.writeString(this.f8792d);
            parcel.writeByteArray(this.f8793e);
            parcel.writeByte(this.f8794f ? (byte) 1 : 0);
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            zzpb.d(uuid);
            this.f8791c = uuid;
            zzpb.d(str);
            this.f8792d = str;
            zzpb.d(bArr);
            this.f8793e = bArr;
            this.f8794f = false;
        }

        zza(Parcel parcel) {
            this.f8791c = new UUID(parcel.readLong(), parcel.readLong());
            this.f8792d = parcel.readString();
            this.f8793e = parcel.createByteArray();
            this.f8794f = parcel.readByte() != 0;
        }
    }

    public zzjl(List<zza> list) {
        this(false, (zza[]) list.toArray(new zza[list.size()]));
    }

    public final zza a(int i) {
        return this.f8787b[i];
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (zzhc.f8720b.equals(zza2.f8791c)) {
            return zzhc.f8720b.equals(zza3.f8791c) ? 0 : 1;
        }
        return zza2.f8791c.compareTo(zza3.f8791c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzjl.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8787b, ((zzjl) obj).f8787b);
    }

    public final int hashCode() {
        if (this.f8788c == 0) {
            this.f8788c = Arrays.hashCode(this.f8787b);
        }
        return this.f8788c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f8787b, 0);
    }

    public zzjl(zza... zzaArr) {
        this(true, zzaArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.gms.internal.ads.zzjl$zza[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzjl(boolean r3, com.google.android.gms.internal.ads.zzjl.zza... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.zzjl$zza[] r4 = (com.google.android.gms.internal.ads.zzjl.zza[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0055
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f8791c
            r1 = r4[r3]
            java.util.UUID r1 = r1.f8791c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f8791c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r4 = "Duplicate data for uuid: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0055:
            r2.f8787b = r4
            int r3 = r4.length
            r2.f8789d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.<init>(boolean, com.google.android.gms.internal.ads.zzjl$zza[]):void");
    }

    zzjl(Parcel parcel) {
        zza[] zzaArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f8787b = zzaArr;
        this.f8789d = zzaArr.length;
    }
}
