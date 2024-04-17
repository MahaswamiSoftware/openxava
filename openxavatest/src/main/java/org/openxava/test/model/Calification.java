package org.openxava.test.model;

import java.math.*;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Calification {
	
	BigDecimal oralTestQ1;
	BigDecimal paperTestQ1;
	BigDecimal midtermExamQ1;
	
	BigDecimal oralTestQ2;
	BigDecimal paperTestQ2;
	BigDecimal midtermExamQ2;
	
	BigDecimal oralTestQ3;
	BigDecimal paperTestQ3;
	BigDecimal midtermExamQ3;
	
	BigDecimal anualAverage;
	BigDecimal finalExam;
	
}
