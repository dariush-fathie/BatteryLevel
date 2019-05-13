package ir.riwi.batterylevelWave

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {
    lateinit var shimmer: ShimmerFrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressView = findViewById<WaveLoadingView>(R.id.progress)
        progressView.progressValue = 50
        progressView.setAnimDuration(1500)

        shimmer = findViewById(R.id.shimmer)
    }

    override fun onStart() {
        super.onStart()
        shimmer.startShimmer()
    }

    override fun onStop() {
        super.onStop()
        shimmer.stopShimmer()
    }

}
