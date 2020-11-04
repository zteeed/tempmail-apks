package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdmy implements zzdmv {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f8232a;

    public zzdmy(zzve zzve, String str, int i, String str2, zzvo zzvo) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzve.f9184c));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(zzve.f9185d));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzve.f9185d.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzve.f9186e));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = zzve.f9187f;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzve.g));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzve.h));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzve.i));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzve.j);
        }
        if (hashSet.contains("location")) {
            Location location = zzve.l;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzve.m);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(zzve.n));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(zzve.o));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = zzve.p;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzve.q);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzve.r);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzve.s));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzve.u));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzve.v);
        }
        if (hashSet.contains("orientation")) {
            if (zzvo != null) {
                arrayList.add(Integer.valueOf(zzvo.f9199b));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.f8232a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdmy)) {
            return false;
        }
        return Arrays.equals(this.f8232a, ((zzdmy) obj).f8232a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8232a);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.f8232a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
