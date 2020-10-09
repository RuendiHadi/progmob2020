package ukdw.com.progmob_2020.Pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ukdw.com.progmob_2020.Adapter.MahasiswaCardAdapter;
import ukdw.com.progmob_2020.Adapter.MahasiswaRecyclerAdapter;
import ukdw.com.progmob_2020.Model.Mahasiswa;
import ukdw.com.progmob_2020.R;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        RecyclerView rv = (RecyclerView)findViewById(R.id.cvLatihan);
        MahasiswaCardAdapter mahasiswaCardAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //generate data mahasiswa
        Mahasiswa m1 = new Mahasiswa("Ruendi", "72180255","081234567897");
        Mahasiswa m2 = new Mahasiswa("Dito", "72180255","081234567897");
        Mahasiswa m3 = new Mahasiswa("Yose", "72180255","081234567897");
        Mahasiswa m4 = new Mahasiswa("Hakkel", "72180255","081234567897");
        Mahasiswa m5 = new Mahasiswa("Julio", "72180255","081234567897");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

        mahasiswaCardAdapter = new MahasiswaCardAdapter(CardActivity.this);
        mahasiswaCardAdapter.setMahasiswaList(mahasiswaList);

        rv.setLayoutManager(new LinearLayoutManager(CardActivity.this));
        rv.setAdapter(mahasiswaCardAdapter);


    }

}