package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class d4 {
    static String a(zzeg zzeg) {
        c4 c4Var = new c4(zzeg);
        StringBuilder sb = new StringBuilder(c4Var.a());
        for (int i = 0; i < c4Var.a(); i++) {
            byte f2 = c4Var.f(i);
            if (f2 == 34) {
                sb.append("\\\"");
            } else if (f2 == 39) {
                sb.append("\\'");
            } else if (f2 != 92) {
                switch (f2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (f2 >= 32 && f2 <= 126) {
                            sb.append((char) f2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((f2 >>> 6) & 3) + 48));
                            sb.append((char) (((f2 >>> 3) & 7) + 48));
                            sb.append((char) ((f2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
