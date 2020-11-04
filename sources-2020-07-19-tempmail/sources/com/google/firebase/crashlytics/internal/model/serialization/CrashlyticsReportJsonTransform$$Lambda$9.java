package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: CrashlyticsReportJsonTransform */
final /* synthetic */ class CrashlyticsReportJsonTransform$$Lambda$9 implements CrashlyticsReportJsonTransform.ObjectParser {
    private static final CrashlyticsReportJsonTransform$$Lambda$9 instance = new CrashlyticsReportJsonTransform$$Lambda$9();

    private CrashlyticsReportJsonTransform$$Lambda$9() {
    }

    public static CrashlyticsReportJsonTransform.ObjectParser lambdaFactory$() {
        return instance;
    }

    public Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}
