import com.google.android.material.appbar.MaterialToolbar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<MaterialToolbar>(R.id.topbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Silent Zone Detector"  // force title to show
    }
}
