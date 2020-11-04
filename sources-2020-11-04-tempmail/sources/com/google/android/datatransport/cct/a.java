package com.google.android.datatransport.cct;

import b.c.a.b.b;
import b.c.a.b.i.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a implements f {

    /* renamed from: c  reason: collision with root package name */
    static final String f2635c = f.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    static final String f2636d = f.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e  reason: collision with root package name */
    private static final String f2637e = f.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f  reason: collision with root package name */
    private static final Set<b> f2638f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.b("proto"), b.b("json")})));
    public static final a g = new a(f2636d, f2637e);

    /* renamed from: a  reason: collision with root package name */
    private final String f2639a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2640b;

    public a(String str, String str2) {
        this.f2639a = str;
        this.f2640b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<b> a() {
        return f2638f;
    }

    public byte[] b() {
        if (this.f2640b == null && this.f2639a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f2639a;
        objArr[2] = "\\";
        String str = this.f2640b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f2640b;
    }

    public String e() {
        return this.f2639a;
    }

    public byte[] getExtras() {
        return b();
    }

    public String getName() {
        return "cct";
    }
}
