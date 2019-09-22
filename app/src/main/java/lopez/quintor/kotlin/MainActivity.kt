package lopez.quintor.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar.setOnClickListener{

            val user = etNombre.text.toString()
            val pass = etPass.text.toString()

            if (user.equals("") or pass.equals("")){
                mensaje("Datos Vacios",Toast.LENGTH_LONG)
            }else{
                if(user.equals("francisco") and pass.equals("1234")){
                    val i = Intent (this,SegundaActivity::class.java)
                    i.putExtra("nombre", "francisco")
                    startActivity(i)
                }else{
                    mensaje("No te conozco")
                }
            }

        }
    }

    override fun onStart() {
        super.onStart()
        Log.wtf("ejemplo", "Debo estar en el onStart")
    }
    fun mensaje(mensaje:String,dur:Int=Toast.LENGTH_LONG){
        Toast.makeText(this,mensaje,dur).show()
    }
}
