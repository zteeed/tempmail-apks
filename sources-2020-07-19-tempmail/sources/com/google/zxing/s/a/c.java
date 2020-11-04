package com.google.zxing.s.a;

import android.content.Intent;
import com.google.zxing.a;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: DecodeFormatManager */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f11751a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    static final Set<a> f11752b = EnumSet.of(a.UPC_A, new a[]{a.UPC_E, a.EAN_13, a.EAN_8, a.RSS_14, a.RSS_EXPANDED});

    /* renamed from: c  reason: collision with root package name */
    static final Set<a> f11753c = EnumSet.of(a.CODE_39, a.CODE_93, a.CODE_128, a.ITF, a.CODABAR);

    /* renamed from: d  reason: collision with root package name */
    private static final Set<a> f11754d;

    /* renamed from: e  reason: collision with root package name */
    static final Set<a> f11755e = EnumSet.of(a.QR_CODE);

    /* renamed from: f  reason: collision with root package name */
    static final Set<a> f11756f = EnumSet.of(a.DATA_MATRIX);
    static final Set<a> g = EnumSet.of(a.AZTEC);
    static final Set<a> h = EnumSet.of(a.PDF_417);
    private static final Map<String, Set<a>> i;

    static {
        EnumSet<a> copyOf = EnumSet.copyOf(f11752b);
        f11754d = copyOf;
        copyOf.addAll(f11753c);
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("ONE_D_MODE", f11754d);
        i.put("PRODUCT_MODE", f11752b);
        i.put("QR_CODE_MODE", f11755e);
        i.put("DATA_MATRIX_MODE", f11756f);
        i.put("AZTEC_MODE", g);
        i.put("PDF417_MODE", h);
    }

    public static Set<a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f11751a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<a> b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(a.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(a.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return i.get(str);
        }
        return null;
    }
}
