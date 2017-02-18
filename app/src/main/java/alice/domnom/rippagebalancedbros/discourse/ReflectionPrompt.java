package alice.domnom.rippagebalancedbros.discourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReflectionPrompt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflection_prompt);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.reflectionQuestion);
        textView.setText("What is something meaningful you heard from the other person?");
    }
}
