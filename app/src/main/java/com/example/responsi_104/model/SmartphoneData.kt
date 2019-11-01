package com.example.responsi_104.model

import com.example.responsi_104.R

object SmartphoneData {
    private val smartphoneName= arrayOf(
        "IPHONE 5",
        "IPHONE 5c",
        "IPHONE 5s",
        "IPHONE 5SE",
        "IPHONE 6",
        "IPHONE 6S",
        "IPHONE 7",
        "IPHONE 7+",
        "IPHONE 8",
        "IPHONE 8+"
    )
    private val detail = arrayOf(
        "Produk IPHONE Pertama",
        "Produk IPHONE Kedua",
        "Produk IPHONE Ketiga",
        "Produk IPHONE Keempat",
        "Produk IPHONE Kelima",
        "Produk IPHONE Keenam",
        "Produk IPHONE Ketujuh",
        "Produk IPHONE Kedelapan",
        "Produk IPHONE Kesembilan",
        "Produk IPHONE Kesepuluh"

    )
    private val smartphonePoster= intArrayOf(
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone,
        R.drawable.iphone
    )
    val listSmartphone: ArrayList<Smartphone>
        get() {
            val list = arrayListOf<Smartphone>()
            for (position in smartphoneName.indices) {
                val smartphone = Smartphone()
                smartphone.name = smartphoneName[position]
                smartphone.detail = detail[position]
                smartphone.poster = smartphonePoster[position]
                list.add(smartphone)
            }
            return list
        }
}