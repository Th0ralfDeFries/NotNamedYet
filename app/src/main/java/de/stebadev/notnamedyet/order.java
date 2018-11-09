package de.stebadev.notnamedyet;

import android.arch.persistence.room.*;
import java.util.Date;

@Entity(tableName = "orders")
public class order {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "orderid")
    private long id;

    @ColumnInfo(name = "datetime")
    private Date dateTime;


}