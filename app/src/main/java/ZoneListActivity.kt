import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment.R
import com.example.silentzonedetector.Zone
import com.example.silentzonedetector.ZoneAdapter

class ZoneListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zone_list)

        val rv = findViewById<RecyclerView>(R.id.rvZones)
        rv.layoutManager = LinearLayoutManager(this)

        // Demo placeholder data (replace with your saved zones later)
        val demo = listOf(
            Zone(1, "Library", 120, 23.000, 72.000),
            Zone(2, "Lab", 80, 23.005, 72.004)
        )
        val adapter = ZoneAdapter(demo.toMutableList(), {}, {})
        rv.adapter = adapter

        Toast.makeText(this, "Long-press to delete, tap to edit (demo)", Toast.LENGTH_SHORT).show()
    }
}
