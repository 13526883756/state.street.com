package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;
import org.json.JSONObject;
import org.mortbay.util.ajax.JSON;

import java.util.*;

public class StringTrimTOJson {
    public static void main(String[] args) {
        String jsonStr =
                "{" +
                        "\"key1 \" :  1101,\" key2\" :\"value2\"" +
                        ",\"key3 \" :\"   value3  \",\" key4\" :\"value4\"" +
                        ",\"key5 \" :\"value5\",\" key6 \" :\"value6\"" +
                        ",\"key7 \" :\"value7\",\" key8\" :\"value8\"" +
                        ",\"key9 \" :null,\" key10\" :\"null\"" +
                        "}";

        System.out.println("--->jsonStr=:" + jsonStr);

        Gson gson = new GsonBuilder().create();
        String s = gson.toJson(jsonStr);

        Object gson1 = gson.fromJson(s, jsonStr.getClass());
        System.out.println(gson1);

        org.json.JSONObject oldJson = new org.json.JSONObject(jsonStr);
        JSONObject newJson = new JSONObject();
        Iterator<String> keys = oldJson.keys();
        List list = new ArrayList();
        while (keys.hasNext()) {
            String key = keys.next();
            list.add(key.trim());
            newJson.put(key.trim(), oldJson.get(key));
        }
        System.out.println("----------->" + newJson);

        jsonStr = jsonStr.substring(1, jsonStr.length() - 1);
        String newStr = "";
        for (String key : jsonStr.split(",")) {
            String[] strings = key.split(":");
            String keyThis = strings[0].replaceAll("\"", "").trim();
            if (list.contains(keyThis)) {
                if (newJson.get(keyThis).getClass().equals(String.class)) {
                    newStr = newStr + "\"" + keyThis + "\":" + newJson.get(keyThis) + "\",";

                } else {
                    newStr = newStr + "\"" + keyThis + "\":" + newJson.get(keyThis) + ",";
                    System.out.println(newStr);
                }
            }

        }
        newStr = "{" + newStr.substring(0, newStr.length() - 1) + "}";
        System.out.println(newStr);

    }
}
