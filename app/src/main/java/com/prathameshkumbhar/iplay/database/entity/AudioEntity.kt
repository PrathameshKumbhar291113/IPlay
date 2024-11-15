package com.prathameshkumbhar.iplay.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.prathameshkumbhar.iplay.utils.IPlayRoomDbConstants.AUDIO_TABLE

@Entity(tableName = AUDIO_TABLE)
data class AudioEntity(
    @PrimaryKey val id: Int,
    val songTitle: String,
    val audioFileId: String,
    val imageFileName: String,
    val progress: Float = 0f,
    val isDownloaded: Boolean,
    val isAutoSyncComplete: Boolean = false,
    val filePath: String? = null,
    val currentPosition: Long = 0L
)