package com.example.firebase_auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class MainActivity : AppCompatActivity() {
    lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth

//        var email = edit_email.text
//        var password = edit_password.text
//        info_user.setText("email: $email /n password: $password")
        btn_signOut.setOnClickListener {
            Firebase.auth.signOut()
            var i = Intent(this,SignInAstivity::class.java)
            startActivity(i)
        }
    }
}