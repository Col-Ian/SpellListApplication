package com.icapps.spelltablet.data.characterdata

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao{

    @Upsert
    suspend fun upsertCharacter(character: Character)

    @Delete
    suspend fun deleteCharacter(character: Character)

    // Sorting options if needed later
    @Query("SELECT * FROM character ORDER BY characterName COLLATE NOCASE ASC")
    fun getCharactersOrderedByName(): Flow<List<Character>>
}