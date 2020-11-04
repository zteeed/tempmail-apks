package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzid {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f8938a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8939b = 2;

    static {
        new zzid(new int[]{2}, 2);
    }

    private zzid(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f8938a = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean a(int i) {
        return Arrays.binarySearch(this.f8938a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzid)) {
            return false;
        }
        zzid zzid = (zzid) obj;
        return Arrays.equals(this.f8938a, zzid.f8938a) && this.f8939b == zzid.f8939b;
    }

    public final int hashCode() {
        return this.f8939b + (Arrays.hashCode(this.f8938a) * 31);
    }

    public final String toString() {
        int i = this.f8939b;
        String arrays = Arrays.toString(this.f8938a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
