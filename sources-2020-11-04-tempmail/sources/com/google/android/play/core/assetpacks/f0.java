package com.google.android.play.core.assetpacks;

final class f0 extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f11242a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11243b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11244c;

    f0(int i, String str, String str2) {
        this.f11242a = i;
        this.f11243b = str;
        this.f11244c = str2;
    }

    public final String b() {
        return this.f11244c;
    }

    public final int c() {
        return this.f11242a;
    }

    public final String d() {
        return this.f11243b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f11242a == aVar.c() && ((str = this.f11243b) == null ? aVar.d() == null : str.equals(aVar.d()))) {
                String str2 = this.f11244c;
                String b2 = aVar.b();
                if (str2 == null ? b2 == null : str2.equals(b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f11242a ^ 1000003) * 1000003;
        String str = this.f11243b;
        int i2 = 0;
        int hashCode = (i ^ (str != null ? str.hashCode() : 0)) * 1000003;
        String str2 = this.f11244c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f11242a;
        String str = this.f11243b;
        String str2 = this.f11244c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
