package com.google.protobuf;

import com.google.protobuf.i;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: MessageLiteToString */
final class o {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof d) {
                return obj.equals(d.f12105c);
            }
            if (obj instanceof m) {
                if (obj == ((m) obj).b()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    static final void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c2 : (List) obj) {
                c(sb, i, str, c2);
            }
            return;
        }
        sb.append(10);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(s.c((String) obj));
            sb.append('\"');
        } else if (obj instanceof d) {
            sb.append(": \"");
            sb.append(s.a((d) obj));
            sb.append('\"');
        } else if (obj instanceof i) {
            sb.append(" {");
            d((i) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    private static void d(m mVar, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : mVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            String replaceFirst2 = replaceFirst.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst2.endsWith("List") && !replaceFirst2.endsWith("OrBuilderList")) {
                String str = replaceFirst2.substring(0, 1).toLowerCase() + replaceFirst2.substring(1, replaceFirst2.length() - 4);
                Method method2 = (Method) hashMap.get("get" + replaceFirst2);
                if (method2 != null) {
                    c(sb, i, a(str), i.o(method2, mVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst2)) != null) {
                if (replaceFirst2.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst2.substring(0, replaceFirst2.length() - 5))) {
                    }
                }
                String str2 = replaceFirst2.substring(0, 1).toLowerCase() + replaceFirst2.substring(1);
                Method method3 = (Method) hashMap.get("get" + replaceFirst2);
                Method method4 = (Method) hashMap.get("has" + replaceFirst2);
                if (method3 != null) {
                    Object o = i.o(method3, mVar, new Object[0]);
                    if (method4 != null) {
                        z = ((Boolean) i.o(method4, mVar, new Object[0])).booleanValue();
                    } else if (b(o)) {
                        z = false;
                    }
                    if (z) {
                        c(sb, i, a(str2), o);
                    }
                }
            }
        }
        if (mVar instanceof i.e) {
            Iterator<Map.Entry<i.f, Object>> e2 = ((i.e) mVar).f12133d.e();
            while (e2.hasNext()) {
                Map.Entry next = e2.next();
                c(sb, i, "[" + ((i.f) next.getKey()).g() + "]", next.getValue());
            }
        }
        t tVar = ((i) mVar).f12126c;
        if (tVar != null) {
            tVar.j(sb, i);
        }
    }

    static String e(m mVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(mVar, sb, 0);
        return sb.toString();
    }
}
