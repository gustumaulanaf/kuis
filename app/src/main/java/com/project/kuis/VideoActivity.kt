package com.project.kuis

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.MediaController
import androidx.core.net.toUri
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        val numberVideo = intent.getIntExtra("noVideo", 0)
        var path: String?=null
        if (numberVideo.equals(1)) {
            path= "android.resource://" + getPackageName() + "/" + R.raw.video1
        } else if (numberVideo.equals(2)) {
            path = "android.resource://" + getPackageName() + "/" + R.raw.video2

        } else if (numberVideo.equals(3)) {
            path = "android.resource://" + getPackageName() + "/" + R.raw.video3
        }
        title = "Video"
        val mediaController = MediaController(this)
        videoPlayer.setMediaController(mediaController)
        videoPlayer.setVideoURI(path!!.toUri())
        videoPlayer.start()
    }
}
