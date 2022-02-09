package com.github.fancy.exchange.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fancy.exchange.model.FixerApi;
import org.springframework.boot.json.JacksonJsonParser;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class JsonReader {

    private static String readAll(Reader reader) throws IOException {
        StringBuilder builder = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            builder.append((char)i);
        }
        return builder.toString();
    }

    public static FixerApi readJsonFromUrl(String url) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FixerApi fixerApi;
        InputStream stream = new URL(url).openStream();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, Charset.forName("UTF-8"))))
        {
            String jsonString = readAll(reader);
            mapper.readValue(jsonString, FixerApi.class);
            fixerApi = mapper.readValue(jsonString, FixerApi.class);
        }
        return fixerApi;
    }
}
