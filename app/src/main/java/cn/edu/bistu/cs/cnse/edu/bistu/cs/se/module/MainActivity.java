package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.module;

import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
 import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Button button=(Button)findViewById(R.id.btn_enter);
        final TextView txtResult=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtResult.setText(Integer.parseInt(txtResult.getText() + "") + 1 + "");
            }
        });
        }
    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);
        switch(view.getId()) {
            case R.id.checkBox1:
                if(checked){
                    textView.setText("123");
                }
                break;
            case R.id.checkBox2:
                if(checked){
                    textView.setText("456");
                }


        }
    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    textView.setText("1234");
                break;
            case R.id.radioButton2:
                if (checked)
                    textView.setText("5678");
                break;
        }
    }

}