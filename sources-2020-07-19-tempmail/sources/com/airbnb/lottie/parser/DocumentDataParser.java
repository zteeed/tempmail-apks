package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tempmail.s.j;
import java.io.IOException;

public class DocumentDataParser implements ValueParser<DocumentData> {
    public static final DocumentDataParser INSTANCE = new DocumentDataParser();
    private static final JsonReader.Options NAMES = JsonReader.Options.of("t", "f", "s", j.g, "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private DocumentDataParser() {
    }

    public DocumentData parse(JsonReader jsonReader, float f2) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f3 = 0.0f;
        int i = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f6 = 0.0f;
        boolean z = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= DocumentData.Justification.CENTER.ordinal() && nextInt >= 0) {
                        justification2 = DocumentData.Justification.values()[nextInt];
                        break;
                    } else {
                        justification2 = DocumentData.Justification.CENTER;
                        break;
                    }
                case 4:
                    i = jsonReader.nextInt();
                    break;
                case 5:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    i2 = JsonUtils.jsonToColor(jsonReader);
                    break;
                case 8:
                    i3 = JsonUtils.jsonToColor(jsonReader);
                    break;
                case 9:
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        JsonReader jsonReader2 = jsonReader;
        jsonReader.endObject();
        return new DocumentData(str, str2, f3, justification2, i, f4, f5, i2, i3, f6, z);
    }
}
