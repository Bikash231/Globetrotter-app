package hu.bme.aut.mobwebo8f1l9.globetrotter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import hu.bme.aut.mobwebo8f1l9.globetrotter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        val KEY_NAME = "KEY_NAME"
        val KEY_PASSWORD = "KEY_PASSWORD"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCancel.setOnClickListener{
            binding.etPassword.setText("")
            binding.etUsername.setText("")
        }
        binding.btnLogin.setOnClickListener {
            if(binding.etUsername.text.toString() != ""){
                var intentDetails = Intent()
                intentDetails.setClass(this@MainActivity,
                    CountryListActivity::class.java)
                intentDetails.putExtra(KEY_NAME, binding.etUsername.text.toString())
                intentDetails.putExtra(KEY_PASSWORD, binding.etPassword.text.toString())
                startActivity(intentDetails)
            }
            else{
                binding.etUsername.error = getString(R.string.cannot_be_empty)

            }
        }
        /*val button = findViewById<Button>(R.id.btnCancel)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                findViewById<EditText>(R.id.etUsername).text.clear()
            }
        })

        val button2 = findViewById<Button>(R.id.btnLogin)
        button2.setOnClickListener((object : View.OnClickListener {
            override fun onClick(v: View?) {
                if(!findViewById<EditText>(R.id.etUsername).text.isEmpty()){
                    val intent = Intent(this@MainActivity, CountryListActivity::class.java)
                    startActivity(intent)
                    intent.putExtra(KEY_NAME, binding.etUsername.text.toString())
                    intent.putExtra(KEY_PASSWORD, binding.etPassword.text.toString())
                }
            }
        }))*/
    }


}





