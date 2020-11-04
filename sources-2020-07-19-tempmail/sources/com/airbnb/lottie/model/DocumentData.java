package com.airbnb.lottie.model;

public class DocumentData {
    public final float baselineShift;
    public final int color;
    public final String fontName;
    public final Justification justification;
    public final float lineHeight;
    public final float size;
    public final int strokeColor;
    public final boolean strokeOverFill;
    public final float strokeWidth;
    public final String text;
    public final int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f2, Justification justification2, int i, float f3, float f4, int i2, int i3, float f5, boolean z) {
        this.text = str;
        this.fontName = str2;
        this.size = f2;
        this.justification = justification2;
        this.tracking = i;
        this.lineHeight = f3;
        this.baselineShift = f4;
        this.color = i2;
        this.strokeColor = i3;
        this.strokeWidth = f5;
        this.strokeOverFill = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.text.hashCode() * 31) + this.fontName.hashCode()) * 31)) + this.size)) * 31) + this.justification.ordinal()) * 31) + this.tracking;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.lineHeight);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.color;
    }
}