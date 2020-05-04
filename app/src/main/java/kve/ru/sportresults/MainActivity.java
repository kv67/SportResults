package kve.ru.sportresults;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

  private RecyclerView recyclerView;
  private ScoreAdapter adapter = new ScoreAdapter();
  ;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.rvMain);
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

    initData();
  }

  private void initData() {
    adapter.addScore(new Score(1, "Спартак", "1:0", "Динамо", "01.02.20"));
    adapter.addScore(new Score(2, "Химки", "78:63", "ЦСКА", "02.02.20"));
    adapter.addScore(new Score(3, "Зенит", "3:0", "Факел", "03.02.20"));
  }

}
