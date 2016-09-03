package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.Button);
        final TextView textView=(TextView)findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText());
            }
        });
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    textView.setText("3874922");
                break;
            case R.id.radioButton2:
                if (checked)
                    textView.setText("387489");
                break;
        }
    }
    public void onCheckBoxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        TextView textView = (TextView) findViewById(R.id.textView);
        switch (view.getId()) {
            case R.id.checkBox1:
                if (checked)
                    textView.setText("1234567");
                break;
            case R.id.checkBox2:
                if (checked)
                    textView.setText("7384921");
                break;
        }
    }}


