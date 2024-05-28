package com.tec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="questionId")
private int questionid;
private String Question;
@OneToOne
private Answer answer;
public Question(int questionid, String question, Answer answer) {
	super();
	this.questionid = questionid;
	Question = question;
	this.answer = answer;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return Question;
}
public void setQuestion(String question) {
	Question = question;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}

}
