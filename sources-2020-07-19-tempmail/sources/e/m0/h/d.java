package e.m0.h;

import e.m0.e;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: HttpDate */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f14125a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f14126b;

    /* renamed from: c  reason: collision with root package name */
    private static final DateFormat[] f14127c;

    /* compiled from: HttpDate */
    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(e.h);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f14126b = strArr;
        f14127c = new DateFormat[strArr.length];
    }

    public static String a(Date date) {
        return f14125a.get().format(date);
    }

    public static Date b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f14125a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f14126b) {
            int length = f14126b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f14127c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f14126b[i], Locale.US);
                    dateFormat.setTimeZone(e.h);
                    f14127c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
