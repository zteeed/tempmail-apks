package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.a;

final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f2648a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2649b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2650c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2651d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2652e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2653f;
    private final String g;
    private final String h;

    static final class b extends a.C0066a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f2654a;

        /* renamed from: b  reason: collision with root package name */
        private String f2655b;

        /* renamed from: c  reason: collision with root package name */
        private String f2656c;

        /* renamed from: d  reason: collision with root package name */
        private String f2657d;

        /* renamed from: e  reason: collision with root package name */
        private String f2658e;

        /* renamed from: f  reason: collision with root package name */
        private String f2659f;
        private String g;
        private String h;

        b() {
        }

        public a.C0066a a(Integer num) {
            this.f2654a = num;
            return this;
        }

        public a.C0066a b(String str) {
            this.f2657d = str;
            return this;
        }

        public a c() {
            return new c(this.f2654a, this.f2655b, this.f2656c, this.f2657d, this.f2658e, this.f2659f, this.g, this.h, (a) null);
        }

        public a.C0066a d(String str) {
            this.h = str;
            return this;
        }

        public a.C0066a e(String str) {
            this.f2656c = str;
            return this;
        }

        public a.C0066a f(String str) {
            this.g = str;
            return this;
        }

        public a.C0066a g(String str) {
            this.f2655b = str;
            return this;
        }

        public a.C0066a h(String str) {
            this.f2659f = str;
            return this;
        }

        public a.C0066a i(String str) {
            this.f2658e = str;
            return this;
        }
    }

    /* synthetic */ c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.f2648a = num;
        this.f2649b = str;
        this.f2650c = str2;
        this.f2651d = str3;
        this.f2652e = str4;
        this.f2653f = str5;
        this.g = str6;
        this.h = str7;
    }

    public String b() {
        return this.f2651d;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.f2650c;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        Integer num = this.f2648a;
        if (num != null ? num.equals(((c) obj).f2648a) : ((c) obj).f2648a == null) {
            String str = this.f2649b;
            if (str != null ? str.equals(((c) obj).f2649b) : ((c) obj).f2649b == null) {
                String str2 = this.f2650c;
                if (str2 != null ? str2.equals(((c) obj).f2650c) : ((c) obj).f2650c == null) {
                    String str3 = this.f2651d;
                    if (str3 != null ? str3.equals(((c) obj).f2651d) : ((c) obj).f2651d == null) {
                        String str4 = this.f2652e;
                        if (str4 != null ? str4.equals(((c) obj).f2652e) : ((c) obj).f2652e == null) {
                            String str5 = this.f2653f;
                            if (str5 != null ? str5.equals(((c) obj).f2653f) : ((c) obj).f2653f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((c) obj).g) : ((c) obj).g == null) {
                                    String str7 = this.h;
                                    if (str7 == null) {
                                        if (((c) obj).h == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(((c) obj).h)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f2649b;
    }

    public String g() {
        return this.f2653f;
    }

    public String h() {
        return this.f2652e;
    }

    public int hashCode() {
        Integer num = this.f2648a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2649b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2650c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2651d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2652e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2653f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    public Integer i() {
        return this.f2648a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f2648a + ", model=" + this.f2649b + ", hardware=" + this.f2650c + ", device=" + this.f2651d + ", product=" + this.f2652e + ", osBuild=" + this.f2653f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + "}";
    }
}
