package adet.toast.t174.sepres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view){
        EditText etName = findViewById(R.id.yourName);
        TextView message = findViewById(R.id.message);

        message.setText("Hello " + etName.getText() + "!");
        System.out.println("Name: " + etName.getText());
        Toast.makeText(this, "Hello " + etName.getText() + "!", Toast.LENGTH_SHORT).show();
    }
}