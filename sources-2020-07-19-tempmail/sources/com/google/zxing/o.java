package com.google.zxing;

import com.google.zxing.t.m.a;

/* compiled from: ResultPoint */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final float f11697a;

    /* renamed from: b  reason: collision with root package name */
    private final float f11698b;

    public o(float f2, float f3) {
        this.f11697a = f2;
        this.f11698b = f3;
    }

    private static float a(o oVar, o oVar2, o oVar3) {
        float f2 = oVar2.f11697a;
        float f3 = oVar2.f11698b;
        return ((oVar3.f11697a - f2) * (oVar.f11698b - f3)) - ((oVar3.f11698b - f3) * (oVar.f11697a - f2));
    }

    public static float b(o oVar, o oVar2) {
        return a.a(oVar.f11697a, oVar.f11698b, oVar2.f11697a, oVar2.f11698b);
    }

    public static void e(o[] oVarArr) {
        o oVar;
        o oVar2;
        o oVar3;
        float b2 = b(oVarArr[0], oVarArr[1]);
        float b3 = b(oVarArr[1], oVarArr[2]);
        float b4 = b(oVarArr[0], oVarArr[2]);
        if (b3 >= b2 && b3 >= b4) {
            oVar3 = oVarArr[0];
            oVar2 = oVarArr[1];
            oVar = oVarArr[2];
        } else if (b4 < b3 || b4 < b2) {
            oVar3 = oVarArr[2];
            oVar2 = oVarArr[0];
            oVar = oVarArr[1];
        } else {
            oVar3 = oVarArr[1];
            oVar2 = oVarArr[0];
            oVar = oVarArr[2];
        }
        if (a(oVar2, oVar3, oVar) < 0.0f) {
            o oVar4 = oVar;
            oVar = oVar2;
            oVar2 = oVar4;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar3;
        oVarArr[2] = oVar;
    }

    public final float c() {
        return this.f11697a;
    }

    public final float d() {
        return this.f11698b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f11697a == oVar.f11697a && this.f11698b == oVar.f11698b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f11697a) * 31) + Float.floatToIntBits(this.f11698b);
    }

    public final String toString() {
        return "(" + this.f11697a + ',' + this.f11698b + ')';
    }
}
