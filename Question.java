interface Question {
    public String getQuestionPrompt();
    public String getPossibleAnswers();
    public String getPromptAndAnswers();
    public String getAnswerByIdx(int index);

    public int[] getCorrectAnswerIdx();
    public boolean isCorrectAnswer(int index);
    public String[] getCorrectAnswers();

}
