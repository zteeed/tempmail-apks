package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.a;

final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f2460a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2461b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2462c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2463d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2464e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2465f;
    private final String g;
    private final String h;

    static final class b extends a.C0067a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f2466a;

        /* renamed from: b  reason: collision with root package name */
        private String f2467b;

        /* renamed from: c  reason: collision with root package name */
        private String f2468c;

        /* renamed from: d  reason: collision with root package name */
        private String f2469d;

        /* renamed from: e  reason: collision with root package name */
        private String f2470e;

        /* renamed from: f  reason: collision with root package name */
        private String f2471f;
        private String g;
        private String h;

        b() {
        }

        public a.C0067a a(Integer num) {
            this.f2466a = num;
            return this;
        }

        public a.C0067a b(String str) {
            this.f2469d = str;
            return this;
        }

        public a c() {
            return new c(this.f2466a, this.f2467b, this.f2468c, this.f2469d, this.f2470e, this.f2471f, this.g, this.h, (a) null);
        }

        public a.C0067a d(String str) {
            this.h = str;
            return this;
        }

        public a.C0067a e(String str) {
            this.f2468c = str;
            return this;
        }

        public a.C0067a f(String str) {
            this.g = str;
            return this;
        }

        public a.C0067a g(String str) {
            this.f2467b = str;
            return this;
        }

        public a.C0067a h(String str) {
            this.f2471f = str;
            return this;
        }

        public a.C0067a i(String str) {
            this.f2470e = str;
            return this;
        }
    }

    /* synthetic */ c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.f2460a = num;
        this.f2461b = str;
        this.f2462c = str2;
        this.f2463d = str3;
        this.f2464e = str4;
        this.f2465f = str5;
        this.g = str6;
        this.h = str7;
    }

    public String b() {
        return this.f2463d;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.f2462c;
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
        Integer num = this.f2460a;
        if (num != null ? num.equals(((c) obj).f2460a) : ((c) obj).f2460a == null) {
            String str = this.f2461b;
            if (str != null ? str.equals(((c) obj).f2461b) : ((c) obj).f2461b == null) {
                String str2 = this.f2462c;
                if (str2 != null ? str2.equals(((c) obj).f2462c) : ((c) obj).f2462c == null) {
                    String str3 = this.f2463d;
                    if (str3 != null ? str3.equals(((c) obj).f2463d) : ((c) obj).f2463d == null) {
                        String str4 = this.f2464e;
                        if (str4 != null ? str4.equals(((c) obj).f2464e) : ((c) obj).f2464e == null) {
                            String str5 = this.f2465f;
                            if (str5 != null ? str5.equals(((c) obj).f2465f) : ((c) obj).f2465f == null) {
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
        return this.f2461b;
    }

    public String g() {
        return this.f2465f;
    }

    public String h() {
        return this.f2464e;
    }

    public int hashCode() {
        Integer num = this.f2460a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2461b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2462c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2463d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2464e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2465f;
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
        return this.f2460a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f2460a + ", model=" + this.f2461b + ", hardware=" + this.f2462c + ", device=" + this.f2463d + ", product=" + this.f2464e + ", osBuild=" + this.f2465f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + "}";
    }
}
