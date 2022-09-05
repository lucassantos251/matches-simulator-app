package me.dio.simulator.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import me.dio.simulator.databinding.ActivityDetailBinding
import me.dio.simulator.domain.Match

class DetailActivity : AppCompatActivity() {

    object Extras {
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFromExtra()
    }

    private fun loadMatchFromExtra() {
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let {
            Glide.with(this).load(it.place.image).into(binding.ivPlace)
            supportActionBar?.title = it.place.name

            binding.tvDescription.text = it.description

            Glide.with(this).load(it.runner1.image).into(binding.ivRunner1)
            Glide.with(this).load(it.runner2.image).into(binding.ivRunner2)

            binding.tvRunnerName1.text = it.runner1.name
            binding.tvRunnerName2.text = it.runner2.name

            binding.rbRunnerStars1.rating = it.runner1.stars.toFloat()
            binding.rbRunnerStars2.rating = it.runner2.stars.toFloat()

            if(it.runner1.score != null) {
                binding.tvRunnerScore1.text = it.runner1.score.toString()
            }

            if(it.runner2.score != null) {
                binding.tvRunnerScore2.text = it.runner2.score.toString()
            }

        }
    }
}