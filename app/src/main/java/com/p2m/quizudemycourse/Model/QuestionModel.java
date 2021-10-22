package com.p2m.quizudemycourse.Model;

public class QuestionModel {

    private int answerId;
    private boolean answerTrue;

    public QuestionModel(int answerId, boolean answerTrue) {
        this.answerId = answerId;
        this.answerTrue = answerTrue;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.answerTrue = answerTrue;
    }
}
