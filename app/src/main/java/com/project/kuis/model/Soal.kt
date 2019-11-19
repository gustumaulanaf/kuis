package com.project.kuis.model

class Soal {
    var pertanyaan = arrayOf(
        "1. Dalam mempelajari akuntansi tidak lepas dari persamaan akuntansi. Rumus persamaan akuntansi adalah…",
        "2. Jenis laporan keuangan yang menyajikan informasi mengenai aktiva, kewajiban dan ekuitas perusahaan adalah…",
        "3. Unsur-unsur Laporan Keuangan yang berkaitan langsung dengan pengukuran kinerja keuangan perusahaan adalah…",
        "4. Penghasilan perusahaan Rp.20.000.000,- Beban usaha Rp.7.000.000,- Prive Rp.3.000.000,- Jika Modal Awal Rp.55.000.000,- maka modal akhir adalah…",
        "5. Dibayar biaya gaji Rp.1.500.000,- maka dicatat dalam jurnal umum sebagai berikut…",
        "6. Dibawah ini yang termasuk perkiraan nominal adalah…",
        "7. Harga perolehan bangunan Rp.100.000.000,- dengan nilai sisa Rp.20.000.000,- setelah 20 tahun, maka biaya penyusutan setahun jika dipakai metode garis lurus adalah…",
        "8. Berikut ini termasuk siklus Akuntansi, kecuali…",
        "9. Perusahaan yang membeli barang dan menjualnya kembali tanpa merubah bentuknya untuk memperoleh keuntungan disebut…",
        "10. Tanggal 1 Juni 2008 dibayar biaya sewa untuk 1 tahun Rp.1.200.000,- Jika pencatatan awal menggunakan metode Laba Rugi, maka jurnal penyesuaian tanggal 31 Desember 2008 adalah…",
        "11. Berikut ini adalah hal-hal yang terdapat dalam Laporan Perubahan Modal, kecuali…",
        "12. Perkiraan berikut adalah perkiraan yang ditutup ketika melakukan Jurnal Penutup, kecuali...",
        "13. Berikut ini adalah Bukti-Bukti transaksi, kecuali…",
        "14. Harta yang dimiliki oleh Perusahaan yang masa manfaatnya lebih dari 1 tahun atau satu Periode Akuntansi disebut…",
        "15. Perusahaan menjual barang dagangan sebesar Rp.1.500.000,- yang diterima tunai Rp.500.000,- dan sisanya diterima kemudian, maka jurnal yang dicatat perusahaan sebagai berikut…",
        "16. Istilah lain dari Reversing Entris adalah",
        "17. Jurnal Pembelian juga disebut dengan….",
        "18. Pada tanggan 20 januari membayar biaya telepon sebesar Rp 200.000 secara tunai. Maka jurnal yang dicatat yaitu…",
        "19. Apabila terjadi pembelian secara tunai, maka akan dicatat ke dalam jurnal….",
        "20. Franchises merupakan istilah lainnya dari…"
    )
    private val pilihanJawaban =
        arrayOf(
            //1
            arrayOf(
                "Harta = Modal + Biaya",
                "Harta = Modal + (Pendapatan – Biaya)",
                "Harta = Kewajiban + Modal",
                "Harta = Pendapatan – Biaya",
                "Harta = Modal + Pendapatan"
            ),
            //2
            arrayOf(
                "Neraca",
                "Laporan laba rugi",
                "Laporan perubahan laba di tahan",
                "Laporan perubahan modal",
                "Laporan arus kas"
            ),
            //3
            arrayOf(
                "Aktiva dan Penghasilan",
                "Penghasilan dan Beban",
                "Kewajiban dan Beban",
                "Aktiva, Kewajiban, dan Ekuitas",
                "Penghasilan, Beban, dan Ekuitas"
            ),
            //4
            arrayOf(
                "Rp. 65.000.000,-",
                "Rp. 45.000.000,-",
                "Rp. 79.000.000,-",
                "Rp. 55.000.000,-",
                "Rp. 50.000.000,-"
            ),
            //5
            arrayOf(
                "Kas \t\t\tRp. 1.500.000,-\n" +
                        "Biaya gaji \t\t\t\t\tRp. 1.500.000,-\n",
                "Biaya gaji \t\tRp. 5.100.000,-\n" +
                        "Kas \t\t\t\t\t\tRp. 5.100.000,-\n",
                "Biaya gaji \t\tRp. 1.500.000,\n" +
                        "Kas \t\t\t\t\t\tRp. 1.500.000,-\n",
                "Kas \t\t\tRp. 1.500.000,-\n" +
                        "Modal\t\t\t\t\t\t Rp. 1.500.000,-\n",
                "Prive\t\t\t Rp. 1.500.000,-\n" +
                        "Kas\t\t\t\t\t\t Rp. 1.500.000,-\n"
            ),
            //6
            arrayOf("Kas", "Pendapatan", "Kendaraan", "Piutang Usaha", "Modal"),
            //7
            arrayOf(
                "Rp. 8.000.000,-",
                "Rp. 6.000.000,-",
                "Rp. 4.000.000,-",
                "Rp. 3.000.000,-",
                "Rp. 10.000.000,-"
            ),
            //8
            arrayOf(
                "Mencatat dalam Jurnal Umum",
                "Menyajikan Laporan Keuangan",
                "Memposting kebuku besar",
                "Membuat Neraca Lajur",
                "Membuat Neraca Saldo"
            ),
            //9
            arrayOf(
                "Perusahaan Jasa",
                "Perusahaan Industri",
                "Perusahaan Dagang",
                "Perseroan Terbatas",
                "Koperasi"
            ),
            //10
            arrayOf(
                "Sewa di BM \t\t\t\tRp. 500.000,-\n" +
                        "\t\t\tBeban sewa \t\t\t\t\t\tRp. 500.000,-\n",
                "Beban sewa \t\t\t\tRp. 1.200.000,-\n" +
                        "\t\t\tKas\t\t\t\t\t\t\t Rp. 1.200.000,-\n",
                "Beban sewa \t\t\t\tRp. 700.000,-\n" +
                        "\t\t\tSewa dibayar di muka\t\t\t\t\t Rp. 700.000,-\n",
                "Kas \t\t\t\t\tRp. 1.200.000,-\n" +
                        "\t\t\tBeban sewa \t\t\t\t\t\tRp. 1.200.000,-\n",
                "Sewa di bayar dimuka\t\t\t Rp. 500.000,-\n" +
                        "\t\t\tKas \t\t\t\t\t\t\tRp. 500.000,-\n"
            ),
            //11
            arrayOf("Peralatan", "Modal Awal", "Laba Bersih", "Rugi Bersih", "Prive"),
            //12
            arrayOf("Prive", "Beban Gaji", "Pendapatan Jasa", "Penjualan", "Kas"),
            //13
            arrayOf("Faktur Pembelian", "Kwitansi", "Nota", "Faktur Penjualan", "Cek"),
            //14
            arrayOf("Harta Lancar", "Harta Tetap", "Utang Lancar", "Modal", "Utang Jangka Panjang"),
            //15
            arrayOf(
                "Kas \t\t\t\t\tRp. 500.000,-\n" +
                        "\t\t\tPiutang dagang \t\t\t\t\tRp. 1.000.000,-\n" +
                        "\t\t\tPenjualan \t\t\t\t\t\tRp. 1.500.000,-\n",
                "Kas \t\t\t\t\tRp. 1.500.000,-\n" +
                        "\t\t\tPenjualan \t\t\t\t\t\tRp. 1.500.000,-\n",
                "Piutang dagang \t\t\tRp. 1.500.000,-\n" +
                        "\t\t\tPenjualan \t\t\t\t\t\tRp. 1.500.000,-\n",
                "Penjualan\t\t\t\t Rp. 1.500.000,-\n" +
                        "\t\t\tKas\t\t\t\t\t\t\t Rp. 1.000.000,-\n" +
                        "\t\t\tPiutang dagang \t\t\t\t\t Rp. 500.000,-\n",
                "Kas \t\t\t\t\tRp. 1.000.000,-\n" +
                        "\t\t\tPiutang dagang\t\t\t\t\t Rp. 500.000,-\n" +
                        "\t\t\tPenjualan\t\t\t\t\t\t Rp. 1.500.000,-\n"
            ),
            //16
            arrayOf(
                "Jurnal Penutup",
                "Jurnal Pembalik",
                "Jurnal Penerimaan Kas",
                "Jurnal Neraca Sisa setelah Penutupan",
                "Jurnal Pembantu"
            ),
            //17
            arrayOf(
                "Cash Receipts Journal",
                "Cash Payments Journal",
                "Purchases Journal",
                "Sales Journal",
                "General Journal"
            ),
            //18
            arrayOf(
                "Kas\t\t\t\t\t\tRp 200.000\n" +
                        "Beban listrik, air dan telefon\t\t\t\t\tRp 200.000\n",
                " Beban listrik, air dan telefon\t\t\tRp 200.000\n" +
                        "Kas\t\t\t\t\t\t\t\tRp 200.000\n",
                "Utang beban\t\t\t\t\tRp 200.000\n" +
                        "Beban listrik, air dan telefon\t\t\t\t\tRp 200.000\n",
                " Beban listrik, air dan telefon\t\t\tRp 200.000\n" +
                        "Utang beban\t\t\t\t\t\t\tRp 200.000\n",
                "Kas \t\t\t\t\t\tRp 200.000\n" +
                        "Utang beban\t\t\t\t\t\t\tRp 200.000\n"
            ),
            //19
            arrayOf(
                "Jurnal pengeluaran kas",
                "Jurnal penerimaan kas",
                "Jurnal pembelian",
                "Jurnal penyesuaian",
                "Jurnal penutup"
            ),
            //20
            arrayOf(
                "Hak cipta",
                "Merek dagang",
                "Hak pemegang sewa",
                "Hak monopolis",
                "Hak promosi"
            )
        )
    var jawabanBenar = arrayOf(
        //1
        "Harta = Kewajiban + Modal",
        //2
        "Neraca",
        //3
        "Aktiva, Kewajiban, dan Ekuitas",
        //4
        "Rp. 65.000.000,-",
        //5
        "Kas \t\t\tRp. 1.500.000,-\n" +
                "Biaya gaji \t\t\t\t\tRp. 1.500.000,-\n",
        //6
        "Pendapatan",
        //7
        "Rp. 4.000.000,-",
        //8
        "Membuat Neraca Saldo",
        //9
        "Perusahaan Dagang",
        //10
        "Sewa di BM \t\t\t\tRp. 500.000,-\n" +
                "\t\t\tBeban sewa \t\t\t\t\t\tRp. 500.000,-\n",
        //11
        "Peralatan",
        //12
        "Kas",
        //13
        "Nota",
        //14
        "Harta Tetap",
        //15
        "Kas \t\t\t\t\tRp. 500.000,-\n" +
                "\t\t\tPiutang dagang \t\t\t\t\tRp. 1.000.000,-\n" +
                "\t\t\tPenjualan \t\t\t\t\t\tRp. 1.500.000,-\n",
        //16
        "Jurnal Penerimaan Kas",
        //17
        "Purchases Journal",
        //18
        " Beban listrik, air dan telefon\t\t\tRp 200.000\n" +
                "Kas\t\t\t\t\t\t\t\tRp 200.000\n",
        //19
        "Jurnal pengeluaran kas",
        //20
        "Merek dagang"
    )

    fun getPertanyaan(x: Int): String? {
        return pertanyaan[x]
    }

    fun getPilihanJawaban1(x: Int): String? {
        return pilihanJawaban[x][0]
    }

    fun getPilihanJawaban2(x: Int): String? {
        return pilihanJawaban[x][1]
    }


    fun getPilihanJawaban3(x: Int): String? {
        return pilihanJawaban[x][2]
    }

    fun getPilihanJawaban4(x: Int): String? {
        return pilihanJawaban[x][3]
    }

    fun getPilihanJawaban5(x: Int): String? {
        return pilihanJawaban[x][4]
    }

    fun getJawabanBenar(x: Int): String? {
        return jawabanBenar[x]
    }
}