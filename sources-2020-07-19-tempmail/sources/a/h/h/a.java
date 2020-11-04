package a.h.h;

import a.h.j.h;
import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f267a;

    /* renamed from: b  reason: collision with root package name */
    private final String f268b;

    /* renamed from: c  reason: collision with root package name */
    private final String f269c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f270d;

    /* renamed from: e  reason: collision with root package name */
    private final int f271e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f272f = (this.f267a + "-" + this.f268b + "-" + this.f269c);

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.b(str);
        this.f267a = str;
        h.b(str2);
        this.f268b = str2;
        h.b(str3);
        this.f269c = str3;
        h.b(list);
        this.f270d = list;
    }

    public List<List<byte[]>> a() {
        return this.f270d;
    }

    public int b() {
        return this.f271e;
    }

    public String c() {
        return this.f272f;
    }

    public String d() {
        return this.f267a;
    }

    public String e() {
        return this.f268b;
    }

    public String f() {
        return this.f269c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f267a + ", mProviderPackage: " + this.f268b + ", mQuery: " + this.f269c + ", mCertificates:");
        for (int i = 0; i < this.f270d.size(); i++) {
            sb.append(" [");
            List list = this.f270d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f271e);
        return sb.toString();
    }
}
