import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static java.lang.String.*;

public class DbHelper extends SQLiteOpenHelper
{
    public static final String DB_NAME = "";
    public static final int DB_VERSION = 1;

    public DbHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        StringBuilder sb = new StringBuilder();

        sb.append(format("CREATE TABLE %s", ));
        sb.append(" (");
        sb.append(format("%s INTEGER PRIMARY KEY AUTOINCREMENT,", ._ID));
        sb.append(format("%s TEXT NOT NULL,", ));
        sb.append(format("%s INTEGER NOT NULL,", ));
        sb.append(format("%s REAL NOT NULL,", ));
        sb.append(");");
        
        // sb.append(format("CONSTRAINT UNIQUE (%s)", NYSExchangeEntry.COL_SYMBOL));

        db.execSQL(sb.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(format("DROP TABLE IF EXISTS %s ", .TABLE_NAME));
    }
}
