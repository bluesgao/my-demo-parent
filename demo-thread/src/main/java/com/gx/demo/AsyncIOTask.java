package com.gx.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 自定义的异步IO任务
 *
 * @author Will
 */
class AsyncIOTask implements Runnable {

    public void run() {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        try {
            String getURL = "http://baidu.com";
            ;
            ;
            URL getUrl = new URL(getURL);

            connection = (HttpURLConnection) getUrl.openConnection();
            connection.connect();
            reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("line:"+line);
            }
        } catch (IOException e) {

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {

                }
            }
            connection.disconnect();
        }

    }

}
