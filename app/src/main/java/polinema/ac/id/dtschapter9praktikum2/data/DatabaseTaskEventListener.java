package polinema.ac.id.dtschapter9praktikum2.data;

import android.arch.persistence.room.RoomDatabase;

public interface DatabaseTaskEventListener {
    Object runDatabaseOperation(RoomDatabase database, Object... params);
    void onDatabaseOperationFinished(Object... results);
}
