package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int currentStory;

    private int[] mStoryID = new int[] {R.string.T1_Story, R.string.T2_Story, R.string.T3_Story, R.string.T4_End, R.string.T5_End, R.string.T6_End};
    private int[] mTopText = new int[] {R.string.T1_Ans1, R.string.T2_Ans1, R.string.T3_Ans1};
    private int[] mBtmText = new int[] {R.string.T1_Ans2, R.string.T2_Ans2, R.string.T3_Ans2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        mStoryTextView.setText(mStoryID[0]);
        mButtonTop.setText(mTopText[0]);
        mButtonBottom.setText(mBtmText[0]);
        currentStory = 0;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStory == 0) {
                    currentStory = 2;
                    mStoryTextView.setText(mStoryID[currentStory]);
                    mButtonTop.setText(mTopText[currentStory]);
                    mButtonBottom.setText(mBtmText[currentStory]);
                } else if (currentStory == 2) {
                    currentStory = 5;
                    mStoryTextView.setText(mStoryID[currentStory]);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                } else if (currentStory == 1) {
                    currentStory = 2;
                    mStoryTextView.setText(mStoryID[currentStory]);
                    mButtonTop.setText(mTopText[currentStory]);
                    mButtonBottom.setText(mBtmText[currentStory]);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStory == 0) {
                    currentStory = 1;
                    mStoryTextView.setText(mStoryID[currentStory]);
                    mButtonTop.setText(mTopText[currentStory]);
                    mButtonBottom.setText(mBtmText[currentStory]);
                } else if (currentStory == 2) {
                    currentStory = 4;
                    mStoryTextView.setText(mStoryID[currentStory]);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                } else if (currentStory == 1) {
                    currentStory = 3;
                    mStoryTextView.setText(mStoryID[currentStory]);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });

    }
}
