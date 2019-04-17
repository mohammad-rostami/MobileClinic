package ir.uncode.course.app.ilness_diagnosis;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;


public class G extends Application {

    public static LayoutInflater    layoutInflater;
    public static Context           context;
    static SQLiteDatabase           database;
    public static Activity          currentActivity;
    public static SharedPreferences preferences;


    @Override
    public void onCreate() {
        super.onCreate();

        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        context = getApplicationContext();
        preferences = PreferenceManager.getDefaultSharedPreferences(context);

        String DB_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
        String DIR_DATABASE = DB_PATH + "/database/";
        String DB_NAME = "illness.sqlite";
        String myPath = DIR_DATABASE + DB_NAME;
        if (myPath != DIR_DATABASE + DB_NAME) {
            String Path = Environment.getExternalStorageDirectory().getPath().toString() + "/";
            System.out.println("Path  : " + Path);
            String folder_main = "database";
            File f = new File(Environment.getExternalStorageDirectory(), folder_main);
            if ( !f.exists()) {
                f.mkdirs();
            }
            copyDatabase();
        }

        database = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);

    }


    private void copyDatabase() {
        AssetManager assetManager = getAssets();
        String[] files = null;
        try {
            files = assetManager.list("database");
        }
        catch (Exception e) {
            Log.e("Tag", e.getMessage());
        }
        for (String fileName: files) {
            System.out.println("database=>" + fileName);
            InputStream in = null;
            OutputStream out = null;
            try {
                in = assetManager.open("database/" + fileName);
                out = new FileOutputStream(Environment.getExternalStorageDirectory().toString() + "/database/" + fileName);
                CopyFiles(in, out);
                in.close();
                in = null;
                out.flush();
                out.close();
                out = null;
            }
            catch (Exception e) {
                Log.e("Tag", e.getMessage());
            }
        }
    }


    public Object getWindowManager() {
        // TODO Auto-generated method stub
        return null;
    }


    private void CopyFiles(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }

}
