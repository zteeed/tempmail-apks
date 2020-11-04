package com.airbnb.lottie.parser;

import a.e.d;
import a.e.h;
import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.tempmail.utils.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottieCompositionMoshiParser {
    static JsonReader.Options ASSETS_NAMES = JsonReader.Options.of("id", "layers", w.f12590a, "h", "p", "u");
    private static final JsonReader.Options FONT_NAMES = JsonReader.Options.of("list");
    private static final JsonReader.Options MARKER_NAMES = JsonReader.Options.of("cm", "tm", "dr");
    private static final JsonReader.Options NAMES = JsonReader.Options.of(w.f12590a, "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    public static LottieComposition parse(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float dpScale = Utils.dpScale();
        d dVar = new d();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        h hVar = new h();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.beginObject();
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader2.selectName(NAMES)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = jsonReader.nextInt();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = jsonReader.nextInt();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!Utils.isAtLeastVersion(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    parseLayers(jsonReader2, lottieComposition, arrayList2, dVar);
                    break;
                case 7:
                    parseAssets(jsonReader2, lottieComposition, hashMap2, hashMap3);
                    break;
                case 8:
                    parseFonts(jsonReader2, hashMap4);
                    break;
                case 9:
                    parseChars(jsonReader2, lottieComposition, hVar);
                    break;
                case 10:
                    parseMarkers(jsonReader2, lottieComposition, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        ArrayList arrayList7 = arrayList3;
        lottieComposition.init(new Rect(0, 0, (int) (((float) i) * dpScale), (int) (((float) i2) * dpScale)), f2, f3, f4, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return lottieComposition;
    }

    private static void parseAssets(JsonReader jsonReader, LottieComposition lottieComposition, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            d dVar = new d();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(ASSETS_NAMES);
                if (selectName == 0) {
                    str = jsonReader.nextString();
                } else if (selectName == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        Layer parse = LayerParser.parse(jsonReader, lottieComposition);
                        dVar.n(parse.getId(), parse);
                        arrayList.add(parse);
                    }
                    jsonReader.endArray();
                } else if (selectName == 2) {
                    i = jsonReader.nextInt();
                } else if (selectName == 3) {
                    i2 = jsonReader.nextInt();
                } else if (selectName == 4) {
                    str2 = jsonReader.nextString();
                } else if (selectName != 5) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                LottieImageAsset lottieImageAsset = new LottieImageAsset(i, i2, str, str2, str3);
                map2.put(lottieImageAsset.getId(), lottieImageAsset);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void parseChars(JsonReader jsonReader, LottieComposition lottieComposition, h<FontCharacter> hVar) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            FontCharacter parse = FontCharacterParser.parse(jsonReader, lottieComposition);
            hVar.l(parse.hashCode(), parse);
        }
        jsonReader.endArray();
    }

    private static void parseFonts(JsonReader jsonReader, Map<String, Font> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(FONT_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    Font parse = FontParser.parse(jsonReader);
                    map.put(parse.getName(), parse);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void parseLayers(JsonReader jsonReader, LottieComposition lottieComposition, List<Layer> list, d<Layer> dVar) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
            if (parse.getLayerType() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(parse);
            dVar.n(parse.getId(), parse);
            if (i > 4) {
                Logger.warning("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    private static void parseMarkers(JsonReader jsonReader, LottieComposition lottieComposition, List<Marker> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            jsonReader.beginObject();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(MARKER_NAMES);
                if (selectName == 0) {
                    str = jsonReader.nextString();
                } else if (selectName == 1) {
                    f2 = (float) jsonReader.nextDouble();
                } else if (selectName != 2) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    f3 = (float) jsonReader.nextDouble();
                }
            }
            jsonReader.endObject();
            list.add(new Marker(str, f2, f3));
        }
        jsonReader.endArray();
    }
}
