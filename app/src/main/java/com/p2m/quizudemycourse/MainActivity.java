package com.p2m.quizudemycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.p2m.quizudemycourse.Model.QuestionModel;
import com.p2m.quizudemycourse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final QuestionModel[] questionBank= new QuestionModel[]{
        new QuestionModel(R.string.q1,false)
        ,new QuestionModel(R.string.q2,true)
        ,new QuestionModel(R.string.q3,true)
        ,new QuestionModel(R.string.q4,false)
        ,new QuestionModel(R.string.q6,true)
        ,new QuestionModel(R.string.q7,false)
        ,new QuestionModel(R.string.q8,true)
    };

    private ActivityMainBinding binding;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView.setText(questionBank[0].getAnswerId());

        prevAndNextBtn();
    }

    private void prevAndNextBtn() {
        binding.nextBtn.setOnClickListener(v -> {
            if (i<questionBank.length-1){
                i++;
            }else {
                i=0;
            }
            updateQuestion();

        });

        binding.prevBtn.setOnClickListener(v -> {
            if (i>0){
                i--;
                updateQuestion();
            }
        });
    }

    private void updateQuestion() {
        binding.textView.setText(questionBank[i].getAnswerId());
    }
}