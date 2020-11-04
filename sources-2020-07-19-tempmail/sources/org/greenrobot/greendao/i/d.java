package org.greenrobot.greendao.i;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.f;

/* compiled from: SqlUtils */
public class d {
    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static StringBuilder a(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder c(StringBuilder sb, String str, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            b(sb, str, strArr[i]);
            if (i < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder d(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder e(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            b(sb, str, strArr[i]);
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder f(StringBuilder sb, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            a(sb, strArr[i]);
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static StringBuilder h(StringBuilder sb, String str, f fVar) {
        if (str != null) {
            sb.append(str);
            sb.append('.');
        }
        sb.append('\"');
        sb.append(fVar.f14513e);
        sb.append('\"');
        return sb;
    }

    public static String i(String str, String[] strArr) {
        String str2 = '\"' + str + '\"';
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str2);
        if (strArr != null && strArr.length > 0) {
            sb.append(" WHERE ");
            e(sb, str2, strArr);
        }
        return sb.toString();
    }

    public static String j(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('\"');
        sb.append(str2);
        sb.append('\"');
        sb.append(" (");
        d(sb, strArr);
        sb.append(") VALUES (");
        g(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static String k(String str, String str2, String[] strArr, boolean z) {
        if (str2 == null || str2.length() < 0) {
            throw new DaoException("Table alias required");
        }
        StringBuilder sb = new StringBuilder(z ? "SELECT DISTINCT " : "SELECT ");
        c(sb, str2, strArr);
        sb.append(" FROM ");
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        sb.append(' ');
        sb.append(str2);
        sb.append(' ');
        return sb.toString();
    }

    public static String l(String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT COUNT(*) FROM ");
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        sb.append(' ');
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static String m(String str, String[] strArr, String[] strArr2) {
        String str2 = '\"' + str + '\"';
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str2);
        sb.append(" SET ");
        f(sb, strArr);
        sb.append(" WHERE ");
        e(sb, str2, strArr2);
        return sb.toString();
    }
}
