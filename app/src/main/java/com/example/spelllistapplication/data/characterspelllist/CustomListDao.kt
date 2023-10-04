package com.example.spelllistapplication.data.characterspelllist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface CustomListDao {
    @Upsert
    suspend fun upsertSpell(customList:CustomList)

    @Delete
    suspend fun deleteSpell(customList: CustomList)

    @Query(
        """
       SELECT * FROM customlist WHERE characterFk=:characterId AND spellLevel=:spellLevel
       ORDER BY spellTitle ASC
    """
    )
    fun getSpellByCharacterAndLevel(characterId:Int, spellLevel:Int):Flow<List<CustomList>>

    @Query("SELECT * FROM customlist ORDER BY spellTitle ASC")
    fun getSpellsOrderedByName():Flow<List<CustomList>>
}