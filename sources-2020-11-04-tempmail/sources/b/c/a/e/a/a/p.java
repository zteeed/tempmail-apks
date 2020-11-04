package b.c.a.e.a.a;

import android.app.PendingIntent;

final class p extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f2455a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2456b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2457c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2458d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f2459e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2460f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final PendingIntent k;
    private final PendingIntent l;
    private final PendingIntent m;
    private final PendingIntent n;

    p(String str, int i2, int i3, int i4, Integer num, int i5, long j2, long j3, long j4, long j5, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        String str2 = str;
        if (str2 != null) {
            this.f2455a = str2;
            this.f2456b = i2;
            this.f2457c = i3;
            this.f2458d = i4;
            this.f2459e = num;
            this.f2460f = i5;
            this.g = j2;
            this.h = j3;
            this.i = j4;
            this.j = j5;
            this.k = pendingIntent;
            this.l = pendingIntent2;
            this.m = pendingIntent3;
            this.n = pendingIntent4;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.i;
    }

    public final int d() {
        return this.f2456b;
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2455a.equals(aVar.p()) && this.f2456b == aVar.d() && this.f2457c == aVar.r() && this.f2458d == aVar.m() && ((num = this.f2459e) == null ? aVar.i() == null : num.equals(aVar.i())) && this.f2460f == aVar.s() && this.g == aVar.g() && this.h == aVar.q() && this.i == aVar.a() && this.j == aVar.e() && ((pendingIntent = this.k) == null ? aVar.h() == null : pendingIntent.equals(aVar.h())) && ((pendingIntent2 = this.l) == null ? aVar.j() == null : pendingIntent2.equals(aVar.j())) && ((pendingIntent3 = this.m) == null ? aVar.k() == null : pendingIntent3.equals(aVar.k()))) {
                PendingIntent pendingIntent4 = this.n;
                PendingIntent l2 = aVar.l();
                if (pendingIntent4 == null ? l2 == null : pendingIntent4.equals(l2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long g() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f2455a.hashCode() ^ 1000003) * 1000003) ^ this.f2456b) * 1000003) ^ this.f2457c) * 1000003) ^ this.f2458d) * 1000003;
        Integer num = this.f2459e;
        int i2 = 0;
        int hashCode2 = num != null ? num.hashCode() : 0;
        int i3 = this.f2460f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        int i4 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        PendingIntent pendingIntent = this.k;
        int hashCode3 = (i4 ^ (pendingIntent != null ? pendingIntent.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent2 = this.l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 != null ? pendingIntent2.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent3 = this.m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 != null ? pendingIntent3.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent4 = this.n;
        if (pendingIntent4 != null) {
            i2 = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public final Integer i() {
        return this.f2459e;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent j() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent k() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent l() {
        return this.n;
    }

    public final int m() {
        return this.f2458d;
    }

    public final String p() {
        return this.f2455a;
    }

    public final long q() {
        return this.h;
    }

    public final int r() {
        return this.f2457c;
    }

    public final int s() {
        return this.f2460f;
    }

    public final String toString() {
        String str = this.f2455a;
        int i2 = this.f2456b;
        int i3 = this.f2457c;
        int i4 = this.f2458d;
        String valueOf = String.valueOf(this.f2459e);
        int i5 = this.f2460f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        String valueOf2 = String.valueOf(this.k);
        long j6 = j5;
        String valueOf3 = String.valueOf(this.l);
        String valueOf4 = String.valueOf(this.m);
        long j7 = j4;
        String valueOf5 = String.valueOf(this.n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i2);
        sb.append(", updateAvailability=");
        sb.append(i3);
        sb.append(", installStatus=");
        sb.append(i4);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i5);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", additionalSpaceRequired=");
        sb.append(j7);
        sb.append(", assetPackStorageSize=");
        sb.append(j6);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
