package com.uty.listviewicon.model

import com.uty.listviewicon.R

object PirateData {
        private val pirateName = arrayOf(
            "Monkey D.Luffy",
            "Roronoa Zoro",
            "Ussop",
            "Nami",
            "Vinsmoke Sanji",
            "Tony Tony Chopper",
            "Nico Robin",
            "Franky",
            "Brook",
            "Jimbe"
        )

        private val detail = arrayOf(
            "Sang Kapten, Luffy juga termasuk dalam kategori bajak laut pendatang baru dari generasi terburuk Sebelas Supernova ",
            "Sebelum menjadi bajak laut, ia lebih dahulu dikenal sebagai pemburu bajak laut. Wakil kapten dari kelompok Bajak Laut Topi Jerami ini juga termasuk salah satu dari Sebelas Supernova.",
            "Sang Penembak Jitu ini meski termasuk anggota trio terlemah dalam kelompok, kehadirannya malah sering membawa kemenangan bagi kelompok Topi Jerami.",
            "Seorang Navigator dalam kelompok. Ia juga dikenal sebagai Si Kucing Pencuri. Salah satu dari trio terlemah selain Usopp dan Chopper.",
            "Sebagi juru masak, Sanji bukan termasuk yang terlemah. Si Kaki Hitam malah menjadi yang paling diharapkan dalam bertarung setelah Luffy dan Zoro.",
            "Dokter kru Mugiwara ini lebih dikenal sebagai hewan peliharaan dan bukan merupakan ancaman bagi Pemerintah Dunia. Padahal, perannya juga termasuk vital dalam kelompok.",
            "Sudah menjadi ancaman pemerintah dunia karena kemampuannya dalam menerjemahkan Poneglyphs. Sejak berusia muda ia sudah dihargai 79 juta Berries baik ditangkap hidup ataupun mati.",
            "seorang ahli perkapalan sekaligus mekanik di Bajak Laut Topi Jerami. Ia juga merupakan orang yang membuat kapal Thousand Sunny",
            "Seorang pemusik, nilai buronan Brook sudah lebih dulu dipublikasikan Pemerintah Dunia sebelum resmi menjadi anggota bajak laut Luffy.",
            "Mantan anggota Shichibukai yang berjanji akan bergabung suatu hari nanti di kelompok bajak laut ini dan akhir nya jadi kenyataan"
        )

        private val piratePoster = intArrayOf(
            R.drawable.pirate1,
            R.drawable.pirate2,
            R.drawable.pirate3,
            R.drawable.pirate4,
            R.drawable.pirate5,
            R.drawable.pirate6,
            R.drawable.pirate7,
            R.drawable.pirate8,
            R.drawable.pirate9,
            R.drawable.pirate10
        )

        val listPirate: ArrayList<Pirate>
        get() {
            val list = arrayListOf<Pirate>()
            for (position in pirateName.indices) {
                val pirate = Pirate()
                pirate.name = pirateName[position]
                pirate.detail = detail[position]
                pirate.poster = piratePoster[position]
                list.add(pirate)
            }
            return list
        }
    }