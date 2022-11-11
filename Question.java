interface Question {
    public String getQuestionPrompt();
    public String getAnswerByIdx(int index);
    public String getPossibleAnswers();

    public int[] getCorrectAnswerIdx();
    public boolean isCorrectAnswer(int index);
}
