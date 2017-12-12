package com.bubundas.smack

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.*

class SignupActivity : AppCompatActivity() {
    var profileimg = "profiledefault"
    var profileBackground = "[0.5, 0.5, 0.5, 1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
    fun rendomDpBtnClicked(view: View){
        val random = Random()
        val color = random.nextInt(2)
        val image = random.nextInt(28)
        if (color == 0){
            // Light Color
            profileimg = "light$color"
        } else {
            // Dark Color
            profileimg = "dark$image"
        }
        val resId = resources.getIdentifier(profileimg,"drawable", packageName)
        userAvatarImg.setImageResource(resId)
    }
    fun rendomColorBtnClicked(view: View){
        val random = Random()
        val r = random.nextInt(256)
        val g = random.nextInt(256)
        val b = random.nextInt(256)
        val storeR = r/255
        val storeG = g/255
        val storeB = b/255
        profileBackground = "[$storeR, $storeG, $storeB, 1]"
        userAvatarImg.setBackgroundColor(Color.rgb(r,g,b))
    }
}
