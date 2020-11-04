package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzid {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f8755a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8756b = 2;

    static {
        new zzid(new int[]{2}, 2);
    }

    private zzid(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f8755a = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean a(int i) {
        return Arrays.binarySearch(this.f8755a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzid)) {
            return false;
        }
        zzid zzid = (zzid) obj;
        return Arrays.equals(this.f8755a, zzid.f8755a) && this.f8756b == zzid.f8756b;
    }

    public final int hashCode() {
        return this.f8756b + (Arrays.hashCode(this.f8755a) * 31);
    }

    public final String toString() {
        int i = this.f8756b;
        String arrays = Arrays.toString(this.f8755a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
