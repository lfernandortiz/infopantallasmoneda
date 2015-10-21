package com.monedafrontera.factory;

import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.monedafrontera.dto.Dolartoday;
import com.monedafrontera.jdbc.DolarTodayDeserializer;

public class Openexchangerates {

    public static Dolartoday getDolartoday2Object() {
        Dolartoday dolar = null;

        try {
            String url = "https://s3.amazonaws.com/dolartoday/data.json";

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Dolartoday.class, new DolarTodayDeserializer());
            Gson gson = gsonBuilder.create();
            dolar = gson.fromJson(IOUtils.toString(new URL(url)), Dolartoday.class);
            return dolar;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dolar;
    }
}
