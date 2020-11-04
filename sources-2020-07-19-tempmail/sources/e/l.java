package e;

import e.m0.l.c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

/* compiled from: CertificatePinner */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f14080c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f14081a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final c f14082b;

    /* compiled from: CertificatePinner */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f14083a = new ArrayList();

        public l a() {
            return new l(new LinkedHashSet(this.f14083a), (c) null);
        }
    }

    /* compiled from: CertificatePinner */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f14084a;

        /* renamed from: b  reason: collision with root package name */
        final String f14085b;

        /* renamed from: c  reason: collision with root package name */
        final String f14086c;

        /* renamed from: d  reason: collision with root package name */
        final ByteString f14087d;

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            if (!this.f14084a.startsWith("*.")) {
                return str.equals(this.f14085b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f14085b.length()) {
                String str2 = this.f14085b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f14084a.equals(bVar.f14084a) && this.f14086c.equals(bVar.f14086c) && this.f14087d.equals(bVar.f14087d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f14084a.hashCode()) * 31) + this.f14086c.hashCode()) * 31) + this.f14087d.hashCode();
        }

        public String toString() {
            return this.f14086c + this.f14087d.base64();
        }
    }

    l(Set<b> set, @Nullable c cVar) {
        this.f14081a = set;
        this.f14082b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + e((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static ByteString d(X509Certificate x509Certificate) {
        return ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    static ByteString e(X509Certificate x509Certificate) {
        return ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> b2 = b(str);
        if (!b2.isEmpty()) {
            c cVar = this.f14082b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b2.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    b bVar = b2.get(i2);
                    if (bVar.f14086c.equals("sha256/")) {
                        if (byteString == null) {
                            byteString = e(x509Certificate);
                        }
                        if (bVar.f14087d.equals(byteString)) {
                            return;
                        }
                    } else if (bVar.f14086c.equals("sha1/")) {
                        if (byteString2 == null) {
                            byteString2 = d(x509Certificate);
                        }
                        if (bVar.f14087d.equals(byteString2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f14086c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(c(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = b2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(b2.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b next : this.f14081a) {
            if (next.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (!Objects.equals(this.f14082b, lVar.f14082b) || !this.f14081a.equals(lVar.f14081a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public l f(@Nullable c cVar) {
        if (Objects.equals(this.f14082b, cVar)) {
            return this;
        }
        return new l(this.f14081a, cVar);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f14082b) * 31) + this.f14081a.hashCode();
    }
}
