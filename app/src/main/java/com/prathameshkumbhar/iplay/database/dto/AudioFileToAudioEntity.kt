package com.prathameshkumbhar.iplay.database.dto

import com.prathameshkumbhar.iplay.database.entity.AudioEntity
import com.prathameshkumbhar.iplay.database.model.AudioFile

fun AudioFile.toAudioEntity(): AudioEntity {
    return AudioEntity(
        id = this.id,
        songTitle = this.songTitle,
        audioFileId = this.audioFileId.toString(),
        imageFileName = this.imageFileName,
        progress = 0f,
        isDownloaded = this.isDownloaded,
        isAutoSyncComplete = false,
        filePath = "",
        currentPosition = 0L
    )
}