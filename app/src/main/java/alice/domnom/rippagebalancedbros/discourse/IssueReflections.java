package alice.domnom.rippagebalancedbros.discourse;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class IssueReflections extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_reflections);
        linearLayout = (LinearLayout) findViewById(R.id.reflection_list);

        CardView card = createCard("What can I say, shouldv gotta mac.", "the bros", 5);
        addCardToList(card);

        CardView card2 = createCard("What can I say, should have swerggled gotta mac. as;dfl kjas;ldfjk al;ksdj fl;akdf lkajsd ;flkjas;dl fkjas ;dlfkj a;sldfjk;alksdf", "the bros", 5);
        addCardToList(card2);
    }



    public CardView createCard(String message, String user, int numLoves) {
        CardView card = new CardView(getApplicationContext());

        // Set the CardView layoutParams
        LayoutParams params = new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT
        );
        // L T R B

        int px15 = spToPx(15);

        params.setMargins(px15, 0, px15, px15);
        card.setLayoutParams(params);

        card.setRadius(1);
        // L T R B
        //card.setContentPadding(px15, 0, px15, 0);
        card.setCardBackgroundColor(Color.parseColor("#ffffff"));
        card.setMaxCardElevation(15);
        card.setCardElevation(9);

        // Initialize a new TextView to put in CardView
        TextView tv = new TextView(getApplicationContext());
        //params.setMargins(0, 0, 0, 0);
        tv.setTextColor(Color.rgb(83,85,85));
        tv.setLayoutParams(params);
        tv.setPadding(px15, px15, px15, px15);
        tv.setText(message);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
        card.addView(tv);

        return card;
    }

    public void addCardToList(CardView card) {
        linearLayout.addView(card);
    }

    private int spToPx(int sp) {
        Resources r = getApplicationContext().getResources();
        int px = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP,
                sp,
                r.getDisplayMetrics()
        );
        return px;
    }
}
