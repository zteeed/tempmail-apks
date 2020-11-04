package a.h.h;

import a.h.j.h;
import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f268a;

    /* renamed from: b  reason: collision with root package name */
    private final String f269b;

    /* renamed from: c  reason: collision with root package name */
    private final String f270c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f271d;

    /* renamed from: e  reason: collision with root package name */
    private final int f272e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f273f = (this.f268a + "-" + this.f269b + "-" + this.f270c);

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.b(str);
        this.f268a = str;
        h.b(str2);
        this.f269b = str2;
        h.b(str3);
        this.f270c = str3;
        h.b(list);
        this.f271d = list;
    }

    public List<List<byte[]>> a() {
        return this.f271d;
    }

    public int b() {
        return this.f272e;
    }

    public String c() {
        return this.f273f;
    }

    public String d() {
        return this.f268a;
    }

    public String e() {
        return this.f269b;
    }

    public String f() {
        return this.f270c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f268a + ", mProviderPackage: " + this.f269b + ", mQuery: " + this.f270c + ", mCertificates:");
        for (int i = 0; i < this.f271d.size(); i++) {
            sb.append(" [");
            List list = this.f271d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f272e);
        return sb.toString();
    }
}
