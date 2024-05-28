package com.tec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name="Answer_id")
private int answerId;

private String Answer;
@OneToOne
private Question question;
public Answer(int answerId, String answer) {
	super();
	this.answerId = answerId;
	Answer = answer;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}

public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return Answer;
}
public void setAnswer(String answer) {
	Answer = answer;
}

}
