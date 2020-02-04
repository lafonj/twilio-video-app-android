package com.twilio.video.app.videosdk

import com.twilio.video.Room

data class RoomViewState(
        val isConnecting: Boolean = false,
        val isConnected: Boolean = false,
        val isDisconnected: Boolean = true,
        val isConnectFailure: Boolean = false,
        val isLocalAudioMuted: Boolean = false,
        val isSpeakerPhoneMuted: Boolean = false,
        val isScreenShared: Boolean = false,
        val room: Room? = null
)