package com.example.contactpage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
    import com.example.contactpage.databinding.ContactListInfoBinding
class ContactAdapter(var ContactList:List<ContactInfo>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListInfoBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.ivAvatar.tag= currentContact.avatar
        binding.tvDisplayName.text=currentContact.displayName
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmail.text =currentContact.email
    }
}
class ContactViewHolder( var binding:ContactListInfoBinding):ViewHolder(binding.root)
