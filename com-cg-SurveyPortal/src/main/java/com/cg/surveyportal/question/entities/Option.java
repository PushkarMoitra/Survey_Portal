package com.cg.surveyportal.question.entities;

import javax.persistence.Embeddable;

/**
 * not an entity class read about @Embeddable
 */

@Embeddable

public class Option {
    private Integer index;
    private String optionText;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

}
