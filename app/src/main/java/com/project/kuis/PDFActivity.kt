package com.project.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_pdf.*

class PDFActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
        val numberPdf = intent.getIntExtra("noMateri", 0)
        if (numberPdf.equals(1)) {
            loadPdf("pengertianperusahaan.pdf")
        } else if (numberPdf.equals(2)) {
            loadPdf("karakteristik.pdf")

        } else if (numberPdf.equals(3)) {
            loadPdf("siklusakutansi.pdf")
        } else if (numberPdf.equals(4)) {
            loadPdf("jenistransaksi.pdf")
        }
        else if (numberPdf.equals(5)){
            loadPdf("contohsoal.pdf")
        }

    }

    fun loadPdf(asset: String) {
        pdfViewer.fromAsset(asset)
            .enableSwipe(true)
            .enableDoubletap(true)
            .swipeVertical(true)
            .defaultPage(1)
            .showMinimap(true)
            .enableAnnotationRendering(false)
            .password(null)
            .showPageWithAnimation(true)
            .load();
    }
}
