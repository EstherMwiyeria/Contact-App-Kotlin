package com.example.contactpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactpage.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1=ContactInfo(" ","Jemima","0721601652","gem@gmail.com")
        val contact2=ContactInfo(" ","Essy","07575197885","essy@gmail.com")
        val contact3=ContactInfo(" ","Diana","0706132130","Diana@gmail.com")
        val contact4=ContactInfo(" ","Anne","0714760390","Diana@gmail.com")
        val contact5=ContactInfo(" ","Liz","0726699826","Diana@gmail.com")
        val contact6=ContactInfo(" ","Marie","0729899826","Diana@gmail.com")


////        val contact1=ContactInfo("Angela","0789564352","angela@gmail.com")
////        val contact2=ContactInfo("Peter","0789554352","peter@gmail.com")
//        val contact3=ContactInfo("Alice","0782364352","alice@gmail.com")
//        val contact4=ContactInfo("Joyce","0756364352","joyce@gmail.com")
//        val contact5=ContactInfo("Paul","0782365352","paul@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter
    }
}