package coatocl.exaatocl.picassoimageloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                no need to give any kind of location at get
                Picasso.get().load("https://picsum.photos/200").placeholder(R.drawable.ic_launcher_background)
                        .error(R.drawable.ic_warning_black_24dp).into(imageView);

            }
        });
    }
}
