package polinema.ac.id.dtschapter9praktikum2.data;

import android.arch.persistence.room.Room;
import android.content.Context;

public class AppDbProvider
{
    private static DTSAppDatabase asynchronousInstance;

    private static DTSAppDatabase instance;

    public static DTSAppDatabase getInstance(Context context)
    {
        if(AppDbProvider.instance == null)
        {
            AppDbProvider.instance = Room.databaseBuilder(
                    context, DTSAppDatabase.class, "dtsapp.db").allowMainThreadQueries().build();
        }

        return AppDbProvider.instance;
    }

    public static DTSAppDatabase getAsynchronousInstance(Context context)
    {
        if(AppDbProvider.asynchronousInstance == null)
        {
            AppDbProvider.asynchronousInstance = Room.databaseBuilder(
                    context, DTSAppDatabase.class, "dtsapp.db").build();
        }

        return AppDbProvider.asynchronousInstance;
    }
}
