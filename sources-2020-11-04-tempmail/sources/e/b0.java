package e;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: MediaType */
public final class b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f14541d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f14542e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f14543a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14544b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final String f14545c;

    private b0(String str, String str2, String str3, @Nullable String str4) {
        this.f14543a = str;
        this.f14544b = str2;
        this.f14545c = str4;
    }

    public static b0 c(String str) {
        Matcher matcher = f14541d.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f14542e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new b0(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    public static b0 d(String str) {
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public Charset a() {
        return b((Charset) null);
    }

    @Nullable
    public Charset b(@Nullable Charset charset) {
        try {
            return this.f14545c != null ? Charset.forName(this.f14545c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public String e() {
        return this.f14544b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof b0) && ((b0) obj).f14543a.equals(this.f14543a);
    }

    public int hashCode() {
        return this.f14543a.hashCode();
    }

    public String toString() {
        return this.f14543a;
    }
}
