package com.bluohazard.aplikasidoaharianmuslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bluohazard.aplikasidoaharianmuslim.Adapter.DaftarAdapter;
import com.bluohazard.aplikasidoaharianmuslim.Model.Daftar;

import java.util.ArrayList;
import java.util.List;

public class DzikirSoreActivity extends AppCompatActivity implements DaftarAdapter.OnDaftarClickListener {
    public RecyclerView rv;
    public DaftarAdapter daftarAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Daftar> listDaftar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_sore);

        rv = findViewById(R.id.rvList);

        // Isti'adzah
        listDaftar.add(new Daftar(
                "[1] Isti'adzah",
                "( Dibaca 1x )",
                "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ",
                "Aku berlindung kepada Allah dari godaan syaitan yang terkutuk."));

        // Ayat Kursi
        listDaftar.add(new Daftar(
                "[2] Ayat Kursi",
                "( Dibaca 1x )",
                "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
                "Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar."));

        // Al-Ikhlas
        listDaftar.add(new Daftar(
                "[3] Surat Al-Ikhlas",
                "( Dibaca 3x )",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                        "\n" +
                        "قُلْ هُوَ اللَّهُ أَحَدٌ اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌِ",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4)"));

        // Al-Falaq
        listDaftar.add(new Daftar(
                "[4] Surat Al-Falaq",
                "( Dibaca 3x )",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                        "\n" +
                        "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. (QS. Al Falaq: 1-5)"));

        // An-Naas
        listDaftar.add(new Daftar(
                "[5] Surat An-Naas",
                "( Dibaca 3x )",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                        "\n" +
                        "قُلْ أَعُوذُ بِرَبِّ النَّاسِ مَلِكِ النَّاسِ إِلَهِ النَّاسِ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ مِنَ الْجِنَّةِ وَ النَّاسَِ",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” (QS. An Naas: 1-6)"));

        // [6]
        listDaftar.add(new Daftar(
                "[6]",
                "( Dibaca 1x )",
                "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لاَ إِلَـٰهَ إِلاَّ اللَّهُ، وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرٌ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هَـٰذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هَـٰذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
                "“Kami telah memasuki waktu sore dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada sesembahan yang berhak disembah kecuali Allah, Yang Maha Esa, tiada sekutu bagiNya. Bagi-Nya kerajaan dan bagiNya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu. Hai Tuhan, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Tuhan, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Tuhan, aku berlindung kepadaMu dari siksaan di Neraka dan kubur.”"));

        // [7]
        listDaftar.add(new Daftar(
                "[7]",
                "( Dibaca 1x )",
                "اَللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ، وَإِلَيْكَ الْمَصِيْرُ",
                "“Ya Allah, dengan rahmat dan pertolonganMu kami memasuki waktu sore, dan dengan rahmat dan pertolonganMu kami memasuki waktu pagi. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepadaMu tempat kembali (bagi semua makhluk).”"));

        // [8] Sayyidul Istighfar
        listDaftar.add(new Daftar(
                "[8] Sayyidul Istighfar",
                "( Dibaca 1x )",
                "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَُ",
                "“Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.”"));

        // [9]
        listDaftar.add(new Daftar(
                "[9]",
                "( Dibaca 3x )",
                "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـٰهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـٰهَ إِلاَّ أَنْتَ",
                "“Ya Allah, selamatkan tubuhku (dari penyakit dan yang tidak aku inginkan). Ya Allah, selamatkan pendengaranku (dari penyakit dan maksiat atau sesuatu yang tidak aku inginkan). Ya Allah, selamatkan penglihatanku, tidak ada sesembahan yang berhak disembah kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepadaMu dari kekufuran dan kefakiran. Ya Allah, aku berlindung kepadaMu dari siksa kubur, tidak ada sesembahan yang berhak disembah kecuali Engkau.”"));

        // [10]
        listDaftar.add(new Daftar(
                "[10]",
                "( Dibaca 1x )",
                "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ",
                "“Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).”"));

        // [11]
        listDaftar.add(new Daftar(
                "[11]",
                "( Dibaca 1x )",
                "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ",
                "“Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.”"));

        // [12]
        listDaftar.add(new Daftar(
                "[12]",
                "( Dibaca 3x )",
                "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
                "“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.”"));

        // [13]
        listDaftar.add(new Daftar(
                "[13]",
                "( Dibaca 3x )",
                "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّاُ",
                "“Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.”"));

        // [14]
        listDaftar.add(new Daftar(
                "[14]",
                "( Dibaca 1x )",
                "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًاُ",
                "“Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).”"));

        // [15]
        listDaftar.add(new Daftar(
                "[15]",
                "( Dibaca 1x )",
                "أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ، وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ",
                "“Di waktu sore kami berada di atas fitrah Islam, kalimat ikhlas, agama Nabi kami Muhammad, dan agama ayah kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.”"));

        // [16]
        listDaftar.add(new Daftar(
                "[16]",
                "( Dibaca 1x, 10x , 100x ( 100x dalam sehari ) )",
                "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
                "“Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.”"));

        // [17]
        listDaftar.add(new Daftar(
                "[17]",
                "( Dibaca 100x )",
                "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
                "“Maha suci Allah, aku memuji-Nya.”"));

        // [18]
        listDaftar.add(new Daftar(
                "[18]",
                "( Dibaca 100x di pagi hari atau sore hari )",
                "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِِ",
                "“Aku memohon ampun kepada Allah dan bertobat kepada-Nya.”"));

        // [19]
        listDaftar.add(new Daftar(
                "[19]",
                "( Dibaca 3x )",
                "أَعُوْذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَِِ",
                "“Aku berlindung dengan kalimat-kalimat Allah yang sempurna, dari kejahatan makhluk yang diciptakanNya.”"));


        daftarAdapter = new DaftarAdapter(listDaftar);
        daftarAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(daftarAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position) {
        Daftar daftar = listDaftar.get(position);
        Toast.makeText(this, daftar.getTitle(), Toast.LENGTH_LONG)
                .show();
    }
}
