package com.trinia.web;

import java.util.List;

import com.trinia.Reference;
import com.trinia.TriniaMod;
/**
 * @author Magik
 */
public class UpdateChecker extends Thread
{
    public Update update;

    public void run()
    {
        boolean isNewUpdateAvailable = false;

        try
        {
            List<String> text = WebHelper.readPastebinAsList("2S1J1bXs");

            String version = text.get(0).split("\\:")[1];
            Version newestVersion = new Version(version);
            Version currentVersion = new Version(Reference.VERSION);

            if (newestVersion.compareTo(currentVersion) == 1)
            {
                isNewUpdateAvailable = true;
                update = new Update(isNewUpdateAvailable, version, text.get(1).split("\\:")[1]);
            }
            else
            {
                isNewUpdateAvailable = false;
            }
        }
        catch (Exception e)
        {
            System.err.println("[Trinia Mod] Failed to read mod version! Please make sure you have a stable Internet Connection!");
            e.printStackTrace();
        }

        if (update == null)
        {
            update = new Update();
        }

        TriniaMod.latestUpdate = update;
    }

    public void handleUpdates()
    {
        start();
    }
}
