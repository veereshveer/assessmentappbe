package assessment.app.assessmentappbe.Dao.model;

import javax.persistence.*;

@Entity
@Table(name = "options")
public class Options {

    @Id
    @SequenceGenerator(name = "optionIdGen", initialValue = 1)
    @GeneratedValue(generator = "optionIdGen")
    @Column(name = "option_id")
    private Integer optionId;

    @Column(name = "option_name")
    private String optionName;

    @Column(name = "option_value")
    private String optionValue;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "opt_question_id", referencedColumnName = "Question_Id")
    private Question question;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
