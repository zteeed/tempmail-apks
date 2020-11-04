package e.m0;

import android.support.v4.media.session.PlaybackStateCompat;
import e.b0;
import e.h0;
import e.j0;
import e.y;
import e.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.http2.b;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;

/* compiled from: Util */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14104a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f14105b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final y f14106c = y.g(new String[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f14107d = j0.create((b0) null, f14104a);

    /* renamed from: e  reason: collision with root package name */
    private static final Options f14108e = Options.of(ByteString.decodeHex("efbbbf"), ByteString.decodeHex("feff"), ByteString.decodeHex("fffe"), ByteString.decodeHex("0000ffff"), ByteString.decodeHex("ffff0000"));

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f14109f = Charset.forName("UTF-32BE");
    private static final Charset g = Charset.forName("UTF-32LE");
    public static final TimeZone h = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> i = a.f14099b;
    private static final Method j;
    private static final Pattern k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        Method method = null;
        h0.create((b0) null, f14104a);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        j = method;
    }

    static /* synthetic */ Thread A(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static boolean B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager C() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public static boolean D(z zVar, z zVar2) {
        return zVar.m().equals(zVar2.m()) && zVar.z() == zVar2.z() && zVar.E().equals(zVar2.E());
    }

    public static boolean E(Source source, int i2, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static int F(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int G(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static ThreadFactory H(String str, boolean z) {
        return new b(str, z);
    }

    public static List<b> I(y yVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < yVar.h(); i2++) {
            arrayList.add(new b(yVar.e(i2), yVar.i(i2)));
        }
        return arrayList;
    }

    public static y J(List<b> list) {
        y.a aVar = new y.a();
        for (b next : list) {
            c.f14102a.b(aVar, next.f14314a.utf8(), next.f14315b.utf8());
        }
        return aVar.f();
    }

    public static String K(String str, int i2, int i3) {
        int F = F(str, i2, i3);
        return str.substring(F, G(str, F, i3));
    }

    public static boolean L(String str) {
        return k.matcher(str).matches();
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = j;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static Charset b(BufferedSource bufferedSource, Charset charset) throws IOException {
        int select = bufferedSource.select(f14108e);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            return StandardCharsets.UTF_8;
        }
        if (select == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (select == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (select == 3) {
            return f14109f;
        }
        if (select == 4) {
            return g;
        }
        throw new AssertionError();
    }

    public static String c(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = l(str, 0, str.length());
            } else {
                inetAddress = l(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return x(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !i(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int d(String str, long j2, TimeUnit timeUnit) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void g(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!z(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] h(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    private static boolean i(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int j(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    private static boolean k(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char charAt = str.charAt(i6);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i6++;
                }
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        if (i5 != i4 + 4) {
            return false;
        }
        return true;
    }

    @Nullable
    private static InetAddress l(String str, int i2, int i3) {
        byte[] bArr = new byte[16];
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            if (i2 >= i3) {
                break;
            } else if (i4 == 16) {
                return null;
            } else {
                int i7 = i2 + 2;
                if (i7 > i3 || !str.regionMatches(i2, "::", 0, 2)) {
                    if (i4 != 0) {
                        if (str.regionMatches(i2, ":", 0, 1)) {
                            i2++;
                        } else if (!str.regionMatches(i2, ".", 0, 1) || !k(str, i6, i3, bArr, i4 - 2)) {
                            return null;
                        } else {
                            i4 += 2;
                        }
                    }
                    i6 = i2;
                } else if (i5 != -1) {
                    return null;
                } else {
                    i4 += 2;
                    i5 = i4;
                    if (i7 == i3) {
                        break;
                    }
                    i6 = i7;
                }
                i2 = i6;
                int i8 = 0;
                while (i2 < i3) {
                    int j2 = j(str.charAt(i2));
                    if (j2 == -1) {
                        break;
                    }
                    i8 = (i8 << 4) + j2;
                    i2++;
                }
                int i9 = i2 - i6;
                if (i9 == 0 || i9 > 4) {
                    return null;
                }
                int i10 = i4 + 1;
                bArr[i4] = (byte) ((i8 >>> 8) & 255);
                i4 = i10 + 1;
                bArr[i10] = (byte) (i8 & 255);
            }
        }
        if (i4 != 16) {
            if (i5 == -1) {
                return null;
            }
            int i11 = i4 - i5;
            System.arraycopy(bArr, i5, bArr, 16 - i11, i11);
            Arrays.fill(bArr, i5, (16 - i4) + i5, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int m(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int n(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean o(Source source, int i2, TimeUnit timeUnit) {
        try {
            return E(source, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String q(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    public static String r(z zVar, boolean z) {
        String str;
        if (zVar.m().contains(":")) {
            str = "[" + zVar.m() + "]";
        } else {
            str = zVar.m();
        }
        if (!z && zVar.z() == z.e(zVar.E())) {
            return str;
        }
        return str + ":" + zVar.z();
    }

    public static <T> List<T> s(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> t(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> u(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int v(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int w(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    private static String x(byte[] bArr) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i3 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        Buffer buffer = new Buffer();
        while (i2 < bArr.length) {
            if (i2 == i3) {
                buffer.writeByte(58);
                i2 += i5;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((long) (((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255)));
                i2 += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static String[] y(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean z(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
