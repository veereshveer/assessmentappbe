package assessment.app.assessmentappbe.Dao.model;

import javax.persistence.*;
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @SequenceGenerator(name = "answerIdGen", initialValue = 1)
    @GeneratedValue(generator = "answerIdGen")
    @Column(name = "Answer_Id")
    private Integer answerId;

    @Column(name = "Answer")
    private String answer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ans_question_id", referencedColumnName = "Question_Id")
    private Question question;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public void setQuestion(Question question) {
        this.question = question;
    }
}
