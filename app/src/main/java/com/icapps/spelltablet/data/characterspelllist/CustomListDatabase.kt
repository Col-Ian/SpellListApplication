package com.icapps.spelltablet.data.characterspelllist

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CustomList::class],
    version = 1
)
abstract class CustomListDatabase:RoomDatabase() {
    abstract val dao: CustomListDao
}