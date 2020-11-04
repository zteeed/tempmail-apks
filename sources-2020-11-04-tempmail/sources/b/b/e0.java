package b.b;

import java.security.MessageDigest;
import java.util.Formatter;

final class e0 {
    public static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return b(instance.digest());
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            e.b(sb.toString(), e2);
            return null;
        }
    }

    private static String b(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public static String c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            e.b(sb.toString(), e2);
            return null;
        }
    }

    public static String d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return b(instance.digest());
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            e.b(sb.toString(), e2);
            return null;
        }
    }
}
