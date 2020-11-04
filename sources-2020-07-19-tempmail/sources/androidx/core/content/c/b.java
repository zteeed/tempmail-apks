package androidx.core.content.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f1310a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f1311b;

    /* renamed from: c  reason: collision with root package name */
    private int f1312c;

    private b(Shader shader, ColorStateList colorStateList, int i) {
        this.f1310a = shader;
        this.f1311b = colorStateList;
        this.f1312c = i;
    }

    private static b a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c2 = 0;
                }
            } else if (name.equals("gradient")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return c(a.b(resources, xml, asAttributeSet, theme));
            }
            if (c2 == 1) {
                return d(d.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static b b(int i) {
        return new b((Shader) null, (ColorStateList) null, i);
    }

    static b c(ColorStateList colorStateList) {
        return new b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    static b d(Shader shader) {
        return new b(shader, (ColorStateList) null, 0);
    }

    public static b g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    public int e() {
        return this.f1312c;
    }

    public Shader f() {
        return this.f1310a;
    }

    public boolean h() {
        return this.f1310a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1311b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f1310a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f1311b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.b.i():boolean");
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f1311b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1312c) {
                this.f1312c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i) {
        this.f1312c = i;
    }

    public boolean l() {
        return h() || this.f1312c != 0;
    }
}
