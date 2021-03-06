
package fr.epita.quiz.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * This class is dealing with the MCQChoice Entity
 *
 * @author  THEJUS
 *
 */

@Entity
public class MCQChoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String choice;
	private boolean valid;

	@Column(name = "MCQCHOICE_ORDER")
	private int order;

	@ManyToOne
	private Question question;

	/**
	 *
	 */
	public MCQChoice() {

	}

	/**
	 * @return the choice
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * @param choice
	 *            the choice to set
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @param valid
	 *            the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	@Override
	public String toString() {
		return "MCQChoice [id=" + id + ", choice=" + choice + ", valid=" + valid + ", order=" + order + ", question="
				+ question + "]";
	}

}
