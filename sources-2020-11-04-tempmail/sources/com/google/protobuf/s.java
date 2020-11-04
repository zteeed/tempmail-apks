package com.google.protobuf;

/* compiled from: TextFormatEscaper */
final class s {

    /* compiled from: TextFormatEscaper */
    static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f12169a;

        a(d dVar) {
            this.f12169a = dVar;
        }

        public byte a(int i) {
            return this.f12169a.c(i);
        }

        public int size() {
            return this.f12169a.size();
        }
    }

    /* compiled from: TextFormatEscaper */
    private interface b {
        byte a(int i);

        int size();
    }

    static String a(d dVar) {
        return b(new a(dVar));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a2 = bVar.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
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
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(d.l(str));
    }
}
